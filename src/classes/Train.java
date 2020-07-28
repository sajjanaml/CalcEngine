package classes;

public class Train {
	
	private int seats;
	private int passengers;
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	Train(){
		seats=150;
		passengers=0;
	}
	
	public void add1Passenger() {
		
		if(hasSeating()) {
			passengers+=1;
		}
		else
			System.out.println("No seats");
		
	}
	
	public boolean hasSeating() {
		return passengers<getSeats();
		}
	
	
	

}
