package in.stream.intstream;

import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamArrayOperationApp {
	public static void main(String[] args) {

		int[] numbers = { 3, 10, 8, 4, 1, 0, -9 };

		System.out.println(IntStream.of(numbers).min().getAsInt());
		IntStream.of(numbers).min().ifPresent(System.out::println);
		IntStream.of(numbers).max().ifPresent(System.out::println);
		System.out.println(IntStream.of(numbers).count());
		System.out.println(IntStream.of(numbers).sum());
		IntStream.of(numbers).average().ifPresent(System.out::println);

		IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();
		System.out.println(statistics);

		// find distinct first 3 element
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);

		// Prime number from stream

		// countinh duplciate
		int[] duplicate = { 1, 2, 3, 5, 2, 1, 6, 7, 2, 3, 5 };
		System.out.println(IntStream.of(duplicate).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		
	}
}
