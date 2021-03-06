//idols class
class Idols {
	private String first;//instance variable for first name
	private String last ;// instance variable for last name 
	private static int count;//it can be visible by any object in main class, the static one 
	
	public Idols (String fn, String ln){
		first= fn;
		last = ln;
		count++;
		System.out.printf("Constructor for %s %s , members in the club : %d \n",first,last,count);
	}
	//47 more static
	
	public String  getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public static int getMembers() {
		return count;
	}
	
}
//main class
public class root46 {
	public static void main (String[] args) {
		Idols member1 = new Idols("Keanu", "Reeves");//first object
		Idols member2 = new Idols("Uzumaki","Naruto");//second object
		Idols member3 = new Idols ("Monkey","Luffy");//third object
		
		System.out.println();
		System.out.println(member1.getFirst()+member1.getLast()+member1.getMembers()
		);
	}
}
