package Chapter1.Chapter1_2;

import java.util.Scanner;

import edu.princeton.cs.algs4.Point2D;

public class Ex2_1 {

	public static void main(String[] args) {
		System.out.print("Input an integer: ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		double x;
		double y;
		Point2D[] point = new Point2D[N];
		for (int i = 0; i < N; i++)
		{
			 x = Math.random();
			 y = Math.random();
			 point[i] = new Point2D(x, y);
			 point[i].draw();
			
		}
		if (N>1)
		{
		double minDistance = distance(point);
		System.out.println(minDistance);
		}
		
	}
	
	private static double distance(Point2D[] points)
	{
		int size = points.length;
		double min = points[0].distanceTo(points[1]);
		for (int i = 0; i<size-1; i ++)
			for(int j = i+1; j<size; j++)
			{
				if(points[i].distanceTo(points[j])<min)
					min = points[i].distanceTo(points[j]);
			}
		return min;
	}

}
//Input an integer: 100
//0.013434936576565281
