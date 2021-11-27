package innerclasses;

public class StaticNestedClass {
	static class Nested {
		public void m1() {
			System.out.println("Static Nested class Method");
		}
	}

	public static void main(String[] args) {
		Nested n = new Nested();
		n.m1();
	}
}
