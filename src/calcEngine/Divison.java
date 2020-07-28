package calcEngine;

public class Divison extends CalculateBase {
	
	public Divison(){};
	
	public Divison(int val1,int val2) {
		super(val1,val2);
	}
	
	@Override
	public void Calculator() {
		int result = getVal2()==0?0:getVal1()/getVal2();
		setResult(result);
	}
	

}
