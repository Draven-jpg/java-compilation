
public class root61 {
	public static void main (String[] args) {
		Animal[] thelist = new Animal[2];
		Dog d = new Dog();
		Fish f = new Fish();
		
		thelist[0]=d;
		thelist[1]=f;
			
		for (Animal x: thelist) {
			x.language();
		}
	}
}

class Animal{
	void language() {
		System.out.println("The animals don't make sounds, it's just our imagination");
	}
}

class Dog extends Animal{
	void language() {
		System.out.println("Barf Barf!");
	}
}

class Fish extends Animal{
	void language() {
		System.out.println("gulf sulf");
	}
}