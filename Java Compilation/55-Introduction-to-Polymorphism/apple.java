/* 
 * this  tutorial is introduction to polymorphism
 
class apple {// this is my main class
	public static void main(String[] args) {
		food bucky[] = new food [2];
		bucky[0] = new potpie();
		bucky[1] = new tuna();
		
		for(int x=0;x<2;++x) {
			bucky[x].eat();
		}
	}
}

class potpie extends food {//subclass of food
	
	void eat() {
		System.out.println("This potpie is great!");
	}
}
class tuna extends food {//subclass of food 
	
	void eat() {
		System.out.println("This tuna is great!");
	}
}
class food{//superclass which we can access the subclass
	 
	void eat() {
		System.out.println("This food is great!");
	}
}

*/
/*
 * this tutorial is  56 java tutorial
 */
class apple {// this is my main class
	public static void main(String[] args) {
		
		fatty bucky = new fatty();
		// we create an object named bucky so we can use all the stuff in fatty class
		//and the  only  is digest method
		food fo = new food();
		food po = new potpie(); 
		
		bucky.digest(fo);
		bucky.digest(po);
	}
}

class potpie extends food {//subclass of food
	
	void eat() {
		System.out.println("This potpie is great!");
	}
}
class tuna extends food {//subclass of food 
	
	void eat() {
		System.out.println("This tuna is great!");
	}
}
 class food{//superclass which we can access the subclass
	
	void eat() {
		System.out.println("This food is great!");
	}
}

//when you pass super class it will automatically pass the subclass of the super class
class fatty{
	
	void digest(food x){
		x.eat();
	}
}
