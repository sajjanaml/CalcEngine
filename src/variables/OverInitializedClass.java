package variables;

public class OverInitializedClass {
	
	private int theField =1;
	
	public int getTheField() {
		return theField;
	}
	
	{
		theField=2;
	}
	
/*	public OverInitializedClass(int theField){
		this.theField=3;
		
	}*/
	
	public OverInitializedClass(){
		theField=3;
	}
	
	

	

}
