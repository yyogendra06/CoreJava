package in.collections.map;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		
//		Tree Map Do Not accept null key
//		map.put(null, null);
//		map.put(null, 45);
		

		// Print size and content
		System.out.println("Size of map is:- " + map.size());
		System.out.println("MAp : " + map);

		
		SortedMap syncMap = Collections.synchronizedSortedMap(map);
	}
}
