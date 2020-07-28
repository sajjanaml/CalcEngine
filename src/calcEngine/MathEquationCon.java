package calcEngine;

public class MathEquationCon {
	public int leftVal;
	public int rightVal;
	public char opCode;
	public int result;
	
	public MathEquationCon() {}
	
	public MathEquationCon(char opCode){
		this.opCode=opCode;
		
	}
	
	public MathEquationCon(char opCode,int leftVal,int rightVal) {
		this(opCode);
		this.leftVal=leftVal;
		this.rightVal=rightVal;
	}
	
	public void execute(int leftVal,int rightVal) {
		this.leftVal=leftVal;
		this.rightVal=rightVal;
		execute();
		
		
	}
	
	public void execute(){
		switch(opCode) {
		case 'a':
			result=leftVal+rightVal;
			break;
		case 's':
			result=leftVal-rightVal;
			break;
		case 'm':
			result=leftVal*rightVal;
			break;
		
		case 'd':
			result=rightVal!=0?leftVal/rightVal:0;
			break;
		default:
			System.out.println("Error Invalid Opcode");
			result = 0;
		}
		
	}
	

	
	

}
