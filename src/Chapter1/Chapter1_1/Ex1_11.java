package Chapter1.Chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_11 {

	private static void printBoolean(boolean[][] bMatrix)
	{
		StdOut.print(" ");
		
		for (int i = 0; i<bMatrix.length; i++)
			StdOut.print(i);
		StdOut.print('\n');
		
		for (int i = 0; i<bMatrix.length; i++)
		{
			StdOut.print(i);
			for(int j = 0; j<bMatrix[0].length; j++)
			{
				
				StdOut.print((bMatrix[i][j] == true)?" ":"*");
			}
		StdOut.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] matrix = {{false,true,true},{true, false, true},{true, true, false}};
		printBoolean(matrix);

	}
/*
 *output
 012
0*  
1 * 
2  *

*/

		

		
}
	

