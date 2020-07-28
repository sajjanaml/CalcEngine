package revision;

public class ReturnTypeBasic {
	
	int a=10,b=5;
	
	public void Sum() {
		int c;
		c=a+b;
		System.out.println(c);
	};
	
	public int Sum2(int x,int y) {
		
		
		return x+y;
	}
	
	public static void main(String[] args) {
		
		ReturnTypeBasic obj1 = new ReturnTypeBasic();
		obj1.Sum();
		
		int m=1,n=2;
		
		int c=obj1.Sum2(m, n);
		
		System.out.println("Im a back");
		
		System.out.println(c);
		
		
		
	}
	
	

}
