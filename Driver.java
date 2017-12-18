// Frank Chen
// APCS1 pd1
// HW16 -- Get It While You Can
// 2017-10-15

public class Driver {
	
 public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin

    //test default constructor
    
    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );
	
    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );
	
	int matches = 0;
	int flips = 0;
	int heads = 0;
	
	System.out.println();
	System.out.println("-------------------------");
	System.out.println();
	
// PART A ----------------------------------------------------------------

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    System.out.println("\nAfter flipping...");
	while (heads <= 99) {
		yours.flip();
		wayne.flip();
		flips += 1;
		if (yours.upFace == "heads") {
			heads += 1;
		}
		if (wayne.upFace == "tails") {
			heads += 1;
		}
	}
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) {
	    System.out.println( "Matchee matchee!" );
	}
    else {
	    System.out.println( "No match. Firestarter you can not be." );
	}
	
	System.out.println();
	System.out.println( "Flips: " + flips);
	System.out.println( "Heads: " + heads);
	
	System.out.println();
	System.out.println("-------------------------");
	System.out.println();
	
// PART B ----------------------------------------------------------------
	
	//test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);
	
	//test flip() method
	flips = 0;
	matches = 0;
    System.out.println("\nAfter flipping...");
	while (matches <= 99) {
		yours.flip();
		wayne.flip();
		flips += 1;
		if (yours.equals(wayne)) {
			matches += 1;
		}
	}
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) {
	    System.out.println( "Matchee matchee!" );
	}
    else {
	    System.out.println( "No match. Firestarter you can not be." );
	}
	
	System.out.println();
	System.out.println( "Flips: " + flips);
	System.out.println( "Matches: " + matches);
	
	System.out.println();
	System.out.println("-------------------------");
	System.out.println();
	
// PART C ----------------------------------------------------------------

	//test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);
	
	//test flip() method
	flips = 0;
	matches = 0;
    System.out.println("\nAfter flipping...");
	while (matches <= 12999) {
		yours.flip();
		wayne.flip();
		flips += 1;
		if (yours.equals(wayne)) {
			matches += 1;
		}
	}
	
	while ((matches / 7) != 2001) {
		yours.flip();
		wayne.flip();
		flips += 1;
		if (yours.equals(wayne)) {
			matches += 1;
		}
	}
		
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) {
	    System.out.println( "Matchee matchee!" );
	}
    else {
	    System.out.println( "No match. Firestarter you can not be." );
	}
	
	System.out.println();
	System.out.println( "Flips: " + flips);
	System.out.println( "Matches: " + matches);
	System.out.println( "Date of Birth: " + (matches / 7));
	
	System.out.println();
	System.out.println("-------------------------");
	System.out.println();

  }//end main()

}//end class