package strings;

public class WrapperClassEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = 10*10*10;
		Integer a1= 100*10;
		
		if(a==a1) {
			System.out.println("a==a1");
		}
		else
			System.out.println("Not Equal");
		
		if(a.equals(a1)) {
			System.out.println("True");
			
		}
		else
			System.out.println("False");
		
		Integer b=4*2;
		Integer b1=2*2*2;
		
		if(b==b1) {
			System.out.println("b==b1");
		}
		else
			System.out.println("b!=b1");
		
		
		

	}

}
