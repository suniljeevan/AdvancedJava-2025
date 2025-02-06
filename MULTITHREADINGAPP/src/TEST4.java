// USE Runnable to create two threads
// both will print "factorial of a number"

import java.util.Scanner;
class facttorialtask implements Runnable {
	public void run() {
		long f=1;
		int n;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("Factorial is "+f);
	}
}

class factorialthread extends Thread {
	private String name;
	facttorialtask t;
	public factorialthread(String name, facttorialtask t) {
		super(t,name);
		this.name = name;
		this.t = t;
   System.out.println("Thread "+name+" created");

	}
}
public class TEST4 {

	public static void main(String[] args) throws Exception{
		facttorialtask task=new facttorialtask();
		factorialthread ob1=new factorialthread("first",task);
		factorialthread ob2=new factorialthread("second",task);
		ob1.start();ob2.start();
		Thread.sleep(30000);
		System.out.println("Main ended");
	}

}
