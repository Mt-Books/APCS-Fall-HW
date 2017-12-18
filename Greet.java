public class Greet {
 
    public static void main (String [] args) {
	String greeting;

	BigSib richard = new BigSib ("Word up");
	richard.setHelloMsg ("Word up");

	BigSib alex = new BigSib ("Salutations");
	alex.setHelloMsg ("Salutations");

	BigSib george = new BigSib ("Hey ya");
	george.setHelloMsg ("Hey ya");

	BigSib mary = new BigSib ("Sup");
	mary.setHelloMsg ("Sup");

	greeting = richard.greet ("freshmen");
	System.out.println (greeting);

	greeting = alex.greet ("Dr. Spaceman");
	System.out.println (greeting);

	greeting = george.greet ("King Fooey");
	System.out.println (greeting);

	greeting = mary.greet ("mom");
	System.out.println (greeting);

    }
}