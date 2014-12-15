import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Do you want to add or multiply or divide"); 
		System.out.println("Type 1 to add, type 2 to multiply, 3 to divide, 4 to subtract!!");
		int option = in.nextInt();
		System.out.println(option);
		
		
		System.out.println("Whats your first number?");
		int x=0; 
		
		x = in.nextInt();
		System.out.println(x);
		
		System.out.println("Whats your second number?");
		int y = in.nextInt();
		System.out.println(y); 
		
		if(option == 1){
			//System.out.println ("I present you with the sum");
			int z = x + y;  
			//System.out.println(z);
			System.out.println(x + "+"+ y + "=" + z);  	
			
		}
		
			if(option == 2){
				//System.out.println ("I present you with the sum");
				int z = x * y;  
				//System.out.println(z);
				System.out.println(x + "*"+ y + "=" + z);  
		}

			if(option == 3){
				//System.out.println ("I present you with the sum");
				int z = x / y;  
				//System.out.println(z);
				System.out.println(x + "/"+ y + "=" + z);  
			}
		
			if(option == 4){
				//System.out.println ("I present you with the sum");
				int z = x - y;  
				//System.out.println(z);
				System.out.println(x + "-"+ y + "=" + z);  
			}
		
	
	}

}
