package in.thread.methods;

public class YieldThreadApp {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + i);
			}
		};
		Thread yieldThread = new Thread(runnable);
		yieldThread.start();

		Thread.yield();

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

}
