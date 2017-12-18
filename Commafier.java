// Frank Chen
// APCS1 pd1
// HW21 -- Karmacomma
// 2017-10-23

public class Commafier {
	
	public static String commafyR (int num) {
		
		String endNums = "";
		
		if (num <= 999) {
			return "" + num;
		}
		else {
			endNums += num % 1000;
		}
			
		if (endNums.length() == 1) {
			String x = endNums;
			endNums = "00";
			endNums += x;
		}
		
		if (endNums.length() == 2) {
			String y = endNums;
			endNums = "0";
			endNums += y;
		}
		
		return commafyR (num / 1000) + "," + endNums;
	}

	public static String commafyF (int num) {
		
		String endNums = "";
		
		while (num >= 999) {
			endNums += num % 1000;
			if (endNums.length() == 1) {
				String x = endNums;
				endNums = "00";
				endNums += x;
			}
		
			if (endNums.length() == 2) {
				String y = endNums;
				endNums = "0";
				endNums += y;
			}
			return commafyF (num / 1000) + "," + endNums;
		}
		return "" + num;
	}

	public static void main (String[] args) {
		for (String s : args) {
			int input = Integer.parseInt(s);
			System.out.println (commafyR (input) );
			System.out.println (commafyF (input) );
		}
	}
	
}