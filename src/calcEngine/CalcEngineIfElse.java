package calcEngine;

public class CalcEngineIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int a=10,b=0;
	  int result;
	  char opcode='d';
	  
	  if(opcode=='a') {
		  result=a+b;
		  
	  }
	  else if(opcode=='s') {
		  result=a-b;
	  }
	  else if(opcode=='d') {
		  result=b>0?a/b:0;
		  
	  }
	  else if(opcode=='m') {
		  result=a*b;
	  }
	  else {
		  result=0;
		  System.out.println("Invalid opcode");
	  }
	  
	  System.out.println("Result of a & b = "+result);
		 

	}

}
