package Chapter1.Chapter1_1;

public class Ex1_12 {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i<10; i++)
		{
			a[i] = 9-i;
			System.out.println("a["+i+"]: "+a[i]);
/*
a[0]: 9
a[1]: 8
a[2]: 7
a[3]: 6
a[4]: 5
a[5]: 4
a[6]: 3
a[7]: 2
a[8]: 1
a[9]: 0
*/
		}
		for (int i = 0; i<10; i++)
		{
			a[i] = a[a[i]];
			System.out.println(a[i]);
/*
0
1
2
3
4
4
3
2
1
0
 */
		}
		
		for (int i = 0; i<10; i++)
			System.out.println(i);
/*
0
1
2
3
4
5
6
7
8
9
 */
	}

}
