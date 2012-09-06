
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Movie m1 = new Movie("Title1",0);
		Rental r1 = new Rental (m1,5);
		Rental r2 = new Rental (m1,2);
		Price P = new ChildrensPrice();
		System.out.println(r1.getCharge());
		Customer c1= new Customer("Jake");
	
		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(new Rental(m1,3));
		String S1 = c1.htmlStatement();
		System.out.println(S1);
	}

}
