package Chapter1.Chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_3 {
	public static void main(String[] args){
		
		StdOut.println("Print 3 integers: ");
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		
		isEqual(a, b, c);
	}
	private static void isEqual(int aa, int bb, int cc)
	{
		if(aa == bb && aa == cc)
			StdOut.print("Equal");
		else
			StdOut.print("Not equal");
			
	}

}
