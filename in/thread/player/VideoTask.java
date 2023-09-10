package in.thread.player;

public class VideoTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " VideoTask");
	}

}
