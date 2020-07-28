package classes;

public class TrainMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Train venkatadriexp; //object declaration
		venkatadriexp= new Train();  //object creation
		
		for(int i=0;i<10;i++) {
			venkatadriexp.add1Passenger();
			
		}
		
		
		
	/*	System.out.println(venkatadriexp.passengers);
		System.out.println(venkatadriexp.seats);
		*/
		//venkatadriexp.seats=200;
		
		/*System.out.println(venkatadriexp.seats);*/
		
		System.out.println(venkatadriexp.getPassengers());
		
		Train mumbaiexp = new Train();
		
		for(int i=0;i<100;i++) {
			mumbaiexp.add1Passenger();
		}
		System.out.println(mumbaiexp.getPassengers());
		System.out.println(mumbaiexp.getSeats());
		
		
		
		
		
		

	}

}
