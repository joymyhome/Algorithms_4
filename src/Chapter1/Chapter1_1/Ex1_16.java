package Chapter1.Chapter1_1;

public class Ex1_16 {
	public static String exR1(int n)
	{
		if( n<= 0) return "";  // base case要放在前面，否则会出现永远访问不到base case的问题。
		return exR1(n-3) + n + exR1(n-1) + n;
	}
	public static void main(String args[])
	{
		int n = 5;
		String result = exR1(n);
		System.out.print(result);
	}

}
//2112511432112345