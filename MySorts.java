// Frank Chen
// APCS1 pd1
// HW55 -- Never Fear, Big Oh is Here!
// 2017-12-13
import java.util.ArrayList;
public class MySorts {
	
	// Best Case: O(n-1) because bubblesort checks two elements at once
	// Worst Case: O((n-1)^2) because bubblesort only swaps adjacent elements
	public static void bubbleSortV( ArrayList<Integer> data ) {
		for(;;) {
			int count = 0;
			for (int i = 0; i < data.size() - 1; i++) {
				if ( (data.get(i)) .compareTo (data.get(i+1)) > 0 ) {
					Integer temp1 = data.get(i);
					Integer temp2 = data.get(i+1);
					data.set(i,temp2);
					data.set(i+1,temp1);
					count += 1;
				}
			}
			if (count == 0) {
				break;
			}
		}
	}

	// Best Case: O((n-1)^2)   This is true for both cases because selectionsort
	// Worst Case: O((n-1)^2)  always goes through the entire array despite order
	public static void selectionSortV( ArrayList<Integer> data ) {
		for (int i = 0; i < data.size() - 1; i++) {
			int min = i;
			for (int x = i + 1; x < data.size(); x++) {
				if (data.get(min).compareTo(data.get(x)) > 0) {
					min = x;
				}
			}
			Integer original = data.get(i);
			Integer replace = data.get(min);
			data.set(i, replace);
			data.set(min, original);
		}
	}

	// Best Case: O((n-1)^2)   This is true for both cases because insertionsort
	// Worst Case: O((n-1)^2)  always goes through the entire array despite order
	public static void insertionSortV( ArrayList<Integer> data ) {
		for (int end = 1; end < data.size(); end++) {
			for (int start = 0; start < end; start++) {
				if (data.get(end).compareTo(data.get(start)) < 0) {
					data.add(start, data.get(end));
					data.remove(end + 1);
				}
			}
		}
	}
	
	// addLinear Method
		// Best Case: O(1) because the input could be lower than the minimum value
		// Worst Case: O(n) because the input could be higher than the maximum value
	
	// addBinary Method
		// Best Case: O(1) because the input could be exactly at the middle
		// Worst Case: O(ceiling log(base 2) n) because math logic and in-class-discussion
}