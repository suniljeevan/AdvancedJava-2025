//Q

import java.util.Scanner;

class FactThread extends Thread {
	String name;
	FactThread(String n) {
		super(n);
		name=n;
		System.out.println(name+" thread created");	
	}
	public void run() {
		try {
		int number;
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			fact=fact*i;
	System.out.println(Thread.currentThread()+" is sleeping");
			Thread.sleep(30000);
		}
		System.out.println("Factorial by "+Thread.currentThread()+" is "+fact);	
		}catch(InterruptedException e) {}
	}
}
public class TEST7 {
	public static void main(String[] args) throws Exception {
		FactThread t1=new FactThread("1st");
		FactThread t2=new FactThread("2nd");
		FactThread t3=new FactThread("3rd");
		t1.setPriority(3);
		t2.setPriority(7);
		t3.setPriority(9);
		t1.start();t2.start();t3.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		t1.join();
		System.out.println(t1.isAlive());
		t2.join();
		System.out.println(t2.isAlive());
		t3.join();
		System.out.println(t3.isAlive());
		System.out.println("main completed");

	}

}
