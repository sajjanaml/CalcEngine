package loopspractice;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val = {1,2,3,4};
	/*	val1[0]=1;
		val1[1]=2;
		val1[2]=3;
		val1[3]=4;
		*/
		int x=val.length;
		System.out.println("length of array = "+x);
		
		int sum=0;
		
		for(int i=0;i<val.length;i++) {
			sum=sum+val[i];
			
		}
		System.out.println(sum);
		
		
		
	}

}
