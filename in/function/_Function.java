package in.function;

import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {

		System.out.println("incrementByOne.apply(1)");
		System.out.println(incrementByOne.apply(1));

		System.out.println("multiplyByTen.apply(1)");
		System.out.println(multiplyByTen.apply(1));

		System.out.println("incrementByOne.andThen(multiplyByTen).apply(1)");
		System.out.println(incrementByOne.andThen(multiplyByTen).apply(1));

		System.out.println("incrementByOne.andThen(multiplyByTen).andThen(multiplyByTen).apply(1)");
		System.out.println(incrementByOne.andThen(multiplyByTen).andThen(multiplyByTen).apply(1));
		
		System.out.println(divideByFive.apply(1));
		System.out.println("incrementByOne.andThen(multiplyByTen).andThen(divideByFive).apply(1)");
		System.out.println(incrementByOne.andThen(multiplyByTen).andThen(divideByFive).apply(1));
	}

	static Function<Integer, Integer> incrementByOne = number -> number + 1;
	static Function<Integer, Integer> multiplyByTen = number -> number * 10;
	static Function<Integer, Integer> divideByFive = number -> number / 5;
}
