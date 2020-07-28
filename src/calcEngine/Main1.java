package calcEngine;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathEquation[] equations = new MathEquation[4];
		equations[0] = create(1,1,'a');
		equations[1] = create(1,1,'s');
		equations[2] = create(1,1,'m');
		equations[3] = create(1,1,'d');
		
		for(MathEquation equation:equations) {
			equation.execute();
			System.out.println(equation.getResult());
		}
		
		
		
		

	}
	
	public static MathEquation create(int leftval,int rightval,char opcode){
		MathEquation eq = new MathEquation();
		eq.setLeftval(leftval);
		eq.setRightval(rightval);
		eq.setOpcode(opcode);
		return eq;
		
		
	}

}
