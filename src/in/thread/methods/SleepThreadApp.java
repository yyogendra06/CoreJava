package in.thread.methods;

class SleepThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}

public class SleepThreadApp {
	public static void main(String[] args) {
		 Thread sleepThread = new Thread(new SleepThread());
		 sleepThread.start();

		Runnable unlimitedRunnable = () -> {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 100000; i++)
				System.out.println(i);
		};

		Thread unlimitedThread = new Thread(unlimitedRunnable);
		unlimitedThread.start();


	}
}
