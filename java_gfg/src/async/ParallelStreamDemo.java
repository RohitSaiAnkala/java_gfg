package async;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		long start = 0, end = 0;
		System.out.println("Cores in your laptop processor: " + Runtime.getRuntime().availableProcessors());
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Stream Time Taken:" + (end - start));

		System.out.println("--------------------------------------");

		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Taken: " + (end - start));

		IntStream.range(1, 10)
				.forEach((ele) -> System.out.println("Thread Name:" + Thread.currentThread().getName() + ":" + ele));

		System.out.println("-------------------------------");
		IntStream.range(1, 10).parallel()
				.forEach((ele) -> System.out.println("Thread Name:" + Thread.currentThread().getName() + ":" + ele));

		List<Employee> employees = Employee.getEmployees();

		start = System.currentTimeMillis();
		double avgSalaryStream = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out
				.println("Stream Time taken for finding avg: " + (end - start) + "\nAverage Salary: " + avgSalaryStream);
		start = System.currentTimeMillis();
		double avgSalaryParallelStream = employees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i)
				.average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream Time taken for finding avg:" + (end - start) + "\nAverage Salary: "
				+ avgSalaryParallelStream);

	}
}

class Employee {
	private int id;
	private String name;
	private String grade;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String grade, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			employees.add(new Employee(i, "employee " + i, "A", Double.valueOf(new Random().nextInt(100000))));
		}
		return employees;
	}
}
