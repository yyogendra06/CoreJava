package in.thread.synchronization;

class TotalEarning implements Runnable {

	int total;

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			total = 100 + i;
		}
	}
}

class TotalEarningCommunication implements Runnable {

	int total;

	@Override
	public void run() {
		synchronized (this) {

			// this will make main thread which is waiting to wake and release
			// this lock
			for (int i = 0; i <= 100000; i++) {
				total = 100 + i;
			}
			this.notify();
		}
	}
}

public class InterThreadCommunicationApp {
	public static void main(String[] args) throws InterruptedException {

		TotalEarning te = new TotalEarning();
		Thread earningThread = new Thread(te);
		earningThread.start();

		System.out.println("Total Earning : " + te.total + ".Rs");

		TotalEarningCommunication tec = new TotalEarningCommunication();
		Thread earnCommThread = new Thread(tec);
		earnCommThread.start();

		synchronized (earnCommThread) {
			// This will make main thread to wait and other thread to execute
			earnCommThread.wait();
			System.out.println("Total Communication Earning : " + tec.total + ".Rs");
		}

	}
}
