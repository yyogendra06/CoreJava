package in.thread;

//Performing single task 
class Task1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Playing Video");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Playing Music");
	}
}

class Task3 implements Runnable {
	@Override
	public void run() {
		System.out.println("Timer is Executing");
	}
}

public class MulitpleTaskThreadApp {
	public static void main(String[] args) {

		// single task from single thread
		System.out.println("performing single task from single thread");
		Thread singleTaskThread = new Thread(new Task1());
		singleTaskThread.start();

		// performing single task from multiple thread
		System.out.println("performing single task from multiple threads");
		new Thread(new Task1()).start();
		new Thread(new Task1()).start();

		// performing multiple task from multiple thread
		System.out.println("performing multiple task from multiple threads");
		new Thread(new Task1()).start();
		new Thread(new Task2()).start();
		new Thread(new Task3()).start();

	}
}
