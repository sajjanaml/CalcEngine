package flight;

public class FlightMainMethOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f = new Flight();
		Passenger p1 = new Passenger(0,1);
		Passenger p2 = new Passenger(0,2);
		
		f.add1Passenger();
		System.out.println(f.getPassengers());
		f.add1Passenger(2);
		System.out.println(f.getTotalCheckedBags());
		f.add1Passenger(p1);
		
		
		System.out.println(p1.getCheckedBags());
	
		
		short threeBags=3;
		
		f.add1Passenger(threeBags, 2);
		
		System.out.println(f.getPassengers());
		
		System.out.println(f.getTotalCheckedBags());
		System.out.println(f.totalCarryOns);
		
		f.add1Passenger(p2, threeBags);
		
		
		System.out.println(f.totalCarryOns);
		
		
		

	}

}
