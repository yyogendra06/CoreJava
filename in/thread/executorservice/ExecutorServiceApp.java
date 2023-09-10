package in.thread.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceApp {

	public static void main(String[] args) throws InterruptedException {

		Runnable Task = () -> {
			System.out.println(Thread.currentThread().getName());
		};

		// Get The Available Core
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Core Count : " + coreCount);

		/**
		 * Fixed Number of Thread Created. Blocking Queue contains Task
		 */
		ExecutorService fixedService = Executors.newFixedThreadPool(coreCount);
		for (int i = 0; i < 10; i++) {
			fixedService.execute(Task);
		}
		fixedService.shutdown();

		/**
		 * Check for thread which is free if not found new thread is created.
		 * synchronized Queue C
		 */
		ExecutorService cachedService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			cachedService.execute(Task);
		}
		cachedService.shutdown();

		/**
		 * This will create delay queue which holds task based on there timing and on
		 * time gets executed
		 */
		ScheduledExecutorService scheduleService = Executors.newScheduledThreadPool(10);

		scheduleService.schedule(Task, 10, TimeUnit.SECONDS);

		scheduleService.scheduleAtFixedRate(Task, 15, 10, TimeUnit.SECONDS);

		scheduleService.scheduleWithFixedDelay(Task, 15, 10, TimeUnit.SECONDS);

		scheduleService.shutdown();

		/**
		 * Contains only single thread and new task assigned after completion of task,
		 * mainly used for sequential execution of task
		 */
		ExecutorService singleThreadService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			singleThreadService.execute(Task);
		}
		singleThreadService.shutdown();
	}

}
