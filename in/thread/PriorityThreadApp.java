package in.thread;

import in.thread.player.PictureTask;
import in.thread.player.ProgressBarTask;
import in.thread.player.VideoTask;

public class PriorityThreadApp {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());

		Thread normalPriorityThread = new Thread(new ProgressBarTask());
		normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
		normalPriorityThread.start();

		Thread highPriorityThread = new Thread(new PictureTask());
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		highPriorityThread.start();

		Thread lowPriorityThread = new Thread(new VideoTask());
		lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
		lowPriorityThread.start();

	}
}
