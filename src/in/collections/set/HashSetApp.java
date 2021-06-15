package in.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("C");
		set.add("C");
		set.add("B");
		set.add("A");
		set.add("Heelo");
		set.add("Hello");
		set.add("There");
		

		System.out.println(set);

		set.remove("B");
		System.out.println(set);

		Set<Integer> a = new HashSet<>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set");
		System.out.println(union);

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference of the two Set");
		System.out.println(difference);
	}
}
