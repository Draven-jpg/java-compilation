
public class root {
	public static void main(String[] args) {
		int array[]= {7,4,8,3,6,9,2,4};//declaring array
		int total = 0;//declaring total where we sum of all array elements
		
		for(int x: array) {//looping the array
			total+=x;
			System.out.print(x+" ");
		}
		
		System.out.println("The total is "+total);
		
	}
}
