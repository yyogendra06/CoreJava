package in.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapApp {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			executorService.execute(() -> {
				for (int j = 0; j < 10000; j++)
					concurrentHashMap.put("A" + j, j);
			});
		}
		System.out.println(concurrentHashMap);

		Map<String, Integer> map = new HashMap<>();
		ExecutorService executorService1 = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			executorService1.execute(() -> {
				for (int j = 0; j < 10000; j++) {
					map.put("A" + j, j);
				}
			});
		}
		System.out.println(map);

	}
}
