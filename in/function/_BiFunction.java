package in.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction {
	public static void main(String[] args) {

		System.out.println("incrementByOneAndMultiply.apply(1, 4)");
		System.out.println(incrementByOneAndMultiply.apply(1, 4));

		System.out.println("incrementByOneAndMultiply.andThen(incrementByOne).apply(1, 4)");
		System.out.println(incrementByOneAndMultiply.andThen(incrementByOne).apply(1, 4));

		System.out.println("incrementByOneAndMultiply.andThen(incrementByOne).andThen(multiplyByTen).apply(1, 4)");
		System.out.println(incrementByOneAndMultiply.andThen(incrementByOne).andThen(multiplyByTen).apply(1, 4));

	}

	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = (valueToIncrement,
			fromValueToMultiply) -> (valueToIncrement + 1) * fromValueToMultiply;

	static Function<Integer, Integer> incrementByOne = number -> number + 1;
	static Function<Integer, Integer> multiplyByTen = number -> number * 10;
	static Function<Integer, Integer> divideByFive = number -> number / 5;
}
