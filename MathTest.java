// James Wang
// APCS1 pd9
// HW24 -- I Was Born a Gamblin’ Man
// 2015-11-04

public class MathTest {

    private static final String[] FRUITS = {
        "lime", "lime", "lime",
        "lemon", "lemon", "lemon",
        "cherry", "cherry", "cherry",
        "orange", "orange", "orange",
        "grapefruit", "grapefruit", "grapefruit",
        "tangerine", "tangerine", "tangerine",
        "ugli", "ugli", "ugli",
        "peach", "peach", "peach"
    };
    private String[] _fruits; //to be init'd by each instance

    /*=====================================
      Slots() -- default constructor
    pre:  constant array FRUITS exists, has been initialized
    post: mutable array _fruits contains same elements as FRUITS
    =====================================*/
    public MathTest() {
        //allocate memory for _fruits based on size of FRUITS
        _fruits = new String[FRUITS.length];

        //copy elements of FRUITS into _fruits
        for (int i = 0; i < FRUITS.length; i++) _fruits[i] = FRUITS[i];
    }

    /*=====================================
      String toString() -- overrides inherited toString()
    pre:
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
    public String toString() {
        String first; String second; String third;
        first = _fruits[0];
        second = _fruits[1];
        third = _fruits[2];
        return first + "\t" + second + "\t" + third + "\t";

    }

    /*=====================================
      void swap(int,int) -- array swap util fxn
    pre:  _fruits array exists
    post: elements at indices i, j are swapped
    =====================================*/
    private void swap( int i, int j ) {
        String temp = _fruits[i];
        _fruits[i] = _fruits[j];
        _fruits[j] = temp;
    }


    /*=====================================
      void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
    public void spinOnce() {
        String[] old_fruits = new String[_fruits.length];
        for (int i = 0; i < _fruits.length; i++) old_fruits[i] = _fruits[i];

        boolean shouldContinue = true;
        while (shouldContinue) {
            int randInd1 = (int) (Math.random() * _fruits.length);
            int randInd2 = (int) (Math.random() * _fruits.length);

            if (old_fruits[randInd1].length() > 0 &&
                    old_fruits[randInd1].length() > 0 ) {
                swap(randInd1, randInd2);
                old_fruits[randInd1] = "";
                old_fruits[randInd1] = "";
                shouldContinue = false;
                for (String s : old_fruits){
                    if (s.length() > 0) shouldContinue = true;
                    //will make shouldContinue true unless all the strings in old_fruits are empty, in which case shouldContinue remains false and we are done spinning
                }
                    }
        }
    }

    /*=====================================
      boolean jackpot() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    false otherwise
    =====================================*/
    public boolean jackpot() {
        return (_fruits[0].equals(_fruits[1]) && _fruits[0].equals(_fruits[2]));
    }

    /*=====================================
      boolean miniWin() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    or if first 3 slots mutually distinct,
    false otherwise
    =====================================*/
    public boolean miniWin() {
        return (jackpot() || !(_fruits[0].equals(_fruits[1]) ||
                    _fruits[0].equals(_fruits[2]) ||
                    _fruits[1].equals(_fruits[2])  )
               );
    }

    //main() method for testing
    public static void main( String[] args ) {
        Slots machine01 = new Slots();
        Slots machine02 = new Slots();

        //for (String s : machine01._fruits) System.out.println(s);

        //test to verify slot machines function indepently
        System.out.println();
        System.out.println( "Machine01 initial state:\t" + machine01 );
        System.out.println( "Machine02 initial state:\t" + machine02 );

        System.out.println( "\nSpinning machine01...\n" );

        machine01.spinOnce();

        System.out.println();
        System.out.println( "Machine01 state:\t" + machine01 );
        System.out.println( "Machine02 state:\t" + machine02 );
        System.out.println();


        //test gamble-until-you-win mechanism

        System.out.println( "Preparing to spin until a mini win! . . ." );
        System.out.println( "------------------------------------" );

        //if you haven't won, spin again until you win!
        while( machine01.miniWin() == false ) {
            System.out.println( "Your spin..." + "\t" + machine01 );
            System.out.println( "LOSE\n" );
            machine01.spinOnce();
        }

        System.out.println( "====================================" );
        System.out.println( "Your spin..." + "\t" + machine01 );
        System.out.println( "WIN\n" );



        System.out.println( "Preparing to spin until...jackpot! . . ." );
        System.out.println( "------------------------------------" );

        //if you haven't won, spin again until you win!
        while( machine01.jackpot() == false ) {
            System.out.println( "Your spin..." + "\t" + machine01 );
            System.out.println( "LOSE\n" );
            machine01.spinOnce();
        }

        System.out.println( "====================================" );
        System.out.println( "Your spin..." + "\t" + machine01 );
        System.out.println( "JACKPOT!\n" );
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class Slots
