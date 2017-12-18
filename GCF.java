public class GCF {
	
	// GCF Method
	public static int GCF (int a, int b) {
		if ((b % a) == 0) {
			return a;
		}
		else if (a > b) {
			int c = a - b;
			if (a == 0) {
				return b;
			}
			else if (b == 0) {
				return a;
			}
			else {
				return GCF (b, c);
			}
		}
		else {
			int c = b - a;
			if (a == 0) {
				return b;
			}
			else if (b == 0) {
				return a;
			}
			else {
				return GCF (a, c);
			}
		}
	}
	
	// Main Method
	public static void main (String[] args) {
		
		System.out.println ();
		System.out.println (GCF (25,6) ); 
	}
}