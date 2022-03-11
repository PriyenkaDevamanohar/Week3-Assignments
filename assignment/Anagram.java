package week3.assignment;

import java.util.Arrays;
//if they contain same set of characters but in different order.
public class Anagram {

	public static void main(String[] args) {
String text1="stops";
String text2="potss";

if(text1.length()==text2.length())
{
	System.out.println("Same length");
}
else
	System.out.println("Different length");
	char[] a1 = text1.toCharArray();
	char[] a2 = text2.toCharArray();
	Arrays.sort(a1);
	Arrays.sort(a2);
	boolean res = Arrays.equals(a1, a2);
	System.out.println( res);
	}
	
}
//*Declare a String 
//String text1 = "stops";
//*Declare another String
//String text2 = "potss"; 
//* a) Check length of the strings are same then (Use A Condition)
//* b) Convert both Strings in to characters
//* c) Sort Both the arrays
//* d) Check both the arrays has same value