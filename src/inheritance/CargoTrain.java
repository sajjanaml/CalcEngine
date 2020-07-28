package inheritance;

public class CargoTrain extends Train {
	//public int seats=12;
	
	
	public float maxCargoSpace=1000.0f;
	public float usedCargoSpace;
	
	public int getSeats() {return 12;}
	
	public CargoTrain() {}
	
	
/*	public CargoTrain(int seats) {
		this.seats=seats;
	}
*/
	
	public void add1Package(float h,float w,float d) {
		float size = h*w*d;
		
		if(hasCargoSpace(size)) {
			usedCargoSpace+=size;
		}
	}
	
	
	
	
	
	private boolean hasCargoSpace(float size) {
		return usedCargoSpace + size <= maxCargoSpace;
	}

}
