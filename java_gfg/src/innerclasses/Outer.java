package innerclasses;

public class Outer {
	class Inner{
		public void m1(){
			System.out.println("Inside Inner Class Method");
		}
	}
	public void m2(){
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args){
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		o.m2();
	}
}
