/**
 * 
 * @author JuliaIannucci
 *
 */

public class RowingRaces {

/** 
 * 	
 * @param args
 * program arguments 
 * 
 * @return 
 * void 
 */
	
	public static void main (String [] args){ //first thing that runs in whole program 
		//System.out.println("Hello World! :)");
		Team myTeam = new Team(); //creates a new team, goes to team class readInData 
		myTeam.readInData(); //call the function to read input 
		//myTeam.print();
		myTeam.parse(); // parse input (take a sentence and describe its different parts)
		myTeam.printOutAnalysis(); //print out results 
		//System.out.println("Done");
	}
}
