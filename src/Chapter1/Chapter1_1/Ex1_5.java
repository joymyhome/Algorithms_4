package Chapter1.Chapter1_1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_5 {

	public static void main(String[] args) {
		StdOut.println("Input a number:");
		double input = StdIn.readDouble();
		
		if(input > 0 && input<1)
			StdOut.print("True");
		else
			StdOut.print("False");

	}

}