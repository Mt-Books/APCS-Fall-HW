public class BankAccountHW {
	
	public static void main (String [] args) {
		String checkInfo;

		System.out.println ("Hello, InsertName!");
		
		Info balance = new Info ("Balance:");
		Info interest = new Info ("Interest Rate:");
		
		checkInfo = balance.check ("X'Amount");
		System.out.println (checkInfo);

		checkInfo = interest.check ("Y'Amount");
		System.out.println (checkInfo);

	}
}