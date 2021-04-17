package in.thread;

class ThreadExtend extends Thread {
	public void run() {
		System.out.println("SimpleThread started running..");
	}
}

class RunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("RunnableInterface started running..");
	}

}

public class ThreadCreationApp {
	public static void main(String[] args) {
		ThreadExtend simpleThread = new ThreadExtend();
		simpleThread.start();
		// IllegalThreadStateException Because thread is already in dead state
//		simpleThread.start();

		RunnableInterface runnableInterface = new RunnableInterface();
		Thread runnableThread = new Thread(runnableInterface);
		runnableThread.start();
	}
}
