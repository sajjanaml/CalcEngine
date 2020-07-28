package variables;

public class ParameterImmutablityPrimitiveTypes {
	
	
	public void swap(int i,int j) {
		int k=i;
		i=j;
		j=k;
		
		System.out.println(i);
		System.out.println(j);
		
		
	}
	public static void main(String[] args) {
		
		ParameterImmutablityPrimitiveTypes obj = new ParameterImmutablityPrimitiveTypes();

		int val1 =10,val2=20;
		
		System.out.println(val1);
		System.out.println(val2);
		
		obj.swap(val1, val2);
		

		System.out.println(val1);
		System.out.println(val2);
		
		

		
		
	}

}
