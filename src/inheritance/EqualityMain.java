package inheritance;

public class EqualityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t1 = new Train(175);
		//Train t2 = new Train(175);
		Train t2=t1;
		
		if(t1==t2) {
			System.out.println("Equal");
		}
		
		if(t1.equals(t2)) {
			System.out.println("Equal");
		}

	}

}
