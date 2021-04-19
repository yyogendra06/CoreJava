package in.thread.executorservice;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureApp {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<Integer> task = () -> {
			return new Random().nextInt();
		};

		// create executor service
		ExecutorService service = Executors.newFixedThreadPool(10);

		// submit task
		Future<Integer> future = service.submit(task);

		System.out.format("Result %s", future.get());
	}
}
