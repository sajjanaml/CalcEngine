package calcEngine;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] statements = {
				"add 1 2",
				"subtract 4 2",
				"multiply 2 2",
				"divide 4 2"
		};
		
		CalculateHelper helper = new CalculateHelper();
		for(String statement:statements) {
			helper.process(statement);
			System.out.println(helper);
		}

	}

}
