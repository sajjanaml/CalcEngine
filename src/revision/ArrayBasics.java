package revision;

public class ArrayBasics {
	
	public static void main(String[] args) {
		int[] a = new int[4];
		 a[0] = 1;
		 a[1]=2;
		 a[2]=3;
		 a[3]=4;
		 
			

		 
		 int[] b = {2,4,6,8}; //shrt way
		 
		 int sum=0;
		 
		/* for(int i=0;i<b.length;i++) {
			 sum+=b[i];
		 }*/
		 
		 for(int totalsum:b) {
			 sum+=totalsum;
		 }
		 
		 System.out.println(sum);
		 
		
	}

}
