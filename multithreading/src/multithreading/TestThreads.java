package multithreading;

public class TestThreads {

	public static void main(String[] args) {
		System.out.println("main started");
		
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		t1.start();
		t2.start();
		
		System.out.println("main exited....");
		

	}

}
