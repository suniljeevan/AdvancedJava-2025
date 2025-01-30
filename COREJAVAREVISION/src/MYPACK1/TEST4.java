package MYPACK1;
//pure abstraction
// all methods are abstract 
// Interface makes all methods abstract
interface Shappe {
	// public abstract is not necessary
	 void area();
	 public void volume();
	 // non abstract method is not allowed
}
class Circle implements Shappe {
	private double radious;
	//alt shift s
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious = radious;
	}
	public void area() {
		System.out.println("Circle Area: "+3.14*radious*radious);		
	}
	//Empty Implementation
	//Partial Implementation is not allowed
	 public void volume() {}
	
	
}
public class TEST4 {

	public static void main(String[] args) {

	}

}
