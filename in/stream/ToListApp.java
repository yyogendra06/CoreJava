package in.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ToListApp {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bob", "John", "Tony", "Stark",
				"Captain America", "Hulk");

		System.out.println("Containing 'h' ==>> " + list.stream()
				.filter(s -> s.contains("h")).collect(Collectors.toList()));

		System.out.println("To UpperCase ==>> " + list.stream()
				.map(String::toUpperCase).collect(Collectors.toList()));

		System.out.println(list);
	}
}
