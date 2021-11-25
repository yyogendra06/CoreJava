package in.exception;

public class FinallyExceptionApp {
	public static void main(String[] args) {

		System.out.println(FinallyExceptionApp.returnObject());
	}

	static Object returnObject() {
		try {
			System.out.println("try");
			// System.exit(0);
			throw new Exception();
			// return new Integer(0);
		} catch (Exception e) {
			System.out.println("Catch");
			return 0;
		} finally {
			System.out.println("finally");
			// return new String("Helll");
			return 1;
		}
	}
}
