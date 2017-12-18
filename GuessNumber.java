// Frank Chen
// APCS1 pd1
// HW48 -- Keep Guessing
// 2017-12-06

/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
	private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
		_lo = 1;
		_hi = 100;
		_guessCtr = 0;
		_target = (int)( (Math.random() * 99) + 1);
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec(int a, int b) 
    {
		_lo = a; 
		_hi = b;
		System.out.print ("\nGuess a number from " + _lo + "-" + _hi + ": ");
		int _guess = Keyboard.readInt();
		if (_guess > _hi || _guess < _lo) {
			System.out.println ("Stay within the range: " + _lo + "-" + _hi);
			System.out.print ("Input: ");
			playRec(_lo, _hi);
		}
		else if (_guess > _target) {
			System.out.print ("\nToo high, try again...");
			_guessCtr += 1;
			playRec(_lo, _guess - 1);
		}
		else if (_guess < _target) {
			System.out.print ("\nToo low, try again...");
			_guessCtr += 1;
			playRec(_guess + 1, _hi);
		}
		else {
			System.out.println ("\nCorrect! It took: " + _guessCtr + " guesses.");
		}
	}


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
		System.out.print ("\nGuess a number from " + _lo + "-" + _hi + ": ");
		int _guess = Keyboard.readInt();
		while (_guess != _target) {
			if (_guess > _hi || _guess < _lo) {
				System.out.println ("Stay within the range: " + _lo + "-" + _hi);
				System.out.print ("Input: ");
			} else {
				if (_guess > _target) {
					System.out.println ("\nToo high, try again...");
					_hi = _guess - 1;
					_guessCtr += 1;
					System.out.print ("Guess a number from " + _lo + "-" + _hi + ": ");
				} else {
					System.out.println ("\nToo low, try again...");
					_lo = _guess + 1;
					_guessCtr += 1;
					System.out.print ("Guess a number from " + _lo + "-" + _hi + ": ");
				}
			}
			_guess = Keyboard.readInt();
		}
		System.out.println ("\nCorrect! It took: " + _guessCtr + " guesses.");
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
		//use one or the other below:
		playRec(_lo, _hi);
		//playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {
		//instantiate a new game
		GuessNumber g = new GuessNumber(1,100);

		//start the game
		g.play();
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
