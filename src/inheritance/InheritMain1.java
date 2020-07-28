package inheritance;

public class InheritMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Train t = new CargoTrain();
		System.out.println(t.getSeats());
		
	    Passenger bob = new Passenger();
	    Passenger tom = new Passenger();
	    Passenger kat = new Passenger();
	    
	    t.add1Passenger(bob,tom,kat);
	    
	    Passenger[] uhg = new Passenger[20];
	    
	    for(Passenger u:uhg) {
	    	u=new Passenger();
	    	 t.add1Passenger(u);
	    	
	    }
	    
	   
	    
	    Passenger[] mf = new Passenger[4];
	    
	    for(int i=0;i<mf.length;i++) {
	    	mf[i]= new Passenger(0,1);
	    	t.add1Passenger(mf[i]);
	    }
	    
	    System.out.println(t.passengers);
	    
	    CargoTrain ct = new CargoTrain();
	    
	    Passenger[] scr = new Passenger[20];
	    
	    for(Passenger u:scr) {
	    	u=new Passenger();
	    	ct.add1Passenger(u);
	    }
	    
	    System.out.println(t.passengers);
	    
	    
		
		
		
		
		

	}
	
	

}
