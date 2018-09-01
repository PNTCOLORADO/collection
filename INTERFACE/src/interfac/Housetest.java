package interfac;

public class Housetest implements House {
	public void livingroom() {
		System.out.println(" we are studing in the livingroom");
	}
	public void bedroom() {
		System.out.println("we are sleeping in bedrooom");
		
	}
	public static void main (String[] args) {
		House house=new Housetest();
		house.bedroom();
		house.livingroom();
		
	}

}
