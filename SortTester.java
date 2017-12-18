// Frank Chen
// APCS1 pd1
// HW53 -- Solid Comparative Analysis
// 2017-12-13

import java.util.ArrayList;

public class SortTester {

	// Populate helper method
	public static ArrayList populate( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
			//     offset + rand int on interval [lo,hi]
			retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
			size--;
		}
		return retAL;
	}
	
	public static void main (String[] args) {
		// Bubble Sorting Method
		// Best Case: Array is sorted in ascending order.
		// Worst Case: Array is sorted in descending order.
		ArrayList bubble = new ArrayList<Integer>();
		bubble = populate (5, 1, 50);
		System.out.print("\nArray bubble before sorting:\n" + bubble);
		MySorts.bubbleSortV(bubble);
		System.out.print("\nArray bubble after sorting: \n" + bubble + "\n");
		
		// Selection Sorting Method
		// Best Case: There is none, must pass by n-1 elements
		// Worst Case: There is none, must pass by n-1 elements
		ArrayList select = new ArrayList<Integer>();
		select = populate (5, 1, 50);
		System.out.print("\nArray select before sorting:\n" + select);
		MySorts.selectionSortV(select);
		System.out.print("\nArray select after sorting: \n" + select + "\n");
		
		// Insertion Sorting Method
		// Best Case: There is none, must pass by n-1 elements
		// Worst Case: There is none, must pass by n-1 elements
		ArrayList insert = new ArrayList<Integer>();
		insert = populate (5, 1, 50);
		System.out.print("\nArray insert before sorting:\n" + insert);
		MySorts.insertionSortV(insert);
		System.out.print("\nArray insert after sorting: \n" + insert);
	}
	
}