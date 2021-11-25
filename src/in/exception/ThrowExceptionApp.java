package in.exception;

public class ThrowExceptionApp {
	public static void main(String[] args) {

		ThrowExceptionApp app = new ThrowExceptionApp();
		app.divide();
	}

	void divide() {
		int a = 10, b = 0, c;

		if (b == 0)
			throw new DivideByZeroException("unable to divide");

		System.out.println(a / b);
	}
}

// Throw Always used in unchecked Exception
// Throw used for custom exception or user Defined exeption
class DivideByZeroException extends RuntimeException {

	public DivideByZeroException(String message) {
		super(message);
	}

}
