import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class main {
	
	
	/**
	 * This function is run at the start of the program.  It reads in the data and constructs
	 * the ecosystem class with all the species.  It also asks for the number of months and
	 * 
	 * 
	 * @param args	Doesn't take program arguments
	 * @throws FileNotFoundException This is thrown if a input or output file isn't found
	 * @throws UnsupportedEncodingException This is thrown if the output file gets messed up
	 */
	
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException{
		//System.out.println("Hello World!");
		
		//Create an ecosystem class
		Ecosystem eco = new Ecosystem();
		
		//set up the input/output
		Scanner fileReader = new Scanner(new File("src/input")); //scanner for input 
		PrintWriter writer = new PrintWriter("src/output", "UTF-8");
		
		//dont use the headers for anything
		String skip;
		for(int i = 1; i <= 16; i++){		//skip the input file headers
			skip = fileReader.next();
			//System.out.println("Skip: " + skip);
		}
		
		
		while (fileReader.hasNext()) { //while there are tokens in the file they will be read until there are no more
			//in order of header: name, initial population, what they eat, how much each one eats, how many are reproduced
			String name = fileReader.next();
			
			String ipopStr = fileReader.next();
			
			int ipop = Integer.parseInt(ipopStr);
			
			String prey = fileReader.next();
			
			//have to put into an int
			String consumptionStr = fileReader.next();
			int consumption = Integer.parseInt(consumptionStr);
			
			String reproductionStr = fileReader.next();
			int reproduction = Integer.parseInt(reproductionStr);
			
			//create the species and add it to the ecosystem
			Species tmp = new Species(name, ipop, prey, consumption, reproduction);
			eco.addSpecies(tmp);
		}
		
		
		//ask how many months
		Scanner in = new Scanner(System.in);
		System.out.println("How many months would you like to observe?");
		int months = in.nextInt();
		
		
		eco.printData(writer);	//print the initial populations
		
		//advance the month (each species eats and reproduces) and print out the data
		for(int i = 1; i <= months; i++){
			eco.nextMonth();
			eco.printData(writer);
		}
		
		//close everything
		fileReader.close();
		writer.close();
	}
}
