//
//This program will pass the array in another method!
//
/*
public class bucky {
	public static void main(String[] args) {
		int array[] = {1,5,3,2,6,7,9};
		passingArray(array);
		
		for(int z:array)
			System.out.println(z);
	}
	
	public static void passingArray(int x[]) {
		
		for(int counter=0;counter<x.length;counter++) {
			x[counter]+=5;
		}
	}
}
*/
import java.util.Scanner;
public class bucky{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array =" );
		int size=sc.nextInt();
		
		int array[] =new int[size];
		int total = 0, input;
		for(int scan=0;scan<array.length;scan++) {
			System.out.print("Enter the element in index ["+scan+"] =");
			input=sc.nextInt();
			array[scan]=input;
		}
		
		for(int scan=0;scan<array.length;scan++) {
			System.out.print(array[scan]+" ");
		}
		System.out.println("");
		passingArray(array);
		
		for (int y:array) {
			total+=y;
			System.out.println(y);
		}
		
		System.out.println("The total is "+total);
		sc.close();
	}
	
	public static void passingArray(int array[]) {
		for(int counter=0;counter<array.length;counter++) {
			array[counter]+=20;
		}
	}
}