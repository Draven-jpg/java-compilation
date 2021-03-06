//Compound Averaging Program
//A= P(1+r)^ yr
//used math power to the n 
public class CompoundInterest {
	public static void main(String[] args) {
		double amount;
		double principal = 100;
		double rate = 0.10;
		
		for (int yr = 1 ; yr <=20 ; yr++) {
			amount = principal * Math.pow(1 + rate, yr);//solving amount
			System.out.println(yr + " year/s = " + Math.ceil(amount));
			
			
		}
	}
	
}
