package in.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSplitApp {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a_25", "b_100", "c_23");

//		List<Integer> listIntegers = list.stream().map(e -> Integer.parseInt(e.substring(e.indexOf("_") + 1)))
//				.collect(Collectors.toList());

		List<Integer> listIntegers = list.stream().map(e -> e.substring(e.indexOf("_") + 1))
				.map(e -> Integer.parseInt(e)).collect(Collectors.toList());

		listIntegers.forEach(System.out::println);

	}
}
