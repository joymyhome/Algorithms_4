package Chapter1.Chapter1_2;

import java.util.Scanner;

//判断是否是circular rotation
public class Ex2_6 {
	private static boolean isCircularRotation(String s, String t)
	{
		if(s.length() == t.length() && s.concat(s).indexOf(t) >=0)
			return true;
		else 
			return false;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Input two Strings: ");
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		String t = scan.nextLine();
		scan.close();
		System.out.print("If they are circular rotation? "+ isCircularRotation(s, t));
		
	}
}
