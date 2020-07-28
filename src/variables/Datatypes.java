package variables;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		/*a=12;  // a 
		
		int b=24;
		
		
		*/
		
		System.out.println(a);
		
		short s=12333;
		long l =123456789076543L;
		byte b= 100;
		
		float f =12.24f;
		double d = 123.1234567898765D;
		
		char c= 'd';
		
		boolean bo = true;
		
		
		//Type Casting
		 int myVar1 = 127;  //32
		 long myVar2 = 1234567890982111L; //64
		 
	      myVar1 =(int) myVar2; //(long) value in to int value
	      
	      System.out.println(myVar1);
	      
	      
	      int var1 = 10;
	      
	      System.out.println(var1++); //10; postfix incre
	      
	      System.out.println(var1);
	      
	      int var2 = 5;
	      
	      System.out.println(++var2);  //6 prefix increment
	      
	      //Compount Assignment
	      
	     //+=; -=,
	      
	      int myval1 =50;
	      
	      int myval2 =100;
	      
	      int result = 500; 
	      
	      myval1+=5;
	      
	      //myval1 = myval1+5;
	      
	      System.out.println(myval1);
	      
	      result/=myval1+myval2;
	      
	      
	      //Operator Precedence
	      
	      int p1 = 5;
	      int p2 = 10;
	       int p3 =15;
	       int p4 =20;
	       
	       float p5 = p4-p2/p1*p3;  //result 
	       System.out.println("Value of p5 " +p5);
	      
	       
	       //Assignment
	       
	     /*All datatype (integer,float,char,boolean)
	      * type cast
	      * Math operators
	      * Sum of two number (+,-,/,*,%)
	      * Post fix and prefix (++,--)
	      * Compount assignment (+=, -+ *= /+)
	      
	      * 
	      * */
	      
	       
	       float x = 13.0f;
	       float y = 5.0f;
	       
	       float z =  x/y;
	       
	       System.out.println("val of z = "+z);
	      
	      
	      
	      
	      
	      
	      
	      
	      
		 
		 

	}

}
