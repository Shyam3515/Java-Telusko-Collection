//collection interface belong to a java.util pacakage[all collection interfaces belong to this  package]
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		//We can use List also here instead of collection, if you just want to add numbers and fetch you can use collection,
		//and if you want to work with index values we should use List
		
//		Collection<Integer> nums = new ArrayList<Integer>();
		
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(2);
		nums.add(5);
		nums.add(7);
		nums.add(9);
		
		//indexing values
		System.out.println(nums.get(2)); //7
		
		//gets the index value of element
		System.out.println(nums.indexOf(9));
		
		for(int n : nums) {	
			System.out.print(n + " ");
		}
		
	}

}
