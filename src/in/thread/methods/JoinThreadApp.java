package in.thread.methods;

/**
 * Till Medical Completition other thread need to wait and join after that
 * similar after Test Driver completion it will joined by main thread
 * 
 * @author YoGI
 *
 */
public class JoinThreadApp {
	public static void main(String[] args) throws InterruptedException {

		Runnable medicalRunnable = () -> {
			try {
				System.out.println("Medical Started");
				Thread.sleep(5000);
				System.out.println("Medical Completed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable testDriverRunnable = () -> {
			try {
				System.out.println("Test Driver Started");
				Thread.sleep(8000);
				System.out.println("Test Driver Completed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable officerSignRunnable = () -> {
			try {
				System.out.println("Officer Tasks Started");
				Thread.sleep(5000);
				System.out.println("Officer Signature Completed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread medicalThread = new Thread(medicalRunnable);
		medicalThread.start();
		medicalThread.join();

		Thread testDriverThread = new Thread(testDriverRunnable);
		testDriverThread.start();
		testDriverThread.join();

		Thread officerSignThread = new Thread(officerSignRunnable);
		officerSignThread.start();
		officerSignThread.join();

	}
}
