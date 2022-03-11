package week3.assignment;

public class CharOccurence {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";
		char search = 'e';

		// declare and initialize a variable count to store the number of occurrences
		int occur = 0;
		
		// traverse from 0 till the array length
		for (int i = 0; i < str.length(); i++) {
			// Check the char array has the particular char in it

			if (str.charAt(i) == search)
				// if is has increment the count
				occur++;
		}
		// print the count out of the loop

		System.out.println("The character " + search + " occurs " + occur + " times ");

	}

}
