package flight;

public class PassengerMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Passenger obj1 = new Passenger(2);
		
		System.out.println(obj1.getFreeBags());
		
		Passenger obj2 = new Passenger(2,3);
		
		System.out.println(obj2.getPerBagFee());
		

	}

}
