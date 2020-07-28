package flight;

public class Flight {
	
	static final int MAX_FAA_SEATS = 550;
	private int seats=150;
	private int passengers;
/*	private int FlightNumber;
	private char FlightClass;*/
	
	//Null reference
	Integer FlightNumber;
	Character FlightClass;
	
	private boolean[] isSeatAvailable;
	private int totalCheckedBags;
	private int maxCarryOns=seats*2;
	public int totalCarryOns;
	
	
	public void setTotalCheckedBags(int totalCheckedBags) {
		this.totalCheckedBags = totalCheckedBags;
	}
	
	public int getTotalCheckedBags() {
		return totalCheckedBags;
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public void setSeats(int seats) {
		if(seats<MAX_FAA_SEATS) {
		this.seats = seats;}
		else
			System.out.println("Cannot Accomodate");
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setFlightNumber(int flightNumber) {
		FlightNumber = flightNumber;
	}
	
	public int getFlightNumber() {
		return FlightNumber;
	}
	
//Initilazion blocl
	{
		isSeatAvailable = new boolean[seats];
		for(int i=0;i<seats;i++) {
			isSeatAvailable[i]=true;
		}
	}
	
	
//constuctor	
	public Flight(){
		
		
		
	}
	
	public Flight(int FlightNumber) {
		
		this.FlightNumber=FlightNumber;
	}
	
	public Flight(char FlightClass) {
	
		this.FlightClass=FlightClass;
	}

//adding a passenger and handling	
	public void add1Passenger() {
		if(hasSeating()) {
			passengers+=1;
		}
		else
			handleTooMany();
	}
	private void handleTooMany() {
		System.out.println("No seats");
	}
	
	private boolean hasSeating() {
		return passengers<seats;
	}
	
	private boolean hasCarryOnsSpace(int carryOns) {
		return totalCarryOns + carryOns <= maxCarryOns;
	}
	private boolean hasSeating(int Count) {
		return passengers+Count <seats;
	}
	
	
//Implementation of Method Overloading	
	
	public void add1Passenger(int bags) {
		if(hasSeating()) {
			add1Passenger();
			totalCheckedBags+=bags;
		}
	}
	
	public void add1Passenger(Passenger p) {
		add1Passenger(p.getCheckedBags());
	}
	
	public void add1Passenger(int bags,int carryOns) {
		if(hasSeating() && hasCarryOnsSpace(carryOns)) {
			add1Passenger(bags);
			totalCarryOns+=carryOns;
		}
	}
	
	public void add1Passenger(Passenger p, int carryOns) {
		add1Passenger(p.getCheckedBags(),carryOns);
		
	}
	
//Variable Number of Parameters
	
	public void addPassengers(Passenger... list) {
		if (hasSeating(list.length)) {
			passengers+=list.length;
			for(Passenger passenger:list) {
				totalCheckedBags +=passenger.getCheckedBags();
				
			}
			
			
		}
		else
			handleTooMany();
		
	}

	
//demo of returning primitive value boolean	
	
	public boolean hasRoom(Flight f2) {
		int total = passengers + f2.getPassengers();
		return total<seats;
		
	}
	
//demo of returning Object
	
	public Flight createNewWithBoth(Flight f2) {
		Flight newFlight = new Flight();
		newFlight.seats=this.seats;
		newFlight.passengers = this.passengers+f2.getPassengers();
		
		return newFlight;
	}
	
//Demo of Parameter Immutablity with Classes
	
	public void swap(Flight i,Flight j) {
		
		
		Flight k=i;
		
		i=j;
		j=k;
		
		System.out.println(i.getFlightNumber());
		System.out.println(j.getFlightNumber());
	}
	
//Demo of Parameter Immutablity by changed inside datamembers	
	
	public void swapFlightNumbers(Flight i,Flight j) {
		int k=i.getFlightNumber();
		i.setFlightNumber(j.getFlightNumber());
		j.setFlightNumber(k);
		System.out.println(i.getFlightNumber());
		System.out.println(j.getFlightNumber());
	}
	
//toString method
	@Override
	public String toString() {
		if(FlightNumber!=null) {
			return "Flight#"+FlightNumber;
		}
		else if(FlightClass!=null) {
			return "Flight Class" + FlightClass;
		}
		else
			return "No valid Identity";
			
	}
	


	



}


