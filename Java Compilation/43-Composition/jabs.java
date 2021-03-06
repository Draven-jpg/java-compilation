/*
 * This is Composition Program
 */

//main class
public class jabs {
	public static void main(String[] args) {
		Date dateObj = new Date(4,6,1);// object for date class
		Bday bdayObj = new Bday("Angelo", dateObj);//passing two parameter the first 1 is String and the second is object
		
		System.out.println (bdayObj);//printing all info
		
	}
}
//class for my name and birthday using composition
class Bday{
	private String name;
	private Date birthday;
	//constructor
	public Bday(String theName, Date theBirthday) {
		name = theName;
		birthday = theBirthday;
	}
	//toString method
	public String toString() {
		return String.format("My Name is %s and my birthday is %s", name, birthday);
	}
	
}
//class for my birthday
class Date{
	private int month;
	private int day;
	private int year;
	
	public Date(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor this is %s", this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}
