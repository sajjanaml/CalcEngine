package flight;

public class Flightmain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight flight1 = new Flight();
		
		Flight flight2 = new Flight();
		flight2.add1Passenger();
		
		int f2seats = flight2.getSeats();
		
		System.out.println(f2seats);
		
		/*System.out.println(flight2);
		System.out.println(flight1);*/
		
		flight2=flight1;
		
		/*System.out.println(flight2);
		System.out.println(flight1);*/
		int f1seats = flight1.getSeats();
		
		System.out.println(f1seats);
		
		flight1.add1Passenger();
		flight1.add1Passenger();
		System.out.println(flight1.getSeats());
		
		System.out.println(flight1.getPassengers());
		
		flight1.setSeats(200);
		
		System.out.println(flight1.getSeats());
		

		

	}

}
