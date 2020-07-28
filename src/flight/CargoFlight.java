package flight;

public class CargoFlight extends Flight {

	private float maxCargoSpace =1000.0f;
	private float usedCargoSpace;
	
	public int seats=12;
	
	public void add1Package(float h,float l, float w) {
		float size= h*l*w;
		if(hasCargoSpace(size)) {
			usedCargoSpace+=size;
			
		}
		else
			handleNoSpace();
	}
	
	private boolean hasCargoSpace(float size) {
		return usedCargoSpace + size <= maxCargoSpace;
	}
	
	private void handleNoSpace() {
		System.out.println("Not Enough Space");
	}
	
//Constructors and Supper 
	public CargoFlight() {}
	
	public CargoFlight(int FlightNumber) {
		super(FlightNumber);
	}
	
	public CargoFlight(int FlightNumber,float maxCargoSpace) {
		this(FlightNumber);
		this.maxCargoSpace=maxCargoSpace;
	}
	
	public CargoFlight(float maxCargoSpace) {
		this.maxCargoSpace=maxCargoSpace;
	}
	
	

}
