package revision;

public class CalcEngArray {
	
	public static void main(String[] args) {
		
		int[] a = {2,4,6,8};
		int[] b = {1,2,3,4};
		
		char[] opcode = {'a','s','d','m'};
		int[] result = new int[opcode.length];
		
		for(int i=0;i<opcode.length;i++) {
			switch (opcode[i]) {
			case 'a':
				result[i]= a[i]+b[i];
				
				break;
				
			case 's':
				result[i]=a[i]-b[i];
				break;
			case 'd':
				result[i]=b[i]==0?0:a[i]/b[i];
				break;
			case 'm':
				result[i]=a[i]*b[i];
				break;

			default:
				System.out.println("Error- Invalid opcode");
				result[i]=0;
				break;
			}
		}
		
		for(int showresult:result) {
			System.out.println(showresult);
		}
		
	/*	for(int i=0;i<opcode.length;i++) {
		 System.out.println(result[i]);	
		}*/
		
		
		
	}
}
