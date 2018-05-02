package Chapter1.Chapter1_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex1_21 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String name;
		int score1;
		int score2;
		double d ;
		FileReader f = new FileReader("Ex1_21test.txt"); //如何从文件中读取data
		Scanner scan = new Scanner(f);
		while(scan.hasNextLine()){
			name = scan.next();
		    score1 = scan.nextInt();
			score2 = scan.nextInt();
			d = (double) score1/score2;//强制转换，两个整数相除得到double
			
			System.out.printf("%s, %d, %d, %.3f%n", name, score1, score2, d); //format打印格式。更多见evernote
			
		}
		scan.close();
		


	}

}
