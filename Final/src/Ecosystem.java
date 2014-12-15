import java.io.PrintWriter;
import java.util.ArrayList;


public class Ecosystem {
	
	/**
	 * This function adds a species to the array of species
	 * 
	 * @param s Species to add to the species array
	 */
	void addSpecies(Species s){
		arr_.add(s);
	}
	
	/**
	 * this is to find a species class given the name
	 * returns -1 if it cant find a speicies (- is used for no prey)
	 * 
	 * @param name
	 * @return -1 if no species found
	 * @return index of species in array if found
	 */
	int findSpecies(String name){
		if(name.equals("-")){
			return -1;
		}
		
		for(int i = 0; i < arr_.size(); i++){	//look through the array
			Species s = (Species) arr_.get(i);
			if(s.name_.equals(name)){	//if the names equal
				return i;	//return that index
			}
		}
	
		
		
		System.out.println("Error: No existing Species named: "+name);
		System.out.println("Likely input file mistake for prey");
		System.exit(0);
		return -1;
	}

	/**
	 * This function makes each species reproduce (from input file number)
	 * as well as consume (from input file number) their prey
	 */
	void nextMonth(){
		month_++;
		for(int i = 0; i < arr_.size(); i++){	//for each species
			Species s = (Species) arr_.get(i);	
			s.reproduce();  //reproduce that species
			try{  //in case findSpecies returns -1
				Species prey = (Species) arr_.get(findSpecies(s.prey_));
				s.eat(prey);  //eat prey if it has one
			}
			catch(IndexOutOfBoundsException e){
				//no prey
			}
		}	
	}
	
	/**
	 * prints the population of all species
	 * 
	 * @param writer for output file
	 */
	void printData(PrintWriter writer){
		writer.println("===============Month: "+ month_ +"===============");
		for(int i = 0; i < arr_.size(); i++){	//loop through species
			Species s = (Species) arr_.get(i);
			writer.println("\t"+s.name_+" : "+s.pop_); //print name and population
		}
	}
	
	
	
	//member variables
	int month_;
	ArrayList arr_ = new ArrayList<Species>();;
}
