package in.basic;

import java.util.stream.IntStream;

public class PrimeNumberApp {
	public static void main(String[] args) {
		printPrimeNumber(20);
//		System.out.println(IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList()));
	}

	static void printPrimeNumber(int number) {
		IntStream.rangeClosed(3, number).filter(n -> isPrime(n)).forEach(System.out::print);
	}

	static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, number / 2).noneMatch(n -> number % n == 0);
	}
}
