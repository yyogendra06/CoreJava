package in.thread;

public class PictureTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " PictureTask");
	}

}
