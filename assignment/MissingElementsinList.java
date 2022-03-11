package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsinList {

	public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);

list.add(3);
list.add(4);
list.add(7);
list.add(6);
list.add(8);

Collections.sort(list);
int i;
for (i=list.get(0); i < list.size(); i++) {
	if(i!=list.get(i-1))
	{
		System.out.println("The missing number " + i);
		break;
	}
	
}


	}

}
//Here is the input
		//int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
