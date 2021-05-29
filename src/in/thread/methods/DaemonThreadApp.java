package in.thread.methods;

import in.thread.player.VideoTask;

public class DaemonThreadApp {
	public static void main(String[] args) {

		// Already running thrqos exception
		// Thread.currentThread().setDaemon(true);

		Thread daemonThread = new Thread(new VideoTask());
		daemonThread.setDaemon(true);
		daemonThread.start();
		// setting deamon before start
		// daemonThread.setDaemon(true);
	}
}
