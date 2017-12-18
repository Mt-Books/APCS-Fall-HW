// Frank Chen
// APCS1 pd1
// HW20 -- For the Love of Strings .
// 2017-10-19

public class Foresrever {
	
	public static String fenceF (int posts) {
		String fence = "";
		for (int x = 1; x < posts; posts --) {
			fence += "|--";
		}
		fence += "|";
		return fence;
	}
	
	public static String reverseF (String s) {
		String reverse = "";
		for (int x = s.length(); x != 0; x--) {
			reverse += s.substring (x - 1, x);
		}
		return reverse;
	}
	
	public static String reverseR (String s) {
		int a = s.length();
		if (a <= 0) {
			return "";
		}
		return s.substring (a - 1, a) + reverseR (s.substring (0, a - 1) );
	}
	
	public static void main (String[] args) {
		
		System.out.println ("--------------------");
		
		System.out.println (fenceF (1) );
		System.out.println (fenceF (2) );
		System.out.println (fenceF (3) );
		
		System.out.println ("--------------------");
		
		System.out.println (reverseF ("stressed") );
		System.out.println (reverseF ("12345") );
		System.out.println (reverseF ("dog") );
		
		System.out.println ("--------------------");
		
		System.out.println (reverseR ("desserts") );
		System.out.println (reverseR ("54321") );
		System.out.println (reverseR ("god") );
		
	}
}