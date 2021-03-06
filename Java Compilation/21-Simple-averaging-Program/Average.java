

import java.util.Scanner;
public class Average {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade, i=0 , total = 0 , average;
		while (i < 10) {
			grade = sc.nextInt();
			total = total + grade;
			i++;
		}
		average = total / 10;
		System.out.println("Your average score is :" + average);
	}
}
