package Chapter1.Chapter1_1;

public class Ex1_19 {
	public static long F(int N)
	{
		if (N ==0) return 0;
		if (N == 1) return 1;
		long[] A = new long[1000];
		A[0] = 0;
		A[1] = 1;
		for (int i = 2; i < N+1; i ++)
		{
			A[i] = A[i-1] + A[i-2];
		}
		return A[N];
	}
	public static void main(String[] args)
	{
		int N= 80;
		System.out.print(F(N));//23416728348467685
	}
}
