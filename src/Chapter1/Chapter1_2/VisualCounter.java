package Chapter1.Chapter1_2;

import edu.princeton.cs.algs4.StdDraw;

public class VisualCounter{
 

	private int maxProcess;
	private int maxCounter;
	private int n;
	private int count;
	
	public VisualCounter(int N, int max)
	{
		maxProcess = N;
		maxCounter = max;
		n = 0;
		count = 0;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(-max, max);
		StdDraw.setPenRadius(0.02);
		StdDraw.point(0, 0);
	}
	
	public void increment() 
	{
		if(n < maxProcess && count < maxCounter)
			{
			 n++;
			 count++;
			 StdDraw.point(n, count);
			}
		else if(count >= maxCounter)
		{
			System.out.println("The number of counts has exceeded the max");
			return;
		}
		else
		{
			System.out.println("The number of process has exceeded the max process number");
			return;
		}
	}
	
	public void decrement()
	{
		if(n < maxProcess && count > 0)
		{
			count --;
			n ++;
			StdDraw.point(n, count);
		}
		else if(n>= maxProcess)
		{
			System.out.println("The number of process has exceeded the max process number");
			return;
		}
		else 
		{
			System.out.println("There is no more element");
		}
	}
	
	
	public int getCounter()
	{
		return count;
	}

	public static void main(String[] args) {
		VisualCounter counter = new VisualCounter(100, 50);
		for(int i = 0; i < 25; i ++)
			counter.increment();
		System.out.println(counter.getCounter());
		for(int i = 0; i < 10; i ++)
			counter.decrement();
		System.out.println(counter.getCounter());

	}


}
