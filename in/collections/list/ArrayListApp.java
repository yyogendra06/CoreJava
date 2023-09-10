package in.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(1, 30);
		list.add(1, null);
		list.add(null);

		System.out.println(list);

		List<Integer> list2 = Collections.synchronizedList(list);
		// list2= list.iterator();

		synchronized (list2) {
			ExecutorService executorService = Executors.newFixedThreadPool(5);
			for (int i = 0; i < 5; i++) {
				executorService.execute(new Runnable() {
					@Override
					public void run() {
						for (int i = 0; i < 10; i++) {
							list2.add(i);
						}
					}
				});
			}
		}

		// This will gives error i guess cloning was done
		// below will gives error
		// System.out.println(list);
		System.out.println(list2);
	}
}