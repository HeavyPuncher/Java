import java.util.*;
import java.lang.*;
public class ChristmasDraw {

	public static Boolean searchArray(String[] array, String term) {  //this is a boolean function which can hold 2 parameters which is an array and a term

		for (int i = 0; i < array.length; i++) {
			if (array[i] == term) {
				return true; //this is saying that when the term matches it the array return it true if not return it false
			}
		}

		return false;

	}

	public static void main(String[] args) { //main function

		String[] couples = {"x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "x5", "y5"}; //this is all the couples that are in the draw

		String[] PreviousYear = {"y4", "x5", "x3", "x4", "y5", "y1", "y3", "y2", "x2", "x1"}; //this array holds last years couple but its exactly alligned with the first array "couples"
// the array couples[i] cant but for PreviousYear[i] in this array position
		String[] recipients = new String[10]; //this creates a brand new array which holds 10 positions, this is gonna hold the ones randomly selected.

		int rnd;

		for (int counter = 0; counter < 10; counter++) { //makes a random draw 10 times

			do {
				rnd = new Random().nextInt(9); //Picks a random position within the array
			} while ((couples[counter].charAt(1) == couples[rnd].charAt(1)) || (couples[rnd] == PreviousYear[counter]) || (searchArray(recipients, couples[rnd]) == true));
//The first part matches if the letter is the same or if they are a couple by using the charAt function which checks the SECOND letter of each person chosen
//Second part of a loop makes sure the first position in array "couples" doesn't match the identical position in the other array, this removes the exclusion of last year
//Third part checks that the recipients chosen are not picked again by checking the array recipients which stores the previous values
			recipients[counter] = couples[rnd]; //this adds the randomly picked person to the array

			System.out.print("(");
			System.out.print(couples[counter]);
			System.out.print(" will buy for ");
			System.out.print(recipients[counter]);
			System.out.print(")");
			System.out.println();

		}


	}

}









//import java.util.Random;
//public class ChristmasDraw {
//	public static void main(String[] args)
//	{
//		String [] array = {"x1","x2","x3","x4","x5","x6","x7","x8","x9","x10"};
//		Random random = new Random();
//		String [] array2 = {"y1","y2","y3","y4","y5","y6","y7","y8","y9","y10"};
//		
//		int select = random.nextInt(array.length);
//		System.out.println(array[select] + " will not buy for " + array2[select]);
//	}
//
//}
