package week3.assignment;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		List<Integer> list1 = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(4);
		list.add(9);
		list.add(7);
		for (int i = 0; i <list.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				if(list.get(i)==list1.get(j))
				{
					System.out.println("The Intersection is " + list.get(i));
					
				}
			}
		}
	}
}
				
			
		

