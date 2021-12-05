package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Course(cId = "C-222", cName = "Java", cCost = 2000)
public class Student {
	String sid;
	String sname;
	String saddr;

	public Student(String sid, String sname, String saddr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
	}

	@Course(cId = "C-333", cName = "Python", cCost = 4000)
	public String getStudentDetails() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + "]";
	}
}

class Test {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Student s = new Student("S-111", "Durga", "Hyd");
		System.out.println(s.getStudentDetails());
		Class c = s.getClass();
		Method m = c.getMethod("getStudentDetails");
		Annotation ann = c.getAnnotation(Course.class);
		Annotation ann1 = m.getAnnotation(Course.class);
		Course course = (Course) ann;
		Course course1 = (Course)ann1;	
		disp(course);
		disp(course1);
	}
	public static void disp(Course course){
		System.out.println("Student Course Details");
		System.out.println("-----------------------");
		System.out.println("Course Id:" + course.cId());
		System.out.println("Course Name:" + course.cName());
		System.out.println("Course Cost:" + course.cCost());
		
	}
}
