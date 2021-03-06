/*
 * This program is example of constructor 
 * Set and Get Method
 */

//class for Setting the military time
class Tuna{
	//private -> only Tuna class can access this variable and it's called instance class
	private int hour;	
	private int minute;
	private int second;
	//this is constructor
	public Tuna() {
		this(0,0,0);
	}
	
	public Tuna(int h) {
		this(h,0,0);
	}
	
	public Tuna(int h, int m) {
		this(h,m,0);
	}
	
	public Tuna(int h, int m, int s){
		setTime(h,m,s);
	}
	//Set methods	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h) {
		hour = ((h>=0&&h<24)?h:h%24);
	}
	public void setMinute(int m ) {
		minute = ((m>=0&&m<60)?m:m%60);
	}
	public void setSecond(int s) {
		second = ((s>=0&&s<60)?s:s%60);
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d" ,getHour() ,getMinute() ,getSecond() );
	}
	
}
//main class
public class Bucky40 {
		public static void main (String[] args) {
			Tuna tunaobj = new Tuna();			//tuna object 1 for constructor
			Tuna tunaobj2 = new Tuna(5);		//tuna object 2 for constructor with 1 parameter
			Tuna tunaobj3 = new Tuna(6,12);		//tuna object 3 for constructor with 2 parameters
			Tuna tunaobj4 = new Tuna(25,70,3455);	//tuna object 4 for constructor with 3 parameters
			
		
			System.out.printf("%s\n", tunaobj.toMilitary());
			System.out.printf("%s\n", tunaobj2.toMilitary());
			System.out.printf("%s\n", tunaobj3.toMilitary());
			System.out.printf("%s\n", tunaobj4.toMilitary());
			
			
		}
}
