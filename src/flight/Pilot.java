package flight;

public abstract class Pilot {
	
	private Flight currentFlight;
	
	public void fly(Flight f) {
		if(canAccept(f)) {
			currentFlight = f;
		}
		else
			handleCannotFly();
		
	}
	
	private void handleCannotFly() {
		System.out.println("Cant accept");
	}
	
	public abstract boolean canAccept(Flight f);

}
