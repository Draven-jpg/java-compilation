/*
//introduction to arrays
//different to declare array
public class root {
	public static void main(String[] args) {
		//1st declaration
		//int arr[]= {2,4,6,8,10,12,14,16,18,20};
		//2nd declaration
		int array[]=new int[10];
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		array[5]=6;
		array[6]=7;
		array[7]=8;
		array[8]=9;
		array[9]=10;
		
		for(int i=0;i<10;i++) {
			System.out.println("array "+i+" = "+array[i]);
		}
	}
}
end of the comment */

/*
//creating table in array
public class root{
	public static void main(String[] args) {
		int array[] = {25,14,31,64,54};//declaration of array with assigning value
		
		System.out.println("index\tvalue");
		for (int counter = 0 ; counter<array.length ; counter ++) {
			System.out.println(counter+"\t"+array[counter]);
		}
	}
}
*/

/*
//summing all array
class root{
	public static void main(String[] args) {
		int array[] = {14,23,65,99,23};
		int sum=0;
		
		for(int counter=0;counter<array.length;counter++) {
			sum = sum + array[counter];
		}
		System.out.println("The sum of array is "+sum);
	}
}
*/

/*
//Programming Tutorial 30-Array Elements as Counters
import java.util.Random;

class root {
	public static void main(String[] args) {
		Random rand = new Random();//calling random
		int freq[] = new int[7];//declaration of array
		
		for(int roll=0;roll<10000;roll++) {//the digits in element is based on the length of the ["roll<10000"]
			++freq[1+rand.nextInt(6)];//in this zero is not belong
		}
		
		System.out.println("Index\tElements");//labeling
		
		for(int index=1;index<freq.length;index++) {
			System.out.println(index+"\t"+freq[index]);//outputing data
		}
	}
}
*/

