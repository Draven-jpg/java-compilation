import java.io.*;
import java.lang.*;
import java.util.*;

public class subclass {

	private Formatter x;
	
	public void OpenFile() {
		try {
			x = new Formatter("USA.txt");
			System.out.println("You Created a File");
		}
		catch(Exception e) {
			System.out.println("You have an Error");
		}
	}
	
	public void addRecords() {
		x.format("%s%s%s", "John "," Angelo"," Silvestre");
	}
	
	public void close() {
		x.close();
	}
}
