package reflections;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.sql.SQLException;

public class Employee implements Serializable, Cloneable {
	public static int eno = 111;
	public static String ename = "Rohit";
	static String eaddr = "Hyd";

	public Employee() {
	}

	Employee(int eno) throws ClassCastException,ArithmeticException {
	}

	Employee(int eno, String ename) throws SQLException {
	}
 
	public void add(int eno, String ename, String eaddr) throws ClassNotFoundException, ClassCastException {
	}

	public String search(int eno) throws ArithmeticException, InterruptedException {
		return "success";
	}

	public void delete(int eno) throws SQLException {
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		getClassRelatedInfo();
		getFieldRelatedInfo();
		getMethodRelatedInfo();
		getConstructorRelatedInfo();

	}

	public static void getClassRelatedInfo() throws ClassNotFoundException {
		Class c = Class.forName("reflections.Employee");
		System.out.println("ClassName: " + c.getName());
		System.out.println("SuperClassName: " + c.getSuperclass().getName());
		System.out.print("InterfaceList: ");
		Class[] interfaces = c.getInterfaces();
		for (Class cls : interfaces) {
			System.out.print(cls.getName() + " ");
		}
		System.out.println();
		int i = c.getModifiers();
		System.out.println("Access Modifiers:" + Modifier.toString(i));

	}

	public static void getFieldRelatedInfo() throws IllegalArgumentException, IllegalAccessException {
		Employee e = new Employee();
		Class c = e.getClass();
		for (Field f : c.getDeclaredFields()) {
			System.out.println("Name: " + f.getName());
			System.out.println("DataType: " + f.getType().getName());
			int i = f.getModifiers();
			System.out.println("Access Modifiers: " + Modifier.toString(i));
			System.out.println("Value:" + f.get(f));
			System.out.println("--------------------------");
		}
	}

	public static void getMethodRelatedInfo() {
		Class c = Employee.class;
		for (Method m : c.getDeclaredMethods()) {
			System.out.println("Name: " + m.getName());
			System.out.println("ReturnType: " + m.getReturnType().getName());
			int i = m.getModifiers();
			System.out.println("Modifiers List: " + Modifier.toString(i));
			System.out.print("Parameter Types: ");
			for (Class cls : m.getParameterTypes()) {
				System.out.print(cls.getName() + " ");
			}
			System.out.print("\nException List: ");
			for (Class cls : m.getExceptionTypes()) {
				System.out.print(cls.getName() + " ");
			}
			System.out.println("\n------------------------------------------------------------------------");
		}
	}
	public static void getConstructorRelatedInfo(){
		Class c = Employee.class;
		for(Constructor con: c.getDeclaredConstructors()){
			System.out.println("Name: "+con.getName());
			int i = con.getModifiers();
			System.out.println("Access Modifier: "+Modifier.toString(i));
			System.out.print("Parameter Types: ");
			for(Class cl: con.getParameterTypes()){
				System.out.print(cl.getName()+" ");
			}
			System.out.print("\nException Types: ");
			for(Class cl: con.getExceptionTypes()){
				System.out.print(cl.getName()+" ");
			}
			System.out.println("\n------------------------------------------------------------------------");
		}
	}
}
