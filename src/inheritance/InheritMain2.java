package inheritance;

public class InheritMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Train t = new CargoTrain();
		//Train t2 = new CargoTrain(20);
		
		Train t1 = new Train();
		
		CargoTrain ct = new CargoTrain();
		
		System.out.println(t.getSeats());
		System.out.println(t1.getSeats());
		System.out.println(ct.getSeats());
		
		
		
		
		/*System.out.println(t2.seats);
		
		System.out.println(t.seats);*/
		Passenger bob = new Passenger();
		t.add1Passenger(bob);
		System.out.println(t.passengers);
		
		System.out.println(t);
		

	}

}
