package Chapter1.Chapter1_1;

public class C1_general {

	public static void main(String[] args)
	{
		//1.1.1
		float a = (0+15)/2;
		double b = 2.0e-6 * 100000000.1;
		double c = 2.0e-6;
		boolean d = true && false || true && true;
		System.out.println(a); //调用的是float.toString() 7.0
		System.out.println(b); //200.0000002
		System.out.println(c); //2.0E-6
		System.out.println(d); //true
		
		//1.1.2
		//float e = (float)(1+2.236)/2; float的表示方法。在java中默认使用的是double型
		//double型和float型的区别在于double型64位，float型32位，double精度更高。
		double e = (1+2.236)/2;
		double f = 1 + 2 + 3 + 4.0;
		System.out.println(e); //1.618
		System.out.println(f); //10.0
		System.out.println(4.1>=4);//true
		System.out.println(1+2+"3");//33 String
		
		
		
	}
}
