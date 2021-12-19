package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {
	public static void main(String[] args) {

		List<Customer> customers = Customer.getAllCustomers();

		// one to one mapping --> one customer have one email ID
		//     <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		List<String> emails = customers.stream()
				                       .map(customer -> customer.getEmail())
				                       .collect(Collectors.toList());
		System.out.println(emails);

		List<List<String>> phoneNumbers = customers.stream()
												   .map(customer -> customer.getPhoneNumbers())
												   .collect(Collectors.toList());
		System.out.println(phoneNumbers);
		// flatMap --> one to many
		// <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
		List<String> phoneNumberList = customers.stream()
												.flatMap(customer ->customer.getPhoneNumbers().stream())
											    .collect(Collectors.toList());
		System.out.println(phoneNumberList);
	}
}

class Customer {
	private int id;
	private String name;
	private String email;
	private List<String> phoneNumbers;

	public Customer() {
	}

	public Customer(int id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public static List<Customer> getAllCustomers() {
		List<Customer> customers = Stream
				.of(new Customer(101, "john", "john@gmail.com", Arrays.asList("1234567", "51454254235")),
						new Customer(102, "smith", "smith@gmail.com", Arrays.asList("234567", "1454254235")),
						new Customer(103, "peter", "peter@gmail.com", Arrays.asList("34567", "454254235")))
				.collect(Collectors.toList());
		return customers;
	}

}
