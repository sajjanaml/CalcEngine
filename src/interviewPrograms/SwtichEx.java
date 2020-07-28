package interviewPrograms;

public class SwtichEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		
		switch(num%2){
			case 0:
				System.out.println(num);
				System.out.println("EVen");
				break;
			case 1:
				System.out.println(num);
				System.out.println("Odd");
				break;
			default:
				System.out.println("Zero");
				
		}

	}

}

