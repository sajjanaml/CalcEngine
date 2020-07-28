package calcEngine;

public class MathEquation {
	private int leftval;
	private int rightval;
	private char opcode;
	private int result;
	
	public void setLeftval(int leftval) {
		this.leftval = leftval;
	}
	
	public int getLeftval() {
		return leftval;
	}
	
	public void setRightval(int rightval) {
		this.rightval = rightval;
	}
	
	public int getRightval() {
		return rightval;
	}
	
	public void setOpcode(char opcode) {
		this.opcode = opcode;
	}
	
	public char getOpcode() {
		return opcode;
	}
	
	public int getResult() {
		return result;
	}
	
	
	public void execute() {
		switch (opcode) {
		case 'a':
			result=leftval+rightval;
			
			break;
		case 's':
			result=leftval-rightval;
			
			break;
		case 'm':
			result=leftval*rightval;
			
			break;
		case 'd':
			result=rightval!=0?leftval/rightval:0;
			
			break;

		default:
			System.out.println("Invalid opcode");
			result=0;
			break;
		}
	}

}
