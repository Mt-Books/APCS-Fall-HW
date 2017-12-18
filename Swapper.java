// Frank Chen
// APCS1 pd1
// HW40 -- Make It Better
// 2017-11-26

import cs1.Keyboard;

public class Swapper {

    // Prints the Desired Array
    public static void printArray (String[][] array) {
		for (String[] r1 : array) {
			for (String c1 : r1) {
				System.out.print (c1 + " ");
			}
			System.out.println();
		}
    }
	
    // Swaps Elements Given Rows and Columns
    public static String[][] swapElements (String[][] array, int r1, int c1, int r2, int c2) {
		String arrayOld = array[r1][c1];
		array[r1][c1] = array[r2][c2];
		array[r2][c2] = arrayOld;
		return array;
    }
	
    // Main Method
    public static void main (String[] args) {
		int r1;
		int c1;
		int r2;
		int c2;
		String[][] array = { {"Uno", "Dos", "Tres"}, {"Cuatro", "Cinco", "Seis"} };
		
		System.out.println("\n------------------------------\n");
		System.out.println("Current Array \n");
		printArray(array);
		System.out.println("\n------------------------------\n");

		System.out.println("Note: Rows and Columns count from 0, not 1! \n");
			
		System.out.print("Enter Row of First Element: ");
		r1 = Keyboard.readInt();
				
		System.out.print("Enter Column of First Element: ");
		c1 = Keyboard.readInt();

		System.out.println("\nChosen Element: " + array[r1][c1]);
		System.out.println("\n------------------------------\n");
				
		System.out.print("Enter Row of Second Element: ");
		r2 = Keyboard.readInt();
				
		System.out.print("Enter Column of Second Element: ");
		c2 = Keyboard.readInt();

		System.out.println("\nChosen Element: " + array[r2][c2]);
		System.out.println("\n------------------------------\n");
				
		array = swapElements (array, r1, c1, r2, c2);
				
		System.out.println("Altered Array \n");
		printArray(array);
		System.out.println();

		System.out.println("Swapped " + array[r2][c2] + " and " + array[r1][c1]);
		System.out.println("\n------------------------------\n");

    }
}