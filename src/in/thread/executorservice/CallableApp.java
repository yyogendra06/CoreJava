package in.thread.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableApp {
	public static void main(String[] args)
			throws InterruptedException, ExecutionException {
		Callable<Integer> callable = () -> {
			return 4;
		};

		FutureTask<Integer> future = new FutureTask<>(callable);
		Thread thread = new Thread(future);
		thread.start();

		System.out.println(future.get());
	}

};
