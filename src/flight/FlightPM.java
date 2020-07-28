package flight;

public class FlightPM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight val1 = new Flight(10);
		Flight val2 = new Flight(20);
		
		System.out.println(val1.getFlightNumber());
		System.out.println(val2.getFlightNumber());
		
		
		Flight val3 = new Flight();
		
		//val2.swap(val1, val2);
		val1.swapFlightNumbers(val1,val2);
		

		System.out.println(val1.getFlightNumber());
		System.out.println(val2.getFlightNumber());
		

	}

}
