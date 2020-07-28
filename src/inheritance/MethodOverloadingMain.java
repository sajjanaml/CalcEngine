package inheritance;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Train t = new Train();
		t.add1Passenger(1);
		
		System.out.println(t.totalCheckedBags);
		
		Passenger bob = new Passenger(0,2);
		t.add1Passenger(bob);
		
		System.out.println(t.totalCheckedBags);
		System.out.println(bob.perBagFee);
		System.out.println(bob.freeBags);
		System.out.println(bob.checkedBags);
		System.out.println(t.passengers);
		System.out.println(t.getSeats());
		

	}

}
