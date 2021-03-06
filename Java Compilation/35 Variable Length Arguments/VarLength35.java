
public class VarLength35 {
	public static void main (String[] args) {
		System.out.println(passMultipleVariable(1,2,3,4,5,6,7,8,9,10));
	}
	//this method will pass multiple numbers in one variable instead of sepated number in different variable
	public static int passMultipleVariable(int...numbers) {
		int total = 0;
		for(int x : numbers) 
			total += x;//the sum of all numbers that we passed 
		
		return total/numbers.length;
		
		
	}
}
