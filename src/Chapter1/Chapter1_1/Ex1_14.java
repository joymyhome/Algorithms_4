package Chapter1.Chapter1_1;

import java.util.Scanner;

public class Ex1_14 {

	public static void main(String[] args) {
		System.out.print("Please input an integer > 2:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		log2(n);
	}
	
	private static void log2(int n)
	{
		int expo = 0;
		int result = 1;
		while(result < n/2+1)
		{
			result *= 2;
			expo += 1;
		}
		System.out.println("The maximum integer smaller than log2N = "+ expo);
	}

}
