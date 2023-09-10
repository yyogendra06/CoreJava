package in.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("C");
		set.add("B");
		set.add("A");
		set.add("Heelo");
		set.add("Hello");
		set.add("There");
		
		System.out.println(set);
	}
}
