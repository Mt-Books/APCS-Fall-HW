// Frank Chen
// APCS1 pd1
// HW15 -- Wayne's World
// 2017-10-11

public class Coin {
	private double value;
	public String upFace;
	private String name;
	private int flipCtr;
	private int headsCtr;
	private int tailsCtr;
	private double bias;
	
public Coin() {
	double x = Math.random();
	if (x >= 0.5) {
		upFace = "heads";
	}
	else {
		upFace = "tails";
	}
}
	
public Coin (String coinName) {
	if (coinName == "quarter") {
		name = "quarter";
	}
	double x = Math.random();
	if (x >= 0.5) {
		upFace = "heads";
	}
	else {
		upFace = "tails";
	}
}

public Coin (String coinName, String coinFace) {
	if (coinName == "dollar" && coinFace == "heads") {
		name = "dollar";
		upFace = "heads";
	}
}

public String flip() {
	double x = Math.random();
	if (x >= 0.5) {
		upFace = "heads";
		headsCtr +=  1;
	}
	else {
		upFace = "tails";
		tailsCtr += 1;
	}
	flipCtr +=1;
	
	return upFace;
}

public String toString() {
	return name + " -- " + upFace;
}

public void assignValue() {
	if (name == "dollar") {
		value = 1.00;
	}
	if (name == "quarter") {
		value = 0.25;
	}
}

public boolean equals(Coin other) {
	return upFace.equals (other.upFace);
}

}