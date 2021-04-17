package in.thread;

public class ProgressBarTask implements Runnable {

	@Override
	public void run() {
		System.out
				.println(Thread.currentThread().getName() + " ProgressBarTask");
	}
}
