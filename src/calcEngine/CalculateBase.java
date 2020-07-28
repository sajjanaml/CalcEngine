package calcEngine;

public abstract class CalculateBase {
	private int val1;
	private int val2;
	private char opcode;
	private int result;
	
	public int getVal1() {
		return val1;
	}
	
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	
	public int getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	public char getOpcode() {
		return opcode;
	}
	public void setOpcode(char opcode) {
		this.opcode = opcode;
	}
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public CalculateBase() {}
	public CalculateBase(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
	}
	
	public abstract void Calculator();
	

	
	

}
