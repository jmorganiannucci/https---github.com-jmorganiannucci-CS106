
public class Species {
	
	/**
	 * constructor for Species
	 * 
	 * @param name name of species
	 * @param pop how many organisms
	 * @param prey what species do they eat
	 * @param cons how much prey do they consume
	 * @param repr how many organisms are reproduced
	 */
	Species(String name, int pop, String prey, int cons, int repr){
		name_ = name;
		pop_ = pop;
		prey_ = prey;
		cons_ = cons;
		repr_ = repr;
	}
	
	/**
	 * Returns the name of the current species
	 * 
	 * @return the name of the species
	 */
	String getName(){
		return name_;
	}
	
	/**
	 * Tries to eat the number of prey from the input consumption
	 * (times the current species' population)
	 * If there are not enough prey, kill all organisms that couldnt eat
	 * 
	 * @param prey the species that this species eats
	 */
	void eat(Species prey){	//returns how many are eaten
		if(!prey.name_.equals(prey_)){
			return;
		}
		int numFedOrg = 0;		//number of predators fed
		int numEatenOrg = 0;	//number of prey eaten
		//while prey population is greater than consumption and
		//all organisms havent been fed
		while(prey.pop_ > cons_ && numFedOrg<pop_){
			prey.die(cons_);	//prey dies
			numFedOrg++;		//predator lives
		}
		die(pop_-numFedOrg);	//kill all predators that couldn't eat
	}
	
	/**
	 * subtracts from the population "deaths" number of organisms
	 * 
	 * @param deaths number of organisms to die
	 */
	void die(int deaths){
		pop_-=deaths;	//subtract the population
		if(pop_<0){		//(dont go negatives)
			pop_=0;
		}
	}
	
	/**
	 * Checks if a species can reproduce
	 * 
	 * @return true: population > 0
	 * @return false: populations = 0
	 */
	Boolean canReproduce(){
		if(pop_ > 0){
			return true;
		}
		return false;
	}
	
	/**
	 * adds reproduction to population
	 */
	void reproduce(){
		if(canReproduce()){
			pop_+=repr_;	//add reproduction to population
		}
	}
	
	
	String name_;	//species name
	int pop_;		//population
	String prey_;	//prey
	int cons_; 		//amount of consumption
	int repr_;		//amount of reproduction
	
}
