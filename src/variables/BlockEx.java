package variables;

public class BlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=10,v2=5,diff;
		
		if(v1>v2)
		{	
			diff=v1-v2;
			System.out.println("v1 is greater and diff = "+diff);
			
			
		}
		
		
		
		else if(v2>v1)
		{ 	
		 diff=v2-v1;
		System.out.println("v2 is greate and diff = "+diff);
		}
		else
			System.out.println("v1 equal to v2");

	}

}
