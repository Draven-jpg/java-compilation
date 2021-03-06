/*
 * toString Program
 */
class Date{
	private int month;
	private int day;
	private int year;
	
	public Date(int m , int d , int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The Constructor for this is %s \n", this);
	}
	
	public String toString() {
		return String.format("%02d/%02d/%02d", month, day, year);
	}
}
public class root41 {
	public static void main (String[] args) {
		Date dateobj = new Date(1,5,21);
		
		
		
	}
}
