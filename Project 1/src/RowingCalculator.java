import java.util.Scanner; //Import scanner library for user input in console for program 
public class RowingCalculator {
	
	
	
	//to create a a new method:
	//public static returnType name( arguments ){   what your method does   }
	//return types:
	//-void:nothing
	//-int: int 
	//arguments: type of integer, name of integer
	
	
	
	public static void calculateSplitAverage(Scanner myScanner){ //method one

		System.out.println("What is your time in minutes?");
		int minutes = myScanner.nextInt(); 		//single = assigns a variable to a value 
		System.out.println("What is your time in seconds?");
		int seconds = myScanner.nextInt();
		
		//begin calculations
		//Step 1: multiply minutes by 60 to convert into seconds then add remaining seconds  
		int totalTimeInSec = (minutes * 60) + seconds;   
		System.out.println("Total time in seconds: " +totalTimeInSec);  //to concatenate letters and variables together add +
		
		
		//Step 3: take total time and divide by 4 to determine time per 500 meters 
		int timePerFive = (totalTimeInSec/4);
		System.out.println("Time per 500 meters: " +timePerFive +" seconds" ); 
		
		
		//Step 4: need to convert time per 500 meters back into minutes and seconds 
		int splitInMins = (timePerFive /60); 
		int splitInSecs = (timePerFive %60);//modulus used for the reamainder 
		System.out.println("I present you with your split average.");
		
		timePrint(splitInMins, splitInSecs);
		
		
		
	}
	
	//print split 
	public static void timePrint (int minutes, int seconds){ 
		if (seconds == 0){ //if split in seconds is equal to a value of zero then a second zero also needs to be printed 
			System.out.println(minutes +":"+ seconds +"0"); //print statement that adds on additional zero 
		}	
		
		else if(seconds < 10){ 	//unless the seconds value is going to be less than 10 (09,08,07...) 
									//skip first if, there needs to be a zero in front of the single printed number (2:9 -> 2:09)
			System.out.println(minutes +":0"+ seconds); 
			
		}
		else{ //if the previous if and else if statements are not true they will skip and print regularly without zeros 
			System.out.println(minutes +":"+ seconds);
			
		}
	
	}
		
	
	
	public static void calculateTime (Scanner myScanner){ //method two 
		System.out.println("What is your split average in minutes?"); 
		int splitMin = myScanner.nextInt(); 
		System.out.println("What is your split average in seconds?");
		int splitSec = myScanner.nextInt();
		
		//begin calculations to find time 
		//first have to ask user for input in console using scanner
		
		//step 1: user knows split average and distance, so convert split average (mins and secs) to seconds 
		int splitAvgInSec = (splitMin * 60) + splitSec ;
		System.out.println ("Split average in seconds:" +splitAvgInSec );
		
		//step 2: find the total time in seconds, simple calculations  
		int totalTimeInSec = (splitAvgInSec * 4); 
		
		//step 3: convert total time in sec to minutes and seconds format 
		int totalTimeMin = (totalTimeInSec/ 60);
		int totalTimeRem = (totalTimeInSec % 60); //using modulus (%) for remainder of seconds 
		
		System.out.println("I present you with your time."); //actual printing of statement below 
		//System.out.println (totalTimeMin+":"+totalTimeRem); 
		
		timePrint(totalTimeMin,totalTimeRem); 
	}
	
	
	

	

	
	public static void main(String[] args) { //main method of program (first task that prints in console)
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in); 
		System.out.println("Do you want to know your time or your split average for a 2k?"); 
		System.out.println("Press 1 to calculate split average and 2 to calculate time."); //Asks user for their option 
		int option = myScanner.nextInt(); //Read in option from user in console 
		System.out.println(option); //Print option back to user 
		
		if (option == 1){ //enter time in minutes, then seconds "==" asks if the variable is equal to some value
			calculateSplitAverage(myScanner); //calculateSplitAverage, name for the method with , allows use of scanner in method
		}
		if (option == 2){ //enter split average in minutes, then seconds
			calculateTime(myScanner); //calculateTime, name for the method that contains procedures, allow use of scanner in method
			
	
			
			
			
			
			
			
		}
			
		

	}
		
		
		
}