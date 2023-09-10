package in.exception;

class CustomException extends Exception {

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

}

class CustomRuntimeException extends RuntimeException {

	public CustomRuntimeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomRuntimeException(String message) {
		super(message);
	}

}

public class CustomExceptionApp {
	public static void main(String[] args) {
		// store account information
		int accno[] = {1001, 1002, 1003, 1004};

		String name[] = {"Nish", "Shubh", "Sush", "Abhi", "Akash"};

		double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

		try {
			System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

			// display the actual account information
			for (int i = 0; i < 5; i++) {
				// display own exception if balance < 1000
				if (bal[i] < 1000) {
					CustomException customException = new CustomException(
							"Balance is less 	 1000");
					throw customException;
				}

				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
			}
		} catch (CustomException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			// display own exception if balance < 1000
			if (bal[i] < 1000) {
				// CustomException customException = new CustomException(
				// "Balance is less 1000");
				// throw customException;

				CustomRuntimeException customRuntimeException = new CustomRuntimeException(
						"Balance is less 1000");
				throw customRuntimeException;
			}

			System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
		}

		System.out.println("End");

	}
}
