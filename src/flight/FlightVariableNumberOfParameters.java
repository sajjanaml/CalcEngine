package flight;

public class FlightVariableNumberOfParameters {

	public static void main(String[] args) {
		Flight f = new Flight();
		
		Passenger rachel = new Passenger(0,1);
		Passenger ross = new Passenger(0,2);
		Passenger joey = new Passenger(0,3);
		
		f.addPassengers(rachel,ross,joey); //or the old way of Arrayas

	}

}
