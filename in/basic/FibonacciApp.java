package in.basic;

public class FibonacciApp {
	public static void main(String[] args) {
		System.out.println(fibonacciRecursive(10));
		fib(10);
	}

	public static int fibonacciRecursive(int number) {
		if (number <= 1) {
			return number;
		}

		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
	}

	static int fib(int n) {
		int a = 1, b = 1, c;
		if (n == 0)
			return a;

		System.out.print(a + " " + b + " ");

		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
		return b;
	}
}
