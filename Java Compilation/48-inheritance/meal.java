/*
 * subclass
 */
public class meal extends fruits {
	
	// if you want to create another method that will overwrite the eat method inherting food class
	// you can actually copy paste the method in food class then add what you want to add you know
	// if you just want to lang naman like this 
	
	public void eat() {//overpowering/overwriting method in food class where you inherit this class
		System.out.println("I am the eat methods of meal");
	}

}
