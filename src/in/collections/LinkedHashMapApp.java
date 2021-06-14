package in.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapApp {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		map.put(null, null);
		map.put(null, 45);
		

		// Print size and content
		System.out.println("Size of map is:- " + map.size());
		System.out.println("MAp : " + map);
		
		// Iterator on Maps
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Iterator<Entry<String,Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext())
			System.err.println(iterator.next());
	}
}
