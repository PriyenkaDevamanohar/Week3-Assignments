package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
list.add(3);
list.add(2);

list.add(11);

list.add(4);

list.add(6);
list.add(7);
Collections.sort(list);
System.out.println(list);

Object second = list.get(list.size()-2);
System.out.println("The second Largest number is " + second);

	}

}
////Here is the input
//		int[] data = {3,2,11,4,6,7};
//
//		
//		/*
//		 Pseudo Code:
//		 1) Arrange the array in ascending order
//		 2) Pick the 2nd element from the last and print it
//		 */