package flight;

public class Passenger {
	
	private int checkedBags;
	private int freeBags;
	private float perBagFee;
	
	public void setCheckedBags(int checkedBags) {
		this.checkedBags = checkedBags;
	}
	
	public int getCheckedBags() {
		return checkedBags;
	}
	
	public void setFreeBags(int freeBags) {
		this.freeBags = freeBags;
	}
	
	public int getFreeBags() {
		return freeBags;
	}
	
	public float getPerBagFee() {
		return perBagFee;
	}
//Constructors	
	
	public Passenger() {}
	
	public Passenger(int freeBags) {
		this(freeBags > 1 ? 25.0f : 50.0f);
		this.freeBags=freeBags;
	}

	public Passenger(int freeBags,int checkedBags) {
		this(freeBags);
		this.checkedBags=checkedBags;
		
	}
	
	private Passenger(float perBagFee) {
		this.perBagFee=perBagFee;
		
	}

	
	

}
