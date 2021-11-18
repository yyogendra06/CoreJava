package in.exception;

class FinalizeMethod {

	@Override
	protected void finalize() {
		System.out.println("Inside Finalize");
	}
}

public class FinalizeMethodApp {

	public static void main(String[] args) {
		FinalizeMethod finalizeMethod = new FinalizeMethod();
		finalizeMethod.finalize();
		
		Object object = new Object();
//		object.finalize();
	}

}
