package async;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureDemo {
	public static void main(String[] args) {
		// runAsync();
		// supplyAsync();
		// thenRun();
		// thenAccept();
		// thenApply();
		// chainOfCallbacks();
		// thenCompose();
		// thenCombine();
		// thenAcceptBoth();
		// allOf();
		// anyOf();
		exceptionally();
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
		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Rohit ").thenApply(val -> val + "Sai")
				.thenApply(val -> "Hello " + val).thenAccept(System.out::println);
	}

	public static void thenCompose() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello ")
				.thenCompose(val -> CompletableFuture.supplyAsync(() -> val + "World In Then Compose"));
		future.thenAccept(System.out::println);
	}

	public static void thenCombine() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello ").thenCombine(
				CompletableFuture.supplyAsync(() -> " World In Then Combine"), (val1, val2) -> val1 + val2);
		future.thenAccept(System.out::println);
	}

	public static void thenAcceptBoth() {
		CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Hello ").thenAcceptBoth(
				CompletableFuture.supplyAsync(() -> "World"),
				(val1, val2) -> System.out.println(val1 + val2 + " In Then Accept Both"));
	}

	public static void allOf() {
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> "Rohit");
		CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> "Sai");
		CompletableFuture<Void> combined = CompletableFuture.allOf(cf1, cf2, cf3);
		List<String> list = Stream.of(cf1, cf2, cf3).map(CompletableFuture::join).collect(Collectors.toList());
		System.out.println(list);
		String res = Stream.of(cf1, cf2, cf3).map(CompletableFuture::join).collect(Collectors.joining(" "));
		System.out.println(res);
	}

	public static void anyOf() {
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hello";

		});
		CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Rohit";

		});
		CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Sai";

		});
		CompletableFuture<Object> combined = CompletableFuture.anyOf(cf1, cf2, cf3);
		combined.thenAccept(System.out::println);
	}

	public static void exceptionally() {
		int age = -1;
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			if (age < 0)
				throw new IllegalArgumentException("Age cannot be negative");
			else if (age > 18)
				return "Adult";
			else
				return "Child";
		}).exceptionally(ex->{
			System.out.println("Exception occured: "+ex.getMessage());
			return "Unknown!";
		});
		future.thenAccept(System.out::println);
	}

}