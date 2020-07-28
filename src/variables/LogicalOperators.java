package variables;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=20,c=30;
		
		if(a>b&a>c) {
			System.out.println("a is greater"+a);
		}
		else if(b>a&b>c) {
			System.out.println("b is greate"+b);
		}
		else
			System.out.println("C is greater"+c);

	}

}
