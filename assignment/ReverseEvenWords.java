package week3.assignment;

public class ReverseEvenWords {
	
	

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split1 = test.split("");
		for(int i = 0;i<split1.length;i++)
		
			if((i%2==0))
			{
				
				System.out.println(split1[i]);
				System.out.println(" ");
				
			}
			else
			{
		
		
		char[] charArray = split1[i].toCharArray();
			for(int j = charArray.length-1;j>=1;j--)
			{
				System.out.println(charArray[j]);
			}
			System.out.println(" ");
		}


	}	
}

/* Pseudo Code:

 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/

