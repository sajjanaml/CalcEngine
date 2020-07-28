package loopspractice;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ival=1234;
		int count=0;
		while(ival!=0) {
			ival=ival/10;
			count++;
		}
		System.out.println(count);

	}

}
