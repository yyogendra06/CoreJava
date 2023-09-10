package in.thread;

class Task implements Runnable {

	@Override
	public void run() {
		BasicThreadApp.printThread();
	}

}

public class BasicThreadApp {
	public static void main(String[] args) {
		System.out.println("IN MAIN");
		BasicThreadApp.printThread();

		// running Task thread directly
		new Thread(new Task()).start();
		new Thread(new Task()).start();
		new Thread(new Task()).start();
		new Thread(new Task()).start();

		Thread.currentThread().setName("MAin Thread Name Updated");
		System.out.println(Thread.currentThread().getName() + "->" + Thread.currentThread().isAlive());

	}

	static void printThread() {
		System.out.println("Task Thread : " + Thread.currentThread().getName());
	}
}
