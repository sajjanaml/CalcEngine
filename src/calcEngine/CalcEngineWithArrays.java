package calcEngine;

public class CalcEngineWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int [4];
		a[0] = 1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		int[] b= {1,2,3,4};
		
		char[] opcode= {'a','s','d','m'};
		
		int[] result = new int[opcode.length];
		
		for(int i=0;i<opcode.length;i++) {
			switch (opcode[i]) {
			case 'a':
				result[i]=a[i]+b[i];
				
				break;
			case 's':
				result[i]=a[i]-b[i];
				break;
			case 'd':
				result[i]=b[i]!=0?a[i]/b[i]:0;
				break;
			case 'm':
				result[i]=a[i]*b[i];
				break;

			default:
				result[i]=0;
				System.out.println("invalid opcode");
				break;
			}
		}
		for(int op:result) {
			System.out.println(op);
		}
		/*for(int j=0;j<opcode.length;j++) {
			System.out.println(result[j]);
		}*/

		

	}

}
