package in.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("C");
		set.add("B");
		set.add("A");
		set.add("Heelo");
		set.add("Hello");
		set.add("There");
		
		
		System.out.println(set);
	}
}
