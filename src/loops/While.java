package loops;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factocrial of 5= 5*4*3*2*1
		int ival=5;
		int fact =1;
		
		while(ival>1) {
			/*fact=fact*ival; //5*4*3*2*1
			ival--;*/
			fact*=ival;
			
		}
		System.out.println(fact);

	}

}
