package in.thread;

public class InterruptedApp {
	public static void main(String[] args) {

		// this will change the interrupt status to false and make thread normal flow
		Runnable interruptedRunnable = () -> {

			System.out.println(Thread.interrupted());

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(
							Thread.currentThread().getName() + " - interrupted() : " + i);
					Thread.sleep(1000);
					System.out.println(Thread.interrupted());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread interruptedThread = new Thread(interruptedRunnable);
		interruptedThread.start();
		interruptedThread.interrupt();

		// This will produce same interrupt status and thread gets interrupted.
		Runnable isInterruptedRunnable = () -> {
			System.out.println(Thread.currentThread().isInterrupted());

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(
							Thread.currentThread().getName() + "  - isInterrupted() : " + i);
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().isInterrupted());
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};

		Thread isInterruptedThread = new Thread(isInterruptedRunnable);
		isInterruptedThread.start();
		isInterruptedThread.interrupt();

	}
}
