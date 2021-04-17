package in.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeApp {
	public static void main(String[] args) {

		System.out.println("With Stream Api");

		Stream.iterate(0, n -> n + 1).limit(10).filter(PrimeApp::isPrime)
				.forEach(System.out::println);

		System.out.println("With OUT Stream Api");

		List<Integer> collect = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			if (isPrimeWithoutStream(i)) {
				collect.add(i);
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false; // 1 is not prime and also not composite

		return !IntStream.rangeClosed(2, number / 2)
				.anyMatch(i -> number % i == 0);
	}

	private static boolean isPrimeWithoutStream(int number) {

		if (number <= 1)
			return false; // 1 is not prime and also not composite

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
