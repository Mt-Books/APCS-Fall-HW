// Team FA - Andrew Shao, Frank Chen
// APCS1 pd1
// HW10 -- Mo Money Mo Problems
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
	if (1000 <= newPin && newPin <= 9998) {
		pin = newPin;
	}
	else {
		pin = 9999;
		System.out.println("New account PIN must be between 1000 and 9998... Account PIN set to 9999");
	}
    return oldPin;
  }

  public int setAcctNum( int newAcctNum )
  {
    int oldAcctNum = acctNum;
	if (100000000 <= newAcctNum && newAcctNum <= 999999998) {
		acctNum = newAcctNum;
	}
	else {
		acctNum = 999999999;
		System.out.println("New account number must be between 100000000 and 999999998... Account number set to 999999999");
	}
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

  public boolean withdraw( double withdrawAmount ) {
    if (withdrawAmount <= balance) {
		balance -= withdrawAmount;
		return true;
    }
    else {
		System.out.println ();
		System.out.println ("Error: Cannot withdraw");
		return false;
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

    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
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
