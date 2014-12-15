
/**
 * 
 *@author JuliaIannucci
 *simple class to store time borrowed from previous code  
 */
public class Time {
	int minutes;
	int seconds;

/** 
 * @param none 
 * 
 * @return void 
 * prints out the time in proper digital format 	
 */
	public void print(){
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

/** 
 * @param none 	
 * @return int 
 * represents minutes and seconds 
 * used for comparing times between boats 
 */
	public int totalTimeSec(){
		return (minutes*60)+seconds;
	}
	
/** 
 * 
 * @param totalSec
 * int representing total time in seconds 
 * 
 * @return void
 * constructor 1 
 */
	
	public Time(int totalSec){
		minutes = totalSec/60;
		seconds = totalSec%60;
	}
/** 
 * 	
 * @param mins
 * int representing number of minutes 
 * @param sec
 * int representing number of seconds 
 * 
 * @return void
 * constructor 2  
 */
	public Time(int mins, int sec){ 
		minutes = mins;
		seconds = sec;
	}
	
}
