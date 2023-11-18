package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		//It doesn't support indexing values
		Set<Integer> nums = new HashSet<Integer>();
		
		nums.add(8);
		nums.add(51);
		nums.add(17);
		nums.add(9);
		nums.add(93);
		
		//this nums.iterator will give you the iterator object back, so we need to hold in the iterator object.
		Iterator<Integer> num = nums.iterator();
		
		// Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the 
		// collection is changing size at the same time that the code is trying to loop.

		while(num.hasNext()) {
			int n = num.next();
			if(n > 10) {
				num.remove();
			}
		}
		System.out.println(nums);
	}

}
