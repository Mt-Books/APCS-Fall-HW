//Frank Chen
//APCS1-01
//HW07
//2017/09/26

public class BigSib {
	private String helloMsg;

	public BigSib (String newMsg) {
		helloMsg = newMsg;
	}

	public void setHelloMsg (String newMsg) {
		helloMsg = newMsg;
	}

	public String greet (String greeting) {
		return helloMsg + " " + greeting;
	}
}