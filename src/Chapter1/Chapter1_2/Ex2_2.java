package Chapter1.Chapter1_2;

import java.util.Scanner;

import edu.princeton.cs.algs4.Interval1D;

public class Ex2_2 {

	public static void main(String[] args) {
		System.out.print("Input an integer to N :");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println("N value is "+ N);
		double[][] couples = new double[N][2];
		Interval1D[] intervals = new Interval1D[N];
		
		//input N double couples
		System.out.println("Give " + N +" couple double numbers: ");
		for (int i = 0; i < N; i ++)
		{
			if (scan.hasNext())
			{
			couples[i][0] = scan.nextDouble();
			couples[i][1] = scan.nextDouble();
			intervals[i] = new Interval1D(couples[i][0], couples[i][1]);
			}
		}
		
		//if intersect
		for(int i = 0; i < N-1; i ++)
			for(int j = i+1; j < N; j++)
			{
				if(intervals[i].intersects(intervals[j]))
					System.out.println(intervals[i] + " intersects " + intervals[j]);
					
			}

	}

}
