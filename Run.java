public class Run {
	
public static int flipsNum (int num){
	int ret;
	ret = 0;
	return ret;
}
	
public static void main( String[] args ) {
	
    Coin mine = new Coin();

    Coin yours = new Coin( "quarter" );
	
    Coin wayne = new Coin( "dollar", "heads" );

    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    System.out.println("\nAfter flipping...");
	double y = Math.random();
	while (y <= 10) {
		yours.flip(); 
		yours.flipsNum();
		wayne.flip();
		wayne.flipsNum();
	}
	System.out.println("yours: " + yours + flipsNum);
    System.out.println("wayne: " + wayne + flipsNum);

    if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
    else
	    System.out.println( "No match. Firestarter you can not be." );

  }
}