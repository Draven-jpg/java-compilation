import java.util.Scanner; // import a scanner 

class index1{//this is my main class
	public static void main (String[] args) {	
		Scanner input = new Scanner(System.in);//call the scanner
		
		System.out.print("Input your name : ");
		String name = input.nextLine();//input a name from user
		
		index2 index2obj = new index2();// call the index2 class
		
		index2obj.greeting(name);//display the name with hello 
	}
}