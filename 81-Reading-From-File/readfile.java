import java.io.*;
import java.util.*;

public class readfile {
	
	private Scanner x;// we made variable x for scanner coz scanner also can read from file other than input of keyboard
	
	public void openFile() {
		try {
			x = new Scanner(new File("USA.txt"));// we read file from usa.txt
		}
		catch(Exception e) {
			System.out.println("There is an error !");
		}
	}
	
	public void readFile() {
		while(x.hasNext()) {
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n",a,b,c);
		}
	}
	
	public void closeFile() {
		x.close();
	}
}
