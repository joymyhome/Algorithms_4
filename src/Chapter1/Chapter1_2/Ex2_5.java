package Chapter1.Chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Ex2_5 {
	public static void main(String[] args) {
		String s = "Hello World";
		s.toUpperCase();
		s.substring(6, 11);
		StdOut.println(s);
		//Hello World
		s = s.toUpperCase();
		s = s.substring(6, 11);
		StdOut.println(s);
		//WORLD
	}

}
