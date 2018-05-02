package Chapter1.Chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_9 {
	
	public static void main(String[] args) {
		//将一个正整数N用二进制表示饼转换为一个String类型的值s
		int input = StdIn.readInt();
		//java 自带的实现方法
		StdOut.println(Integer.toBinaryString(input));
		//另一种解法：
		String s = "";
		for(int n = input; n >0; n/=2)
			s = (n%2) + s;
		StdOut.println(s);
		

	}

}
