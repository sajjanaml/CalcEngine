package variables;

public class IfPractise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1;//declaration for single variable
		v1=10; //Initatialization
		int v2=15; //dec +intiz
		
		//int v3=15,v4=20; //dec+init for multiple variables with same datatype
	/*	
		if(v1>v2)
			System.out.println("V1 is bigger");    //Basic if
		else
			System.out.println("V1 is not bigger");*/
		
		if(v1>v2)
			System.out.println("V1 is greater"); 
		else if(v2>v1)
			System.out.println("V2 is greate");
		else
			System.out.println("V1==V2");
		

	}

}
