package in.thread.methods;

/**
 * Till Medical Completion other thread need to wait and join after that similar
 * after Test Driver completion it will joined by main thread
 * 
 * @author YoGI
 *
 */
public class JoinThreadApp {
	static int counter = 1;

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
				System.out.println("Officer Signature Started");
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

		Thread t1 = new Thread(() -> {
			JoinThreadApp.counter++;
		});

		Thread t2 = new Thread(() -> {
			JoinThreadApp.counter++;
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(JoinThreadApp.counter);

	}
//	Before Join
//	Medical Started
//	1
//	Test Driver Started
//	Officer Tasks Started
//	Officer Signature Completed
//	Medical Completed
//	Test Driver Completed
//
//	after Join
//	Medical Started
//	Medical Completed
//	Test Driver Started
//	Test Driver Completed
//	Officer Tasks Started
//	Officer Signature Completed
//	3

}


