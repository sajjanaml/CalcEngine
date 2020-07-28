package strings;

public class PrimitiveAndWrapperClassConversn {

	public static void main(String[] args) {
		Integer a =10;
		int b =a;
		Integer c=b;
		//System.out.println(a);
		
		Integer d = Integer.valueOf(100);
		int e = d.intValue();
		Integer f = Integer.valueOf(e);
		
		String s ="87.54";
		
		float fval = Float.parseFloat(s);
		
		System.out.println(fval);
		
		Float fval2 = Float.valueOf(fval);
		
		System.out.println(fval2);

	}

}
