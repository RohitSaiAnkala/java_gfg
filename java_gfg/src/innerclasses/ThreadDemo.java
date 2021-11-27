package innerclasses;

public class ThreadDemo {
public static void main(String[] args) {
	MyThread m = new MyThread(){
		public void run(){
			for(int i=0;i<10;i++){
				System.out.println("Child Thread");
			}
		}
	};
	m.start();
	for(int i=0;i<10;i++){
		System.out.println("Main Thread");
	}
}
}
