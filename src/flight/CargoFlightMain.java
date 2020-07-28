package flight;

public class CargoFlightMain  {

	public static void main(String[] args) {
	
		CargoFlight cf = new CargoFlight();
		cf.add1Package(2.0f, 5.0f, 2.0f);
		
		Passenger jane = new Passenger(0,1);	
		cf.add1Passenger(jane);
	
		Flight f = new CargoFlight();
		
		Passenger jane1 = new Passenger(0,1);
		f.add1Passenger(jane1);
		


	}

}

