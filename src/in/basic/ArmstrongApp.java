package in.basic;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArmstrongApp {
	public static void main(String[] args) {
		System.out.println("153 : " + isArmStrong(153));
		System.out.println("175 : " + isArmStrong(175));

		printArmstrongTill(1000);
	}

	static void printArmstrongTill(int number) {
		System.out.println(
				IntStream.rangeClosed(0, number).filter(n -> isArmStrong(n)).boxed().collect(Collectors.toList()));
	}

	public static boolean isArmStrong(int number) {
		int result = 0;
		int origin = number;
		while (number != 0) {
			int remainder = number % 10;
			result += remainder * remainder * remainder;
			number /= 10;
		}

		if (result == origin)
			return true;

		return false;
	}
}
