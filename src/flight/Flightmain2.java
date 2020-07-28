package flight;

public class Flightmain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight lax1 = new Flight();
		Flight lax2 = new Flight();
		
//adding Passengers
		for(int i=1;i<=10;i++) {
			lax1.add1Passenger();
			lax2.add1Passenger();
		}
		
		System.out.println(lax1.getPassengers());
		System.out.println(lax2.getPassengers());
//checking has room to combine
		
		Flight lax3=null;
		
		if(lax1.hasRoom(lax2)) {
			lax3=lax1.createNewWithBoth(lax2);
			
		}
		
		if(lax3!=null) {
			System.out.println("Flights are combined");
		}
		
		System.out.println(lax3.getPassengers());
		System.out.println(lax3.getSeats());


		
		

	}

}
