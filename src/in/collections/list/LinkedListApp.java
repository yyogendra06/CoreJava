package in.collections.list;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class LinkedListApp {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(null);
		list.add(null);

		System.out.println(list.remove(2));
		System.out.println(list.remove());

		System.out.println(list);

		AbstractSequentialList<Integer> abstractSequentialList = new LinkedList<>();
		abstractSequentialList.add(1);
		abstractSequentialList.remove(0);

		System.out.println(abstractSequentialList);
	}
}
