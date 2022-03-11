package week3.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20));
	

		
		for (int i = 0; i < l.size()- 1; i++) {

			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) == l.get(j)) {

					System.out.println("The duplicate values are " + l.get(j));
				}

	}

}
}
}