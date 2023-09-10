package in.thread.player;

public class ProgressBarTask implements Runnable {

	@Override
	public void run() {
		System.out
				.println(Thread.currentThread().getName() + " ProgressBarTask");
	}
}
