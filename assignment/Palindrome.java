package week3.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) rev = rev+str.charAt(i);
		
		if (str.equals(rev))
			System.out.println(String.format("%s is a palindrome", str));
		else
			System.out.println(String.format("%s is not a palindrome", str));

	}

}

/*
 * Pseudo Code
 * 
 * a) Declare A String value as"madam"
 * 
 * b) Declare another String rev value as "" c) Iterate over the String in
 * reverse order d) Add the char into rev e) Compare the original String with
 * the reversed String, if it is same then print palinDrome
 * 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
 */