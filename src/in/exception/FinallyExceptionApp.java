package in.exception;

public class FinallyExceptionApp {
	public static void main(String[] args) {

		try {
			System.out.println("try");
//			System.exit(0);
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Catch");
		} finally {
			System.out.println("finally");
		}
	}
}
