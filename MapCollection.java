package collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	//Map is a collection of key-value pair. 
	//Keys cannot be duplicated but values can be.
	//***So, keys are nothing but SET and values are nothing but the LIST. So combination of Set + dList = Map.

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		//reason behind using 'put' method compared to 'add' is, if you have same key replace that and put the new key
		map.put("Shyam", 96);
		map.put("Kavya", 99);
		map.put("Thanvi", 100);
		map.put("Shyam", 98);
		map.put("Abc", 90);
		
		map.remove("Abc");
		
		for(String key : map.keySet()) {
			System.out.println(key +":"+ map.get(key));
		}
		map.clear();//clears all
		System.out.println("Map: " + map);
	}

}
