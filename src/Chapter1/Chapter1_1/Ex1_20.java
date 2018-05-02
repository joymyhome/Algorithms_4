package Chapter1.Chapter1_1;

import java.util.Scanner;

public class Ex1_20 {

	public static double ln(long N)
	{
		//base case
		if(N == 1)
			return 0;
		return Math.log(N) + ln(N-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		scan.close();
		double result = ln(N);
		System.out.println(result);
	}
	//5
	//4.787491742782046

}
