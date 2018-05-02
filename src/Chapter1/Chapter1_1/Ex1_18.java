package Chapter1.Chapter1_1;

public class Ex1_18 {

	public static int mystery(int a , int b)
	{
		if(b == 0) return 0;
		if(b % 2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2) + a;
	}
	public static void main(String[] args) {
		int test = mystery(2, 25);
		System.out.print(test);//50
		System.out.println();
		int test2 = mystery(3, 11);
		System.out.print(test2);//33

		

	}

}
