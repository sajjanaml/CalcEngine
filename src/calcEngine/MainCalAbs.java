package calcEngine;

public class MainCalAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculateBase[] calculate = {
				new Adder(1,1),
				new Subtractor(1,1),
				new Divison(4,2),
				new Multiplication(5,5)
		};
		
		for(CalculateBase cal:calculate) {
			cal.Calculator();
			System.out.println(cal.getResult());
		}

	}

}
