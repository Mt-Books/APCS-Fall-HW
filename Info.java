public class Info {
	private String bankInfo;

	public Info (String amount) {
		bankInfo = amount;
	}

	public String check (String money) {
		String amount;
		amount = bankInfo + " " + money;
		return amount;
	}
}