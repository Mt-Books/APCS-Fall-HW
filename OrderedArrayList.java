// Frank Chen
// APCS1 pd1
// HW55 -- Never Fear, Big Oh is Here!
// 2017-12-14

/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
  // instance of class ArrayList, holding objects of type Comparable 
  // (ie, instances of a class that implements interface Comparable)
  private ArrayList<Comparable> _data;

  
  // default constructor initializes instance variable _data
  public OrderedArrayList()
  {
    _data = new ArrayList<Comparable>();    
  }

  
  public String toString()
  {
    return _data.toString(); 
  }
  

  public Comparable remove( int index )
  {	
    return _data.remove(index); 
  }

  
  public int size()
  { 
    return _data.size();
  }
  
    
  public Comparable get( int index )
  { 
    return _data.get(index); 
  }
  
  
  /***
   * add takes as input any comparable object 
   * (i.e., any object of a class implementing interface Comparable)
   * inserts newVal at the appropriate index
   * maintains ascending order of elements
   * uses a linear search to find appropriate index
   ***/
  public void add( Comparable newVal )
  { 
    for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
	    }
    }
    _data.add( newVal ); //newVal > every item in oal, so add to end 
  }
  
  
  public void addBin (Comparable newVal) 
  {
	int low = 0;
	int med = 0;
	int high = _data.size() - 1;
	for (;;) { 
		med = (low + high) / 2;
		if ( newVal.compareTo( _data.get(med) ) < 0) {
			high = med - 1;
			if (low > high) {
				break;
			}
		}
		else if ( newVal.compareTo( _data.get(med) ) > 0) {
			low = med + 1;
			if (low > high) {
				med += 1;
				break;
			}
		}
		else {
			break;
		}
	}
	_data.add(med, newVal);
  }

  
  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 4; i++ )
      Franz.add( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
	
	// testing binary search
	Franz.addBin( (int)( 50 * Math.random() ) );
	System.out.println( Franz );
	System.out.println();

    //check for sorted-ness
    //if msg does not appear, list was sorted
    for( int i=0; i < Franz.size() - 1; i++ ) {
      System.out.println("Element " + i + ": " + Franz.get(i) );
      if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
        System.out.println( " *** NOT sorted *** " );
        break;
      }
    }
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class OrderedArrayList
