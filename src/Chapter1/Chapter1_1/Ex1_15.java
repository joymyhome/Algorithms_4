package Chapter1.Chapter1_1;

import java.util.Random;
import java.util.Scanner;

public class Ex1_15 {
	
	private static int[] constructA(int M)
	{
		Random rand = new Random();
		
		int sizeA = rand.nextInt(50);
		int[] a = new int[sizeA];
		for(int i = 0; i < sizeA; i ++)
		{
			a[i] = rand.nextInt(M);
		}
		
		return a;
	}
	
	private static int[] histogram(int[] a, int M)
	{
		int[] result = new int[M];
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]>0 && a[i]<M)
				result[a[i]]++;
		}
		return result;
	}
	
	private static int summation(int[] b)
	{
		int size = b.length;
		int sum = 0;
		for(int i = 0; i < size; i ++)
		{
			sum += b[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Give a number to M: ");
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		scan.close();
		int[] a = constructA(M);
		int[] result = histogram(a, M);
		int sum = summation(result);
		if(sum == a.length)
			System.out.println("sum is equal a.length");
		else
			System.out.println("sum is not equal a.length");
		
		
		

	}

}
