// Create two threads
// use Thread class
// use abstract run() from Runnable 
import java.lang.*; // default
class mythread extends Thread {
	private String tname;

	public mythread(String tname) {
		super();
		this.tname = tname;
		System.out.println("Thread "+tname+" created");
	}
	public void run() { 		
		try {
		System.out.println("Hi");
		Thread.sleep(15000);
		System.out.println("bye");
		}catch(Exception e) {}
	}
}
public class TEST1 {
	public static void main(String[] args) {
          mythread ob1=new mythread("first");
          mythread ob2=new mythread("second");
          ob1.start();
          ob2.start();
	}

}
