// multithreading with synchronization
package PACK2;

class Resource {
	synchronized public void print(String name) {
		try {
		System.out.print("(");
		System.out.print(name);
		Thread.sleep(10000);
		System.out.print(")");
		}catch(Exception e) {}
	}
}
class PrintParenthesis implements Runnable {
	Resource R;
	String name;
	PrintParenthesis(Resource r,String n) {
		R=r;
		name=n;
	}
	public void run() {
		try {
			R.print(name);
		}catch(Exception e) {}
	}
}
public class TEST10 {

	public static void main(String[] args)throws Exception {
		Resource ob=new Resource();
		PrintParenthesis p1=new PrintParenthesis(ob,"a");
		PrintParenthesis p2=new PrintParenthesis(ob,"b");
		PrintParenthesis p3=new PrintParenthesis(ob,"c");
		Thread t1=new Thread(p1,"a");
		Thread t2=new Thread(p2,"b");
		Thread t3=new Thread(p3,"c");
		t1.start();t2.start();t3.start();
		t1.join();t2.join();t3.join();
		System.out.println("\nMain completed");

	}

}
