import java.io.*;
import java.util.*;

/** 
 * 
 * @author JuliaIannucci
 * 
 */

public class Team {
	String name; // name of team 
	Boat[] boats; //array of boats, list of boats represented in an array 
	int boatsSize; //number of boats on the team 
	
	Boat bestAveTime = null; //boat with the best average time 
	Boat worstAveTime = null; //boat with the worst average time 
	
	Boat bestPR = null; //boat with the best PR
	Boat worstPR = null; //boat with the worst PR

/**
 * @param none 
 * 
 * @return void 
 * reads in the input file token by token 
 * creates a boat for each boat 	
 */
	
	public void readInData(){ //method that pulls input from file 
		try { //instead of throwing an exception, exception that its catching is file not found
			  //you dont want your program to crash if it cant find the file 
			Scanner fileReader = new Scanner(new File("src/input.txt")); //scanner for input 
			int boatCounter = 0;
			int numRaces = 0;
			String skip;
			while (fileReader.hasNext()) { //while there are tokens in the file they will be read until there are no more
				String token = fileReader.next(); //reads each token 
				
				if(token.equals("Team:")){
					name = fileReader.next();
					//if token equals team the next token is the name 
				}
				if(token.equals("NumBoats:")){
					int numBoats = Integer.parseInt(fileReader.next());
					boats = new Boat[numBoats]; //create the array of boats 
					//if token equals NumBoats the next token is the number of boats 
				}
				if(token.equals("NumRaces:")){
					numRaces = Integer.parseInt(fileReader.next()); 
					//if token equals NumRaces the next token is the race number (number of races)
				}
				if(token.equals("Boat")){
					//if token equals boat, read in all boat race times 
					skip = fileReader.next();	//skip the number of the boat
					Boat temp = new Boat(); //creating a new boat 
					//setting the number of races and boat number 
					//create an array of times 
					temp.raceTimesSize = numRaces; 
					temp.raceTimes = new Time[numRaces];
					temp.boatNumber = boatCounter+1;
					for(int i = 0; i < numRaces; i++){
					//read in all of the races 
					//for loop, it will run in increments of one until it hits five 
				
						
						skip = fileReader.next();	//skip "Race"
						skip = fileReader.next();	//skip race number
						String raceTime = fileReader.next();
						int mins = Integer.parseInt(raceTime.split(":")[0]);
						int secs = Integer.parseInt(raceTime.split(":")[1]);
						temp.raceTimes[i] = new Time(mins, secs);
						//race times sets each race time to a time variable storing the time 
					}
					boats[boatCounter] = temp;
					//puts the boat on the team  
					//look at the list of boats and look at the boat counter and sets it equal to temp
					//boatCounter looks at the boat that was just created 
					
					boatCounter++; 
					//go to the next boat on the team 
				}
				
				
			}
		boatsSize = boatCounter; 
		//set the number of boats on the team 
		
		
		
		
		} catch (FileNotFoundException e) { //if file not found 
			System.out.println("Could not find input file");
			// TODO Auto-generated catch block
			e.printStackTrace(); //the exception is stored in the variable e, automatically generated info about exception
		}
		
		
		
	}
	/** 
	 * @param none  
	 * 
	 * @return void 
	 * print to help me code 
	 */
	public void print(){ //calls print of all the boats 
		for(int i = 0; i < boatsSize; i++){
			//for every boat print it out 
			//only five boats, 0-4 
			boats[i].print();	
		}
		
	}
	
	/**
	 * @param none 
	 * 
	 * @return void 
	 * formula to compute the boat average times
	 * finds best and worst average 
	 * formula to compute best time for boats 
	 * 	finds best and worst person records 
	 */
	public void parse(){
		//compute all averages
		for(int i = 0; i < boatsSize;i++){
			int totalTime = 0;
			//loop through all races of a boat, calculate total time 
			for(int j = 0; j < boats[i].raceTimesSize; j++){
				totalTime += boats[i].raceTimes[j].totalTimeSec();
			}
			//set average time which equals total time divided by the number of races 
			Time ave = new Time(totalTime/boats[i].raceTimesSize);
			boats[i].aveTime = ave;
		}
		
		//find the max and minimum average for times 
		int max = -999999;
		int min = 999999;
		
		//index of best and worst average times 
		int maxIndex = -1;
		int minIndex = -1;
		
		for(int i = 0; i < boatsSize; i++){
			if(max < boats[i].aveTime.totalTimeSec()){
				//if you find a worse average time set it to the new worst time 
				max = boats[i].aveTime.totalTimeSec();
				maxIndex = i;
			}
			if(min > boats[i].aveTime.totalTimeSec()){
				//if you find a better average time set it to the new best time 
				min = boats[i].aveTime.totalTimeSec();
				minIndex = i;
			}
		}
		
		//set the team best and worst averages 
		bestAveTime = boats[minIndex];
		worstAveTime = boats[maxIndex];
		
		
		//looks at every boat and keeps track of the best and worst times seen 
		//if it finds a better best or a worse worst then it stores those times 
		//at the end you are left with the absolute best and worst times 
		
		
		
		
		for(int i = 0; i < boatsSize;i++){
			//sets the PR of all boats 
			//looks at every boats time and keeps track of the best time 
			//if it finds a better best then it sets it at the end as the absolute best 
			min = 999999;
			minIndex = -1;
			//loop through all races of a boat
			for(int j = 0; j < boats[i].raceTimesSize; j++){
				if(min > boats[i].raceTimes[j].totalTimeSec()){
					min = boats[i].raceTimes[j].totalTimeSec();
					minIndex = j;
				}
			}
			boats[i].PR = boats[i].raceTimes[minIndex];
			//set the PR 
		}
		
		
		max = -999999;
		min = 999999;
		
		//Index of best and worst PR times 
		maxIndex = -1;
		minIndex = -1;
		
		for(int i = 0; i < boatsSize; i++){
			if(max < boats[i].PR.totalTimeSec()){
				max = boats[i].PR.totalTimeSec();
				maxIndex = i;
			}
			if(min > boats[i].PR.totalTimeSec()){
				min = boats[i].PR.totalTimeSec();
				minIndex = i;
			}
		}
		
		//set the teams best and worst PR times 
		bestPR = boats[minIndex];
		worstPR = boats[maxIndex];
		
		//looks at every boat and keeps track of the best and worst PR
		//if it finds a better best or a worse worst then it stores those PR times 
		//at the end you are left with the absolute best and worst PR times 
				
		
		
	}
	
	/**
	 * @param none 
	 * 
	 * @return void 
	 * print functions 
	 * 	prints boats with worst and best times 
	 * 	prints boats with best and worst personal records 
	 */
	
	//print out all accumulated data 
	public void printOutAnalysis(){
		System.out.println("Best Average Time:");
		System.out.print("\t");
		bestAveTime.print(); 
		System.out.print("\tWith an Average Time of ");
		bestAveTime.aveTime.print();
		System.out.println();
		//prints boat with best average time 
		
		System.out.println("Best Personal Record:");
		System.out.print("\t");
		bestPR.print();
		System.out.print("\tWith a record of ");
		bestPR.PR.print(); 
		System.out.println();
		//prints boat with best personal record time 
		
		
		
		
		
		System.out.println("Worst Average Time:");
		System.out.print("\t");
		worstAveTime.print();
		System.out.print("\tWith an Average Time of ");
		worstAveTime.aveTime.print();
		System.out.println();
		//prints boat with worst average time 
		
		System.out.println("Worst Personal Record:");
		System.out.print("\t");
		worstPR.print();
		System.out.print("\tWith a record of ");
		worstPR.PR.print();
		System.out.println();
		//prints boat with worst personal record 
		
		
	}
	/** 
	 * @param none 
	 * 
	 * @return void 
	 * constructor 
	 */
	public Team(){
		
	}
}
