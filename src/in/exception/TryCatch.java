package in.exception;

public class TryCatch {
	public static void main(String[] args) {

		int a = 10, b = 0;

		// no use of try without catch
		try {
			System.out.println(a / b);
		}
		// no use if catch withour try
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
