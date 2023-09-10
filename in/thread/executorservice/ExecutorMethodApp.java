package in.thread.executorservice;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMethodApp {
	public static void main(String[] args) throws InterruptedException {

		Runnable Task = () -> {

		};

		// Get The Available Core
		int coreCount = Runtime.getRuntime().availableProcessors();

		ExecutorService fixedService = Executors.newFixedThreadPool(coreCount);
		System.out.println("Core Count : " + coreCount);

		for (int i = 0; i < 10000000; i++) {
			fixedService.execute(Task);
		}

		System.out.println("before shutdown() fixedService.isShutdown() "
				+ fixedService.isShutdown());

		// Send shutdown signal to executor after task completion it gets
		// shutdown, if
		// new task assigned after this RejectionExecutionException will
		// Generated
		fixedService.shutdown();
		// fixedService.execute(Task);

		// to check whether shutdown signal is given or not
		System.out.println("after shutdown() fixedService.isShutdown() "
				+ fixedService.isShutdown());

		// to know is executor terminated
		System.out.println(
				"fixedService.isTerminated() " + fixedService.isTerminated());

		Thread.sleep(300);

		// Returns all pending task and immeditatily shutdown the executor
		List<Runnable> queuedTask = fixedService.shutdownNow();
		System.out.println("after shutdownNow() fixedService.isShutdown() "
				+ fixedService.isShutdown());
		System.out.println("Count in Queued Task : " + queuedTask.size());

		System.out.println(
				"fixedService.isTerminated() " + fixedService.isTerminated());

		// if terminated return true otherwise wait for given time
		fixedService.awaitTermination(10, TimeUnit.SECONDS);
	}
}
