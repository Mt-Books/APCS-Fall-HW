// Frank Chen
// APCS1 pd1
// HW25 -- All Hallow's Eve
// 2017-11-1

public class Loopier {
	
	public static int[] randomArray (String num) {
		int array = Integer.parseInt(num);
		int anArray[] = new int[array];
			for (int i = 0; i < anArray.length; i++) {
				anArray[i] = (int)Math.random();
			}
			return anArray;
	}
	
	public static String convertArray (String num) {
		int array = Integer.parseInt(num);
		String strArray = "";
		int anArray[] = new int[array];
			for (int i = 0; i < anArray.length; i++) {
				strArray += Integer.toString(anArray[i]);
			}
			return strArray;
	}
	
	public static int linSearch (int[] a, int target) {
		int i = 0;
		while (i < a.length) {
			if (a[i] == target) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public static int linSearchR (int[] a, int target) {
		if (a.length == 0) {
			return -1;
		}
		else if (a[0] == target) {
			return 0;
		}
		else {
			int[] anArray = new int[a.length - 1];
			for (int i = 1; i < a.length; i++) {
				anArray[i - 1] = a[i];
			}
			return linSearchR (anArray, target) + 1;
		}
	}
	
	public static int freq (int[] a, int target) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				count += 1;
			}
		}
		return count;
	}
	
	public static int freqRec (int[] a, int target) {
		if (a.length == 0) {
			return 0;
		}
		else {
			int[] anArray = new int[a.length - 1];
			for (int i = 1; i < a.length; i++) {
				anArray[i - 1] = a[i];
			}
			if (a[0] == target) {
				return freqRec (anArray, target) + 1;
			}
			else {
				return freqRec (anArray, target);
			}
		}
	}
	
	public static void main (String[] args) {
		int[] anArray = {-3, -3, -3, 0, 1, 2, 3};
		
		System.out.println (linSearch (anArray, -2) );
		System.out.println (linSearchR (anArray, 3) );
		System.out.println (freq (anArray, 0) );
		System.out.println (freqRec (anArray, -3) );
	}
}