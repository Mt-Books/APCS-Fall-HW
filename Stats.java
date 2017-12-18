// Frank Chen
// APCS1 pd1
// HW19 gcd 3 ways
// 2017/10/18

public class Stats {
	
	// Mean Method
	public static int mean (int a, int b) {
		return (a + b) / 2;
		
	}
	
	// Mean Method
	public static double mean (double a, double b) {
		return (a + b) / 2;
	}
	
	// Max Method
	public static int max (int a, int b) {
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}
		
    // Max Method	
	public static double max (double a, double b) {
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	// geoMean Method
	public static int geoMean (int a, int b) {
		int ret;
		ret = (int)Math.sqrt (a * b);
		return ret;
	}
	
	// geoMean Method
	public static double geoMean (double a, double b) {
		return Math.sqrt (a * b);
	}
	
	// Max Method
	public static int max (int a, int b, int c) {
		if (a >= b) {
			if (a >= c) {
				return a;
			}
			else {
				return c;
		}}
			if (b >= c) {
				return b;
			}
			else {
				return c;
			}
		}
		
	// Max Method
	public static double max (double a, double b, double c) {
		if (a >= b) {
			if (a >= c) {
				return a;
			}
			else {
				return c;
		}}
			if (b >= c) {
				return b;
			}
			else {
				return c;
			}
		}
		
	// geoMean Method
	public static int geoMean (int a, int b, int c) {
		int ret;
		ret = (int)Math.cbrt (a * b * c);
		return ret;
	}
	
	// geoMean Method
	public static double geoMean (double a, double b, double c) {
		return Math.cbrt (a * b * c);
	}
	
	// gcf Method
	public static int gcd(int a, int b){
		int count = 1;
		int denom = 0;
		while(count < a && count < b){
			if (a%count == 0 && b%count == 0){
				denom = count;
			}
			count += 1;
		}//end of while
		return denom;
	}
	
	public static int gcdER(int a, int b){
		if (a % b == 0){
			return b;
		}
		else{
			if (a > b){
			if( a % (a-b) ==0){
				return a-b;
			}
		else{
		    return gcdER(a, b-1);
		}
	    }else{
		if(b % (b-a) == 0){
		    return b-a;
		}else{
		    return gcdER(a-1, b);
		}
	    }
	}
    }
	
	 public static int gcdEW (int a, int b) {
		if (a%b ==0) {
			return b;
		}
		else {
			if (a > b) {
			int count = a-b;
			while (a%count != 0) {
				count = count - 1;
			}
			return count;
	    }
	    else {
			int count = b-a;
			while (b%count != 0) {
				count = count - 1;
			}
		return count;
	    }
	}
	 }
	
	public static void main (String[] args) {
		Stats test = new Stats();
		System.out.println ();
		System.out.println (test.mean (-10, -110) ); // Should be -60
		System.out.println (test.mean (8.0, 10.0) ); // Should be 9.0
		System.out.println (test.max (-300, 120) ); // Should be 120
		System.out.println (test.max (1.00, 0.1) ); // Should be 1.0	
		System.out.println (test.geoMean (7, 7) ); // Should be 7	
		System.out.println (test.geoMean (5.0, 5.0) ); // Should be 5.0	
		System.out.println (test.max (10, 10, 8) ); //Should be 10	
		System.out.println (test.max (1.0, 2.0, 3.0) ); //Should be 3.0
		System.out.println (test.geoMean (4, 4, 4) ); //Should be 4		
		System.out.println (test.geoMean (1.0, 2.0, 4.0) ); //Should be 2.0
		System.out.println (test.gcd (15, 20) ); //Should be 5
		System.out.println (test.gcdER (10, 10) ); //Should be 10
		System.out.println (test.gcdEW (5, 7) ); //Should be 1
	}
}