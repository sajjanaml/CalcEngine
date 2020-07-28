package loopspractice;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ival=5;
		do {
			System.out.print(ival);
			System.out.print(" * 2 = ");
			ival=ival*2;
			System.out.println(ival);
		}while(ival<100);

	}

}
