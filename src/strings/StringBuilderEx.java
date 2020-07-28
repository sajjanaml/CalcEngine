package strings;

import flight.Flight;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(40);
		Flight myFlight = new Flight(175);
		String location = "Florida";
		
		sb.append("I flew to ");
		sb.append(location);
		sb.append(" on ");
		sb.append(myFlight);
		
		int time = 9;
		
		int pos = sb.length() - " on ".length() - myFlight.toString().length();
		
		/*System.out.println(sb.length());
		
		System.out.println("on".length());
		
		System.out.println(myFlight.toString().length());*/
		
		sb.insert(pos, " at ");
		sb.insert(pos+4, time);
		
		String message = sb.toString();
		
		System.out.println(message);

	}

}
