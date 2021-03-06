/*
 * This is Enumeration Program
 */

import java.util.EnumSet;
// main method
public class root44 {
	public static void main (String[] args) {
		//print the enum class in array 
		for (sb grpno: sb.values())	//declare the sb class name: sb values() - (static)
			System.out.printf("%s\t%s\t\t%s\t%s\n",grpno, grpno.getName(),grpno.getDesc(),grpno.getOld());
		
		System.out.println("\nAnd now for the range of constants!!!\n");
		
		for (sb grpno: EnumSet.range(sb.sb2, sb.sb4))
			System.out.printf("%s\t%s\t%s\t%s\n", grpno, grpno.getName(),grpno.getDesc(), grpno.getOld());
		
	}
}

//sb class name

enum sb{
	//enumerating the south boys with 3 parameters
	//constant variable
	sb1("Isamo","oldest","25"),		
	sb2("Justine","preacher","21"),
	sb3("niko","celibacy","23"),
	sb4("emmanuel","passionated","20"),
	sb5("Angelo","programmer","19");
	
	//variable that takes 3 parametes in enum method
	
	private final String name;
	private final String desc;
	private final String old;
	// set constructor that allows to set variable to the enum description
	sb(String theName, String Description, String year){
		name = theName;
		desc = Description;
		old = year;
	}
	//return the  information that you set in variable
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public String getOld() {
		return old;
	}
}
