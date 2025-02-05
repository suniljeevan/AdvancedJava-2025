// create 2 threads
// task - print 1 to 5
// print name of thread with numbers
import java.lang.*;
class printthread extends Thread {
	private String name;
	public printthread(String name) {
		super();
		this.name = name;
		System.out.println("thread "+name+" created");
	}
	public void run() {
		try {
		for(int i=1;i<=5;i++) {
			System.out.println(name+" "+i);
			Thread.sleep(10000);
		}
		}catch(Exception e) {}
	}
}
public class TEST2 {
	public static void main(String[] args) {
		printthread ob1=new printthread("first");
		printthread ob2=new printthread("second");
		printthread ob3=new printthread("third");
        ob1.start();
        ob2.start();
        ob3.start();
        System.out.println("Main Thread completed");
        
	}

}
