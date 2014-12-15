import java.io.*;
import java.util.*;

public class Finance {

/** 
 * 
 * @param method one -- do work
 * does mathematical work for checking, savings, credit 
 * subtracts for withdrawal 
 * adds for deposit 
 * @return void 
 * keeps track of totals for each account 
 * 
 * 
 * @param method two -- process line 
 * @return strings, double 
 * 
 * @param main method -- 
 * throws file not found exception 
 * input scanner 
 * print statements 
 * create bank account that runs with constructor  
 * @return void 
 */
	
	
	
	
	
	
	public static void doWork(BankAccount ba, String account, String action, Double amount){
		//need: the bankaccount, account, action, amount
		if(account.equals("Checking")){
			if(action.equals("Withdrawal")){
				ba.checking = ba.checking - amount; //mathematical procedures 
			}
			else if(action.equals("Deposit")){
				ba.checking = ba.checking + amount; //mathematical procedures
			}
			else if(action.equals("Opening")){
				ba.checking = amount;
			}
		}
		else if(account.equals("Savings")){
			if(action.equals("Withdrawal")){
				ba.savings = ba.savings - amount; //mathematical procedures
			}
			else if(action.equals("Deposit")){
				ba.savings = ba.savings + amount; //mathematical procedures
			}
			else if(action.equals("Opening")){
				ba.savings = amount;
			}
		}
		else if(account.equals("Credit")){
			if(action.equals("Withdrawal")){
				ba.credit = ba.credit - amount; //mathematical procedures
			}
			else if(action.equals("Deposit")){
				ba.credit = ba.credit + amount; //mathematical procedures
			}
			else if(action.equals("Opening")){
				ba.credit = amount;
			}
		}
		
	}
	
	
	
	public static void processLine(String line, BankAccount ba){ //state names of strings 
		//System.out.println(line); //prints input 
		//System.out.println("========================================");
		Scanner lineProcessor = new Scanner (line);
		
		String skip = ""; //define string 
		
		String account = "";
		String action = "";
		Double amount = 0.0; //double because decimal 
		
		skip = lineProcessor.next();	//date, don't need it
		//System.out.println(skip);
		
		//first objective: which account is it coming from, checking, savings, cc
		//second objective: figure out if withdrawl or deposit, opening bal 
		//third objective: figure out amount to withdraw/ deposit / set opening 
		
		account = lineProcessor.next();	//checking/saving/credit
		//System.out.println(account);
		
		if(account.equals("Checking")){
			action = lineProcessor.next();	//withdrawal/deposit/opening
			//System.out.println(action);
			
			if(action.equals ("Opening")){
				skip = lineProcessor.next();	//balance, don't need it
				//System.out.println(skip);
			}
			
			amount = lineProcessor.nextDouble();
			//System.out.println(amount);
			
			//good to go
			doWork(ba, account, action, amount); //sends information to doWork method 
			
		}
		else if(account.equals("Savings")){
			action = lineProcessor.next();	//withdrawal/deposit/opening
			//System.out.println(action);
			
			if(action.equals ("Opening")){
				skip = lineProcessor.next();	//balance, don't need it
				//System.out.println(skip);
			}
			
			amount = lineProcessor.nextDouble();
			//System.out.println(amount);
			
			//good to go
			doWork(ba, account, action, amount);
		}
		else if(account.equals("Credit")){
			skip = lineProcessor.next(); //skip second word dont need
			//System.out.println(skip);	//"card", dont need it
			
			action = lineProcessor.next();	//withdrawal/deposit/opening
			//System.out.println(action);
			
			if(action.equals ("Opening")){
				skip = lineProcessor.next();	//balance, don't need it
				//System.out.println(skip);
			}
			
			amount = lineProcessor.nextDouble();
			//System.out.println(amount);
			
			//good to go
			doWork(ba, account, action, amount);
		}
		
		
		
		
	  
	}
	
	public static void main (String [] args) throws FileNotFoundException{ //program wont crash if file isnt found 
		BankAccount ba = new BankAccount(); //creating bank account, runs constructor 
		
		Scanner fileReader = new Scanner(new File("src/input.txt")); //creates scanner referencing to input.txt

		System.out.println("-----------------OPENING BALANCES----------------"); //for aesthetics 
		System.out.println("Checking: "+ba.checking);
		System.out.println("Savings: "+ba.savings);
		System.out.println("Credit: "+ba.credit);
		
		
		while (fileReader.hasNextLine()) { //allows program to run until no more lines in input.txt
			processLine(fileReader.nextLine(),ba); //file reader gets line from input and calls process line function 
			System.out.println("================BALANCES=================="); //for aesthetics
			System.out.println("Checking: "+ba.checking);
			System.out.println("Savings: "+ba.savings);
			System.out.println("Credit: "+ba.credit);
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~CLOSING BALANCES~~~~~~~~~~~~~~~"); //for aesthetics
		System.out.println("Checking: "+ba.checking);
		System.out.println("Savings: "+ba.savings);
		System.out.println("Credit: "+ba.credit);
		
		
		
	}	
	


	
}




