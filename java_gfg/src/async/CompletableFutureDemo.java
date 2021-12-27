package async;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
	public static void main(String[] args) {
		runAsync();
		supplyAsync();
		thenRun();
		thenAccept();
		thenApply();
		chainOfCallbacks();
	}

	public static void runAsync() {
		CompletableFuture<Void> future = CompletableFuture
				.runAsync(() -> System.out.println("Running asynchronous task in parallel "));
	}

	public static void supplyAsync() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
		future.thenAccept(value -> System.out.println(value + " " + "World "));
	}

	// call back
	public static void thenRun() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<Void> result = future.thenRun(() -> System.out.println("Example with thenRun()"));
	}

	// call back
	public static void thenAccept() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Rohit");
		CompletableFuture<Void> result = future.thenAccept(value -> System.out.println("Hello " + value));
	}

	public static void thenApply() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Rohit");
		CompletableFuture<String> result = future.thenApply(value -> "Welcome " + value);
		result.thenAccept(System.out::println);
	}

	public static void chainOfCallbacks() {
		CompletableFuture<Void> future = CompletableFuture
				.supplyAsync(() -> "Rohit ")
				.thenApply(val -> val + "Sai")
				.thenApply(val -> "Hello " + val)
				.thenAccept(System.out::println);
	}

}