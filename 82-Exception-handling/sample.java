import java.util.*;
public class sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1; 
		do {
			
			try {
				System.out.println("Enter First Number: ");
				int n1 = sc.nextInt();
				System.out.println("Enter Second Number: ");
				int n2 = sc.nextInt();
				int sum = n1/n2;
				System.out.println(sum);
				x=2;
			}
			catch(Exception e) {
				System.out.println("There's an Error, please try again !");
			}
		}while(x==1);
	}
}
