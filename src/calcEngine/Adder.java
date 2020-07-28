package calcEngine;

public class Adder extends CalculateBase {
	
	
	
	 public Adder(){}
	
	 public  Adder(int val1,int val2) {
		 super(val1,val2);
		 
	 }
	 
	 @Override
	 public void Calculator() {
		int result =getVal1()+getVal2();
		setResult(result);
	 }
	 
	 
}
