package Chapter1.Chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_7 {

	public static void main(String[] args) {
		double t = 9.0;
		while(Math.abs(t - 9.0/t) > .001)
		{
			t = (9.0/t + t) / 2.0;
			StdOut.printf("%.5f\n", t);
		}
		StdOut.printf("%.2f\n", t);

/* output
5.00000
3.40000
3.02353
3.00009
3.00
*/
		//1+2+3+...+999的总和
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			for(int j = 0; j < i; j++)
			sum++;

		StdOut.println(sum);//499500
		
		//i取了10次值，j取了1000次；10*1000
		int sum2 = 0;
		for(int i = 1; i< 1000; i *=2)
			for (int j = 0; j <1000; j++)
				sum2++;
		StdOut.println(sum2);//10000
	}
	
	
}
