package calcEngine;

public class MainCon1 {

	public static void main(String[] args) {
		
		MathEquationCon[] equations = new MathEquationCon[4];
		equations[0]= new MathEquationCon('a',1,1);
		equations[1]= new MathEquationCon('s',1,1);
		equations[2]= new MathEquationCon('m',1,1);
		equations[3]= new MathEquationCon('d',1,1);


	for(MathEquationCon eq:equations) {
		eq.execute();
		System.out.println(eq.result);
	}
	
	System.out.println();
	System.out.println("Math Equation");
	System.out.println();
	
	 int leftVal = 8;
	 int rightVal = 4;
	  
	 MathEquationCon equationOverload = new MathEquationCon('d');
	 equationOverload.execute(leftVal, rightVal);
	 
	 System.out.println(equationOverload.result);
	
	

}
}

