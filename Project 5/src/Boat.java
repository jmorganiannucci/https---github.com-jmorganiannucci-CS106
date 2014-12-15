
public class Boat {
	//boats races
	Time[] raceTimes; //array for the boats time for each race 
	int raceTimesSize; //boats race 
	int boatNumber; //which boat it is 
	
	Time PR; //boats PR time
	Time aveTime; //boats average time 
/** 
 * @param none 
 * 
 * @return void 
 * prints the boat number (which boat it is)	
 */
	public void print(){
		System.out.println("Boat "+boatNumber+":"); 
		/*
		for(int i = 0; i <raceTimesSize; i++){
			System.out.print("Race "+(i+1)+": ");
			raceTimes[i].print();
			System.out.println();
		}
		*/
	}
/** 
* @param none 
* 
* @return void 
* constructor 
*/	
	public Boat(){
		
	}
}
