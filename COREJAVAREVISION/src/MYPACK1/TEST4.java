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
	
	public Circle(double radious) {
		super();
		this.radious = radious;
	}
	public Circle() {
		super();
	}
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
class Cylinder implements Shappe {
	private double radious,height;
	//alt shift s	
	public Cylinder(double radious, double height) {
		super();
		this.radious = radious;
		this.height = height;
	}
	
	 public Cylinder() {
		super();
	}

	public double getRadious() {
		return radious;
	}
	
	public void setRadious(double radious) {
		this.radious = radious;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//Empty Implementation
	public void area() {}
	public void volume() {
		System.out.println("Sphere Volume: "+3.14*radious*radious*height);
	}
}
public class TEST4 {
	public static void main(String[] args) {
		//Approach 1 
		//Access methods by individual objects
		Circle c=new Circle();
		c.setRadious(5.5);
		c.area();
		Cylinder C = new Cylinder();
		C.setRadious(4.3);
		C.setHeight(3.5);
		C.volume();
		//Approach 2
		//Access by Interface Reference-DMD Approach.
		// Not allowed Shappe S=new Shappe();
		//Polymorphism
		Shappe S=new Circle(3.2); //shape is circle
		S.area();
		S=new Cylinder(2.1,3.5);   //shape is cylinder
		S.volume();
	}
}






