// DEMONSTRATE sleep(), join() 
// use the above TEST5 program
//join() method joins the invoker
// after completion of the current executing 
// threads.
// it is an alternative to sleep() 
// without time
package PACK2;

import java.util.Scanner;

class Task_primecheck implements Runnable {
	public void run() {
		try {
		int n,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=1;i<=n/2;i++) {
			System.out.println(Thread.currentThread()+" "+i);
			Thread.sleep(3000);
			if(n%i==0) {
				c++;
			}
		}
		if(c==1)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
	}catch(Exception e) {}
	}
}
public class TEST6 {
	public static void main(String[] args)throws Exception {
		Task_primecheck task=new Task_primecheck();
         Thread t1=new Thread(task,"first");
         Thread t2=new Thread(task,"second");
         t1.start();
         t2.start();
         // main is the invoker
         t1.join();
         t2.join();
         System.out.println("main thread ended");
	}

}

