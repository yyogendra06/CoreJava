package in.exception;

public class FinallyExceptionApp {
	public static void main(String[] args) {
		
		System.out.println(FinallyExceptionApp.throwException());
		
	}
	
	static Object throwException() {
		try {
			System.out.println("try");
			
//			System.exit(0);
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Catch");
			return 0;
		} finally {
			System.out.println("finally");
			return 1;
		}
	}
}
