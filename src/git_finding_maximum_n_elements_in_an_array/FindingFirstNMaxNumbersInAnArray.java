package git_finding_maximum_n_elements_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class FindingFirstNMaxNumbersInAnArray {
	public static void main(String[] args) {
		/*
		 * write a java program to find out the first “n” max values from an array (do
		 * not use sort method)
		 * 
		 * Input : {1,2,3,4,5,6,7,8} input n:2 Output : [7, 8]
		 */

		int input[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 3;

		List<Integer> temp = new ArrayList<>();
		for (int each : input) {
			temp.add(each);
		}

		List<Integer> output = new ArrayList<>();

		int max = temp.get(0);
		int count = 1;

		while (count <= n) {

			for (int each : temp) {
				if (each > max) {
					max = each;
				}
			}
			output.add(max);
			temp.remove(temp.indexOf(max));
			count++;
			max = temp.get(0);

		}

		System.out.println("Max " + n + " element(s) in the given Array : " + output);

	}

}
