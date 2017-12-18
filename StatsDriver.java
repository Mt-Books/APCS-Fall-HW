// Frank Chen
// APCS1 pd1
// HW13 May ah Hahv S'maur, Please?
// 2017/08/10

public class StatsDriver {
	public static void main (String[] args) {
		Stats run = new Stats();
		
		System.out.println (run.max (10, 10, 8) ); //Should be 10
		
		System.out.println (run.max (1.0, 2.0, 3.0) ); //Should be 3.0
		
		System.out.println (run.geoMean (4, 4, 4) ); //Should be 4
		
		System.out.println (run.geoMean (1.0, 2.0, 4.0) ); //Should be 2.0
	}
}