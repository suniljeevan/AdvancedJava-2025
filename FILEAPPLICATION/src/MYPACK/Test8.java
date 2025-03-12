package MYPACK;
//serialize  student object
import java.io.*;
class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sid;
	private String sname;
	private double cgpa;
	//generate getter and setter alt shift s
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
}
public class Test8 {
	public static void main(String[] args) throws Exception{
         Student ob=new Student();
         ob.setSid("2024CSE0101");
         ob.setSname("sumith");
         ob.setCgpa(7.5);
         //Serialization converts this object to binary
         File file=new File("C://Presidency//student.dat");
         FileOutputStream out=new FileOutputStream(file);
         ObjectOutputStream o=new ObjectOutputStream(out);
         o.writeObject(ob);
         System.out.println("Student Serialized");
         o.close();out.close();
	}

}





