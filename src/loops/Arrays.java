package loops;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ival = new int[4];
		ival[0]=1;
		ival[1]=2;
		ival[2]=3;
		ival[3]=4;	
		
		int[] a = new int[]{1,2,3};
		
		System.out.println(a[0]);
		int sum =0;
		
	/*	for(int i=0;i<ival.length;i++) {
			sum+=ival[i];
		}
		System.out.println(sum);*/
		
		for(int vals:ival) {
			sum+=vals;
		}
		System.out.println(sum);

	}

}
