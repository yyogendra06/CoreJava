package in.thread.methods;

/**
 * Interrupt method use to stop the thread from executing current task.
 */
public class InterruptApp {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread interruptThread = new Thread(runnable);
		interruptThread.setName("Interrupted Thread");
		interruptThread.start();
		interruptThread.interrupt();

		// Below will Execute as normal behaviour because not in waiting state
		Runnable nonWaitinhgRunnable = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				// Thread.sleep(1000);
			}
		};

		Thread nonWaitingThread = new Thread(nonWaitinhgRunnable);
		nonWaitingThread.setName("Not Waiting Thread");
		nonWaitingThread.start();
		nonWaitingThread.interrupt();
	}
}
