package in.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListApp {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bob", "John", "Tonny", "Stark", "Captain America", "Hulk");

		System.out.println("String Containing 'h' ==>> "
				+ list.stream().filter(s -> s.contains("h")).collect(Collectors.toList()));

		System.out.println("To UpperCase ==>> " + list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()));
		
		
	}
}
