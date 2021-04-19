package in.thread;

public class NamingThread {
	public static void main(String[] args) {
		System.out.println("IN MAIN");
		System.out.println(Thread.currentThread().getName());

		Runnable task = () -> {
			System.out.println(Thread.currentThread().getName() + " : Task Thread");
		};

		// running Task thread directly
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();

		Thread.currentThread().setName("UpdatedMain");
		System.out.println(Thread.currentThread().getName());
	}
}
