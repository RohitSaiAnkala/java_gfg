package async;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		futureWithMoreTime(service);
		System.out.println("----------------");
		futureWithLessTime(service);
		System.out.println("----------------");
		futureWithTimeOut(service);
	}

	public static void futureWithMoreTime(ExecutorService service)
			throws InterruptedException, ExecutionException, TimeoutException {
		Future<Integer> future = service.submit(new Task());
		long start = System.currentTimeMillis();
		Thread.sleep(5000);
		Integer res = future.get(); // will block until we get the result from
									// future
		long end = System.currentTimeMillis();
		System.out.println("Res: " + res);
		System.out.println("Time taken: " + (end - start));
	}

	public static void futureWithTimeOut(ExecutorService service) throws InterruptedException, ExecutionException {
		Future<Integer> future = service.submit(new Task());
		long start = System.currentTimeMillis();
		Thread.sleep(5000);
		try {
			Integer res = future.get(1, TimeUnit.SECONDS); // will throw
															// exception if
															// future takes more
															// than 1 second to
															// return value from
															// this line
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		// System.out.println("Res: " + res);
		System.out.println("Time taken: " + (end - start));
	}

	public static void futureWithLessTime(ExecutorService service)
			throws InterruptedException, ExecutionException, TimeoutException {
		Future<Integer> future = service.submit(() -> {
			Thread.sleep(4000);
			return 4;
		});
		long start = System.currentTimeMillis();
		Thread.sleep(5000);
		Integer res = future.get();
		long end = System.currentTimeMillis();
		System.out.println("Res: " + res);
		System.out.println("Time taken: " + (end - start));
	}

}

class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Thread.sleep(7000);
		return 3;
	}

}
