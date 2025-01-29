package MYPACK1;
// Abstract Relationship
// Loose-coupling between parent and child
// Some implementation of parents are hidden
abstract class Shape { 
	// zero or methods are abstract
	public abstract void area();
	public abstract void volume();
	public void showRules() {
		System.out.println(" Area is for 2D shape");
		System.out.println("Volume is for 3D shape");
	}
}
class ShapeImpl extends Shape {
	int dimension;
    //alt shift s
	public ShapeImpl(int dimension) {
		super();
		this.dimension = dimension;
	}
	public void area() { 
		if(dimension==2) 
			System.out.println("area is "+3.141*5*5);
		else 
			System.out.println("Not possible");
	}
	public void volume() {
		if(dimension==3) 
			System.out.println("Volume is "+(5*5*5));
		else 
			System.out.println("Not possible");
	}
	
}
public class TEST3 {
	public static void main(String[] args) {
		ShapeImpl ob = new ShapeImpl(3);
		ob.area();
		ob.volume();
		ob.showRules();
	}

}
