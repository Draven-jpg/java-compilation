
public class node1 {//subclass of the method of root 
	private String girlName;//only this class can use this variable
	
	public void setName(String Name) {//method that will set the name of girlName
		girlName = Name;
	}
	
	public String getName() {//method that will get the name of girlName
		return girlName;
	}
	
	/*public void Display(){//method that will display the saying in output
		System.out.println("The first Girlfriend in my life is " + girlName);
	}*/
	
	public void Display() {//other method displaying output
		System.out.printf("The first Girlfriend in my life is %s", getName());
	}
	
}
