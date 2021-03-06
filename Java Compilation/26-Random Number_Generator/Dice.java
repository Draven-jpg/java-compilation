//
// This program is to generate random number like a dice
//

import java.util.Random;//importing randoming number

public class Dice {
	public static void main (String[] args) {
		Random rand = new Random();// calling Random 
		int number;
		
		for (int counter = 1 ; counter <= 10 ; counter++) {//for loop
			number = 1 + rand.nextInt(6);//hanggang 5 lang kasama si zero kaya plus 1
			System.out.println(counter + "roll = " + number);
		}
	}
}
