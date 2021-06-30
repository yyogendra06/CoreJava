package in.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashMapApp {

	private final static int THREAD_SIZE_POOL = 5;

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Print size and content
		System.out.println("Size of map is:- " + map.size());
		System.out.println("MAp : " + map);

		// Creating new map from existing hashmap by deep copy
		HashMap<String, Integer> copiedMap = new HashMap<>(map);
		copiedMap.put("New Item", 34);
		System.out.println("Copied Map : " + copiedMap);

		if (map == copiedMap)
			System.out.println("Both Address is sane map and copied map");
		if (map.equals(copiedMap))
			System.out.println("Both Content is equals");

		Map<String, Integer> syncMap = Collections.synchronizedMap(map);
		System.out.println("Sync Map : " + syncMap);

		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_SIZE_POOL);
		for (int i = 0; i < THREAD_SIZE_POOL; i++) {
			executorService.execute(new Runnable() {

				@Override
				public void run() {
					for (int i = 0; i < 500000; i++) {
						syncMap.put("x" + i, i);

						// below map will cause error of concurrentmodificationexception
//						map.put("x" + i, i);
					}
				}
			});
		}

//		System.out.println(map);
		executorService.shutdown();
		if (executorService.isShutdown())
			System.out.println(syncMap);

	}
}
