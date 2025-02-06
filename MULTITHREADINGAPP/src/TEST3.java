//DEMONSTRATE THREAD CLASS CONSTRUCTOR
// THAT RECEIVES Runnable AS OBJECT
// Runnable way to create threads
class Task implements Runnable {
	public void run() {
		System.out.println("hi");
	}
	
}
class TestThread extends Thread {
	private String name;
	Task t;
	public TestThread(String name, Task t) {
		super();
		this.name = name;
		this.t = t;
   System.out.println("Thread "+name+" created");		
	}
}
public class TEST3 {

	public static void main(String[] args) {
		Task task=new Task();
		TestThread ob1=new TestThread("first",task);
		TestThread ob2=new TestThread("second",task);
		TestThread ob3=new TestThread("third",task);
		ob1.start();
		ob2.start();
		ob3.start();
	}

}
