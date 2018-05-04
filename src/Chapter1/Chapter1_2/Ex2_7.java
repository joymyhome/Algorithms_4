package Chapter1.Chapter1_2;

import edu.princeton.cs.algs4.StdIn;

public class Ex2_7 {
	public static String mystery(String s) {
		int N = s.length();
		if (N <= 1) {
			return s;
		}
		String a = s.substring(0, N / 2);
		String b = s.substring(N / 2, N);
		return mystery(b) + mystery(a);  //reverse;
	}

	public static void main(String[] args) {
		System.out.println(mystery(StdIn.readLine()));
	}

}
