// Frank Chen
// APCS1 pd1
// HW17 -- Do I repeat myself?
// 2017-10-16

public class Repeater {
	
	// Employs while loop
	public static String fenceW (int numPosts) {
		int a = 1;
		String b = "|";
		String c = "--";
		String d = "";
		if (numPosts == 0) {
			//Prints nothing
		}
		else {
			while (a < numPosts) {
				a += 1;
				System.out.print (b);
				System.out.print (c);
			}
			return b;
		}
		return d;
	}
	
	// Employs recursion
	public static String fenceR (int numPosts) {
		String x = "|";
		String y = "--";
		String z = "";
		if (numPosts == 0) {
			//Prints Nothing
		}
		else if (numPosts == 1) {
			return x;
		}
		else {
			System.out.print (x);
			System.out.print (y);
			return fenceR (numPosts - 1);
		}
		return z;
	}
		
	// Main method
	public static void main (String[] args) {
		Repeater test = new Repeater();
		
		System.out.println ();
		
		System.out.println (test.fenceW (1) ); 
		System.out.println (test.fenceW (2) ); 
		System.out.println (test.fenceW (3) ); 
		
		System.out.println ();
		System.out.println ("---------------");
		System.out.println ();
		
		System.out.println (test.fenceR (1) );
		System.out.println (test.fenceR (2) );
		System.out.println (test.fenceR (3) );
		
	}
}