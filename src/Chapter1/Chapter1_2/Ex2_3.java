package Chapter1.Chapter1_2;

import java.util.Random;
import java.util.Scanner;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

public class Ex2_3 {
	public static void main(String[] args)
	{
		System.out.println("Input an Interger N, and give values to min and max (integers, min<max):");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int min = scan.nextInt();
		int max = scan.nextInt();
		scan.close();
		Random rand = new Random();
		StdDraw.setXscale(min, max);
		StdDraw.setYscale(min, max);
		
		Interval1D x;
		Interval1D y;
		Interval2D[] interval2d = new Interval2D[N];
		Point2D[] topleft = new Point2D[N];
		Point2D[] bottomright = new Point2D[N];
		double left;
		double right;
		double top;
		double bottom;
		
		for(int i= 0; i < N; i ++)
		{
			double a = rand.nextDouble()*(max-min) + min;
			double b = rand.nextDouble()*(max-min) + min;
			if(a<b)
			{
				left = a;
				right = b;
			}
				
			else
			{
				left = b;
				right = a;
			}
			x = new Interval1D(left, right);
				
			a = rand.nextDouble()*(max-min) + min;
			b = rand.nextDouble()*(max-min) + min;
			if(a<b)
			{
				top = b;
				bottom = a;
			}
			else
			{
				top = a;
				bottom = b;
			}
			y = new Interval1D(bottom, top);
			interval2d[i] = new Interval2D(x, y);
			topleft[i] = new Point2D(left, top);
			bottomright[i] = new Point2D(right, bottom);
			interval2d[i].draw();
		}
		
		int intersect = 0;
		int contains = 0;
		
		for(int i = 0; i < N-1; i ++)
			for(int j = i+1; j< N; j++)
			{
				
				if (interval2d[i].intersects(interval2d[j]))
					intersect ++;
			}
		
		for(int i = 0; i< N; i++)
			for(int j = 0; j< N;j++)
			{
				if( i!= j && interval2d[i].contains(topleft[j]) && interval2d[i].contains(bottomright[j]))
						contains++;
			}
		System.out.println("intersect: "+ intersect);
		System.out.println("contains: " + contains);
		
		
		
		
	}

}
