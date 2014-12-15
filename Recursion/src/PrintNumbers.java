
public class PrintNumbers {

	public static void main(String[] args) {
	//recursion(10); 
	System.out.print(countSum(10));
	
	}
	
	//public static void recursion(int x){
		//if (x > 0){
		//recursion (x-1); //wont print zero
		//System.out.println(x);
		
		//}
		
	//}
	
	public static int countSum(int max) {
		if (max > 1){ 
			return max + countSum(max - 1);
	
			
		}
		
		return 1;
		
	}

}
