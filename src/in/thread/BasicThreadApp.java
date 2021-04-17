package in.thread;

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("TAsk Thread");
	}

}

public class BasicThreadApp {
	public static void main(String[] args) {
		System.out.println("IN MAIN");
		System.out.println(Thread.currentThread().getName());

		// running Task thread directly
		new Thread(new Task()).start();
		new Thread(new Task()).start();
		new Thread(new Task()).start();
		new Thread(new Task()).start();

		Thread.currentThread().setName("MAin Thread Name Updated");
		System.out.println(Thread.currentThread().getName() + "->"
				+ Thread.currentThread().isAlive());

	}
}
