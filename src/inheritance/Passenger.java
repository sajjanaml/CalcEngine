package inheritance;

public class Passenger {
	
	public int freeBags;
	public int checkedBags;
	public float perBagFee;
	
	public Passenger() {}
	
	public Passenger(int freeBags) {
		
		this(freeBags>1?25.0f:50.0f);
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
