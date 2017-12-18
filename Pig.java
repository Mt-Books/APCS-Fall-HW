// Team Initial -- Simon Tsui, Frank Chen, Daniel Jiang
// APCS1 pd1
// HW24 -- Imetay Otay Ineshay
// 2017-10-29

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig {
	
	//Q: How does this initialization make your life easier?
	private static final String VOWELS = "aeiouAEIOU";
	private static final String SPECIAL = "yY";

	/*=====================================
	boolean hasA(String,String) -- checks for a letter in a String
	pre:  w != null, letter.length() == 1
	post: hasA("cat", "a") -> true
	hasA("cat", "p")       -> false
	=====================================*/
	public static boolean hasA( String w, String letter ) {
		if (w.indexOf (letter) != -1) {
			return true ;
		}
		return false;
	}//end hasA()

	/*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
	public static boolean isAVowel( String letter ) {
		if (VOWELS.indexOf (letter) != -1) {
			return true;
		}
		return false;
	}

	/*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
	public static int countVowels( String w ) {
		int count = 0;
		int a = w.length();
		for (int i = 0; i < a; i++) {
			if (isAVowel (w.substring (i, i + 1) ) ) {
				count += 1;
			}
		}
		return count;
	}

	/*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
	public static boolean hasAVowel( String w ) {
		int b = w.length();
		for (int i = 0; i < b; i++) {
			if (isAVowel (w.substring (i, i + 1) ) ) {
				return true;
			}
		}
		return false;
	}
	
	/*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
	public static String allVowels( String w ) {
		int c = w.length();
		String vowels = "";
		for (int i = 0; i < c; i++) {
			if (isAVowel (w.substring (i, i + 1) ) ) {
				vowels += w.substring (i, i + 1);
			}
		}
		return vowels;
	}
  
	/*=====================================
	pre: w != null
	post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
	=====================================*/
	public static String firstVowel(String w) {
		String retstr = "";
		for(int i = 0; i < w.length(); i++){
			if (isAVowel(w.substring(i, i+1))){
				retstr = w.substring(i, i+1);
				return retstr;
			}
		}
		return retstr;
	}
	
	/*=====================================
	pre: w != null and w.length() > 0
	post: beginsWithVowel("apple")  --> true
	beginsWithVowel("strong") --> false
	=====================================*/
	public static boolean beginsWithVowel(String w) {
		String x = w.substring(0,1);
		if (VOWELS.indexOf (x) != -1){
			return true;
		}
		return false;
	}
  
	/*=====================================
	pre: w.length() > 0
	post: engToPig("apple")  --> "appleway"
	engToPig("strong") --> "ongstray"
	engToPig("java")   --> "avajay"
	=====================================*/
	public static String engToPig(String w) { 
		String y = firstVowel(w);
		String k = w.substring(0,1);
		int z = w.indexOf(y);
		int c = w.length();
		int lowY = w.indexOf("y");
		int capY = w.indexOf("Y");
	
		if (SPECIAL.indexOf(k) != -1) {
			String latin;
			latin = w.substring(z,c) + w.substring(0,z) + "ay";
			return latin.toLowerCase();
		}
		else if (hasA (w, "y") && countVowels(w) <= 0) {
			String latin;
			latin = w.substring(lowY,c) + w.substring(0,lowY) + "ay";
			return latin.toLowerCase();
		}
		else if (hasA (w, "Y") && countVowels(w) <= 0) {
			String latin;
			latin = w.substring(capY,c) + w.substring(0,capY) + "ay";
			return latin.toLowerCase();
		}
		else if (beginsWithVowel (w) == true) {
			return w + "way";	
		}
		else {
			String latin;
			latin = w.substring(z,c) + w.substring(0,z) + "ay";
			return latin.toLowerCase();
		}
	}

	public static void main( String[] args ) {
		System.out.println ("\n" + "-------------------------" + "\n");
		
			System.out.println ("hasA (hello, e): " + hasA ("hello", "e") );
			System.out.println ("hasA (bye, p): " + hasA ("hello", "p") + "\n");
			System.out.println ("isAVowel (a): " + isAVowel ("a") );
			System.out.println ("isAVowel (g): " + isAVowel ("g") + "\n");
			System.out.println ("firstVowel (computer): " + firstVowel ("computer") );
			System.out.println ("firstVowel (aerial): " + firstVowel ("aerial") );
		
		System.out.println ("\n" + "-------------------------" + "\n");
		
		for (String word : args) {
		
			System.out.println ("Pig Latin Form: " + engToPig (word) + "\n");
			System.out.println ("Has A Vowel? " + hasAVowel (word) + "\n");
			System.out.println ("Begins With A Vowel? " + beginsWithVowel (word) + "\n");
			System.out.println ("Number of Vowels: " + countVowels (word) + "\n");
			System.out.println ("Vowels: " + allVowels (word) );
		
		System.out.println ("\n" + "-------------------------" + "\n");
		}
	}
	
}//end class Pig