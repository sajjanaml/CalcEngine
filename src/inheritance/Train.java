package inheritance;

public class Train {

	public int getSeats() {return 150;}
	//public int seats=150;
	public int passengers;
	public int totalCheckedBags;
	public int TrainNumber;
	public char TrainClass;
	
	
	public Train() {}
	public Train(int TrainNumber) {
		this.TrainNumber=TrainNumber;
	}
	
//Equality
	@Override
	public boolean equals(Object o) {
		
		if(super.equals(o))
			return true;
		
		if(!(o instanceof Train)) 
		return false;	
		
		Train other = (Train) o;
		return this.TrainNumber == other.TrainNumber;
		
		
	}

	
	public void add1Passenger() {
		if(hasSeating()) {
			passengers+=1;
		}
		
	}
	
	public void add1Passenger(int bags) {
		if(hasSeating()) {
			passengers+=1;
			totalCheckedBags+=bags;
		}
	}
	
	public void add1Passenger(Passenger p) {
		add1Passenger(p.checkedBags);
	}
	
	public void add1Passenger(Passenger... list) {
		if(hasSeating(list.length)) {
			passengers+=list.length;
			for(Passenger p:list) {
			
				totalCheckedBags+=p.checkedBags;
			
			}

		}
		else
			System.out.println("Too Many");
	
	}
	
	
	
	
	private boolean hasSeating() {
		return passengers < getSeats();
	}
	
	private boolean hasSeating(int count) {
		return passengers + count < getSeats();
	}

}
