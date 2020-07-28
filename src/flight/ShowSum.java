package flight;

public class ShowSum {

	
		// TODO Auto-generated method stub
		
		public void Sum(float x,float y,int count){
			float z=x+y;
			if(count<1)
				return;
			for(int i=0;i<count;i++) {
				System.out.println(z);
				
			}
			return;
			
		}
		
		public static void main(String[] args) {
			ShowSum obj = new ShowSum();
			obj.Sum(3, 5, 0);
			System.out.println("I am back");
		}
	

}
