import java.util.Scanner; //import scanner 
import java.lang.String;   
public class SeaCreature {

	/**
	 * Asks the user the first question and returns their response.
	 * 
	 * @param leScanner The Scanner object for getting user input in console.
	 * User inputs capital letter 
	 * Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response.
	 * 
	 *
	 * Asks the user the second question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response 
	 * 
	 * 
	 * Asks the user the third question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console 
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response 
	 * 
	 * 
	 * Asks the user the fourth question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console 
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response 
	 * 
	 *  
	 *  Asks the user the fourth question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console 
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response
	 * 
	 * 
	 *   Asks the user the fifth question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console 
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response 
	 * 
	 * 
	 *  Asks the user the sixth question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console 
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response 
	 * 
	 * 
	 *  Asks the user the seventh question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console 
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response 
	 * 
	 * 
	 *  Asks the user the seventh question and returns their response 
	 * 
	 * @param leScanner the scanner object for getting user input in console 
	 *  User inputs capital letter
	 *  Infinite while(true) loop to repeat question until valid answer given
	 * @return int The weighted user response 
	 * 
	 * 
	 * Method containing ranges to print final answer 
	 * @param total range accumulated answers 
	 * @return void 
	 * Prints final response
	 * 
	 *  Main method 
	 *  @param leScanner 
	 *  @return void 
	 *  totals for each question 
	 */

	public static int q1 (Scanner leScanner) { 
		while(true){ //infinite loop, repeats question until valid answer  
		
			System.out.println("1. Where would you want to live?"); 
			System.out.println("A. In the mountains B. A city C. The beach D. On a farm");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
			//if there is a valid answer input into the console will skip rest of if statements
			//move on to next question in next method 
			//prints answer then moves onto next question 
		
			if (answer.equals("A")){ 
				return 1; //return value to main method total count 	
			}
			if (answer.equals("B")){ 	
				return 2;	//return value to main method total count 	
			}
			if (answer.equals("C")){ 	
				return 3; //return value to main method total count 	
			}
			if (answer.equals("D")){
				return 4;	//return value to main method total count 	
			}
			System.out.println("Invalid answer, please enter single letter."); 
			//only prints if loop is engaged through invalid answer
		}
	}
	public static int q2 (Scanner leScanner) {
		while(true){ //infinite loop, repeats question until valid answer 
		
			System.out.println("2. What is your favorite color?");
			System.out.println("A. Green B. Blue C. Purple D. Red");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
			//if there is a valid answer input into the console will skip rest of if statements
			//move on to next question in next method 
			//prints answer then moves onto next question 
		
			if (answer.equals("A")){ 
				return 1;	//return value to main method total count 	
			}
			if (answer.equals("B")){ 	
				return 2;	//return value to main method total count 	
			}
			if (answer.equals("C")){ 	
				return 3;   //return value to main method total count 	
			}
			if (answer.equals("D")){
				return 4;	//return value to main method total count 	
			}
			System.out.println("Invalid answer, please enter single letter.");
			//only prints if loop is engaged through invalid answer
		}
	}
	public static int q3 (Scanner leScanner) {
		while(true){ //infinite loop, repeats question until valid answer 
		
			System.out.println("3. When you are at the beach do you?");
			System.out.println("A. Go wind surfing B. Lay in the sun C. Swim D. Make sandcastles");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
			//if there is a valid answer input into the console will skip rest of if statements
			//move on to next question in next method 
			//prints answer then moves onto next question 
			
			if (answer.equals("A")){ 
				return 1;	//return value to main method total count 	
			}
			if (answer.equals("B")){ 	
				return 2;	//return value to main method total count 	
			}
			if (answer.equals("C")){ 	
				return 3;   //return value to main method total count 	
			}
			if (answer.equals("D")){
				return 4;	//return value to main method total count 	
			}
			System.out.println("Invalid answer, please enter single letter.");
			//only prints if loop is engaged through invalid answer
		}
	}
	public static int q4 (Scanner leScanner) {
		while(true){ //infinite loop, repeats question until valid answer 
		
			System.out.println("4. What is your favorite class?");
			System.out.println("A. Creative Writing B. Math C. History D. Biology");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
			//if there is a valid answer input into the console will skip rest of if statements
			//move on to next question in next method 
			//prints answer then moves onto next question 
		
			if (answer.equals("A")){ 
				return 1;	//return value to main method total count 	
			}
			if (answer.equals("B")){ 	
				return 2;	//return value to main method total count 	
			}
			if (answer.equals("C")){ 	
				return 3;	//return value to main method total count 	
			}
			if (answer.equals("D")){
				return 4;	//return value to main method total count 	
			}
			System.out.println("Invalid answer, please enter single letter.");
			//only prints if loop is engaged through invalid answer
		}
	}
	public static int q5 (Scanner leScanner) {
		while(true){ //infinite loop, repeats question until valid answer 
		
			System.out.println("5. Which season do you enjoy most?");
			System.out.println("A. Fall B. Summer C. Winter D. Spring");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
			//if there is a valid answer input into the console will skip rest of if statements
			//move on to next question in next method 
			//prints answer then moves onto next question 
			
			if (answer.equals("A")){ 
				return 1;	//return value to main method total count 	
			}
			if (answer.equals("B")){ 	
				return 2;	//return value to main method total count 	
			}
			if (answer.equals("C")){ 	
				return 3;	//return value to main method total count 	
			}
			if (answer.equals("D")){
				return 4;	//return value to main method total count 	
			}
			System.out.println("Invalid answer, please enter single letter.");
			//only prints if loop is engaged through invalid answer
		}
	}
	public static int q6 (Scanner leScanner) {
		while(true){ //infinite loop, repeats question until valid answer 
		
			System.out.println("6. What is your favorite food?");
			System.out.println("A. Salad B. Cheeseburger C. Pasta D. Sushi");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
			//if there is a valid answer input into the console will skip rest of if statements
			//move on to next question in next method 
			//prints answer then moves onto next question 
		
			if (answer.equals("A")){ 
				return 1;	//return value to main method total count 	
			}
			if (answer.equals("B")){ 	
				return 2;	//return value to main method total count 	
			}
			if (answer.equals("C")){ 	
				return 3;	//return value to main method total count 	
			}
			if (answer.equals("D")){
				return 4;	//return value to main method total count 	
			}
			System.out.println("Invalid answer, please enter single letter.");
			//only prints if loop is engaged through invalid answer
		}
	}
	public static int q7 (Scanner leScanner) {
		while(true){ //infinite loop, repeats question until valid answer 
		
			System.out.println("7. What is your favorite kind of music?");
			System.out.println("A. Acoustic B. Rock C. Techno D. Jazz");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
			//if there is a valid answer input into the console will skip rest of if statements
			//move on to next question in next method 
			//prints answer then moves onto next question 
		
			if (answer.equals("A")){ 
				return 1;	//return value to main method total count 	
			}
			if (answer.equals("B")){ 	
				return 2;	//return value to main method total count 	
			}
			if (answer.equals("C")){ 	
				return 3;	//return value to main method total count 	
			}
			if (answer.equals("D")){
				return 4;	//return value to main method total count 	
			}
			System.out.println("Invalid answer, please enter single letter.");
			//only prints if loop is engaged through invalid answer
		}
	}
	
	public static void printCreature(int total) { 
		//System.out.println("This is the total: " + total);
		System.out.print("You are a: "); //prints on same line before answer 
		
		if (total <= 11){ //total value is 11 or less
			System.out.println("Turtle!!");  
		}
		if (total >= 12 && total <= 16){ //total value is between and includes 12 and 16
			System.out.println("Seal!!");
		}
		if (total >= 17 && total <= 22){ //total value is between and includes 17 and 22
			System.out.println("Dolphin!!");
		}
		if (total >= 23 && total <= 28){ //total value is between and includes 23 and 28
			System.out.println("Shark!!");
		}
	}
	public static void main (String []args) { //main method main arguments 
		
		Scanner leScanner = new Scanner(System.in); //naming scanner 
		
		//q1(leScanner); 
		
		int total = 0; //initial total 
	 	
		System.out.println ("What kind of sea creature are you?"); //
		System.out.println("Complete this quiz to find out!!"); 
		System.out.println(""); //blank line for some spacing when printed 
		
		total += q1(leScanner); 
		total += q2(leScanner); 
		total += q3(leScanner); 
		total += q4(leScanner); 
		total += q5(leScanner);
		total += q6(leScanner);
		total += q7(leScanner);
		//relays scanner into other methods 
		//initial values for questions one through seven
		//where value is kept after questions are answered 
		//adds the value for each answer input by user in console += 

		printCreature(total); 
		//relays total to printCreature method 
		//int total 

	}
	
}
