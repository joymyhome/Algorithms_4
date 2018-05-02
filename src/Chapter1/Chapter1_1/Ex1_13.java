package Chapter1.Chapter1_1;

import java.util.Random;
import java.util.Scanner;


//Inverse a M*N matrix
public class Ex1_13 {
	
	private static int[][] transposeMatrix(int[][] mat)
	{
		int m = mat.length;//row
		int n = mat[0].length;//column
		
		int[][] matT = new int[n][m];
		for(int i = 0; i < n; i ++)
			for (int j = 0;j < m; j++)
				matT[i][j] = mat[j][i];
		return matT;
	}
	
	private static void printMatrix(int[][] mat)
	{
		int m = mat.length;
		int n = mat[0].length;
		System.out.println("The matrix is " + m + " * " + n);
		for(int i = 0; i < m; i++) 
		{
			for(int j = 0; j < n; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		System.out.print("Give a number to m and n: ");
		Scanner scan = new Scanner(System.in);
		int inputM = scan.nextInt();
		int inputN = scan.nextInt();
		scan.close();
		int[][] mat = new int[inputM][inputN];
		int[][] matT;
		Random random = new Random(System.currentTimeMillis());
		for(int i = 0; i < inputM; i++)
			for(int j = 0; j < inputN; j++)
				mat[i][j] = random.nextInt(100);
		
		printMatrix(mat);
		
		matT = transposeMatrix(mat);
		
		printMatrix(matT);
		
		
	}
       

}
/*
Give a number to m and n: 3 5
The matrix is 3 * 5
13 67 18 60 91 
25 83 70 9 30 
86 47 45 48 60 
The matrix is 5 * 3
13 25 86 
67 83 47 
18 70 45 
60 9 48 
91 30 60 
*/