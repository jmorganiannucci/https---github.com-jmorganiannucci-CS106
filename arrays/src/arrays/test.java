package arrays;

import java.util.ArrayList;


public class test {
	public static void main(String args[]){
		System.out.println("Hello World!");
		
		ArrayList arr = new ArrayList<Integer>();
		
		System.out.println("size: "+arr.size());
		
		arr.add(100);
		arr.add(101);
		arr.add(102);
		arr.add(103);
		arr.add(104);
		arr.add(105);
		arr.add(106);
		arr.add(107);
		arr.add(108);
		arr.add(109);
		arr.add(110);
		
		System.out.println("size: "+arr.size());
		
		System.out.println("These are the elements of the array:");
		
		for(int i = 0; i < arr.size(); i++){
			System.out.println(arr.get(i));
		}
		
	}
}
