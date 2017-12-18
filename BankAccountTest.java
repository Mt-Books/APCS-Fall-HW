// Team FA - Andrew Shao, Frank Chen
// APCS1 pd1
// HW09 -- building a more meaningful class
// 2017-10-03

public class BankAccount
{
  //instance variables
  private String name;
  private String passwd;
  private int pin;
  private int acctNum;
  private double balance;


  //mutators
  public String setName( String newName )
  {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd )
  {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public int setPin( int newPin )
  {
    int oldPin = pin;
    pin = newPin;
    return oldPin;
  }

  public int setAcctNum( int newAcctNum )
  {
    int oldAcctNum = acctNum;
    acctNum = newAcctNum;
    return oldAcctNum;
  }

  public double setBalance( double newBalance )
  {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }

  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public void withdraw( double withdrawAmount ) {
    if (withdrawAmount <= balance) {
	balance -= withdrawAmount;
    }
    else {
	System.out.println ();
	System.out.println ("Error: Cannot withdraw");
    }
  }

  public boolean authenticate( int acctNumber, String password) {
	  boolean correctCred;
	  if (acctNumber == acctNum && password == passwd) {
		  correctCred = true;
	  }
	  else {
		  correctCred = false;
	  }
	  return correctCred;		  
  }

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;

	if (pin >= 999) {
		if (pin <= 9999) {
			retStr = retStr + "\nPIN: " + pin;
		}
	}
	else {
		retStr = retStr + "\nPIN: " + 9999 + " (PIN is invalid)";
	}

	if (acctNum >= 100000000) {
		if (acctNum <= 999999998) {
			retStr = retStr + "\nAccount Number: " + acctNum;
		}
	}
	else {
		retStr = retStr + "\nAccount Number: " + 999999999 + " (Account Number is invalid)";
	}

    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }

  //main method for testing
  public static void main( String[] args )
  {
    BankAccount testRun = new BankAccount ();
 	testRun.setName ("Alex");
	testRun.setPasswd ("1234");
	testRun.setPin (2017);
	testRun.setAcctNum (123456789);	
	testRun.setBalance (1000.1);
	testRun.withdraw (1);
	System.out.println(testRun.toString ());
	System.out.println(testRun.authenticate(123456789, "1234")); // true
	  
	System.out.println(testRun.authenticate(99999999, "323abc")); // false
  }//end main()

}//end class BankAccountTest