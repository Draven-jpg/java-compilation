import java.util.Scanner;//importing scanner

public class root {// the main class
	public static void main(String[] args) {//my main method
		Scanner inp = new Scanner(System.in);//calling Scanner that I imported
		
		System.out.println("Input your first girlfiend: ");//prompt for the input
		String name = inp.nextLine();//store the variable of the input
		
		node1 node1obj = new node1();//calling the node class
		
		node1obj.setName(name);//passing parameter to setName method
		
		node1obj.Display();//method of node1 class that will output the info
	}

}
