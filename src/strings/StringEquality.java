package strings;

import flight.Flight;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I love";
				s1+="Java";
				
				System.out.println(s1);
				
		String s2 = "I love";
				s2+="Java";

//s1==s2 whether both s1 and s2 are pointed same object or not				
	/*	if(s1==s2) {
			System.out.println("S1=s2");
		}*/
		
//s1.equlas(s2) compares each and every character 
		
		if(s1.equals(s2)) {
			System.out.println("s1=s2");
		}
		
		String s3=s1.intern();
		String s4=s2.intern();
		
		if(s3==s4) {
			System.out.println("S1=s2");
		}
		
//TOString
		
		Flight myFlight = new Flight(175);
		Flight myFlight2 = new Flight('A');
		System.out.println(myFlight);
		System.out.println(myFlight2);
				
				

	}

}
