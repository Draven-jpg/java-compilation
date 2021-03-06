/*
 * This is the main class of this inheritance
 * kadalasan ginagamit ang inheritance kapag may same kang ipriprint at the same time magkaibang class
 */
public class Menu {
	public static void main(String[] args) {
		fruits prutas = new fruits();
		meal mealobj = new meal();
		
		prutas.eat();
		mealobj.eat();
	}
}
