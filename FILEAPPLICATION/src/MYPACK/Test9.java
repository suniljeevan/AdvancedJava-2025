//Deserialization

//Reading binary to object
package MYPACK;
import java.io.*;

public class Test9 {
	public static void main(String[] args) throws Exception {
       File file=new File("C://Presidency//Student.dat");
       FileInputStream in=new FileInputStream(file);
       ObjectInputStream i=new ObjectInputStream(in);
       Student ob=(Student)i.readObject();
       System.out.println("Student object Deserialized");
       System.out.println(ob.getSid());
       System.out.println(ob.getSname());
       System.out.println(ob.getCgpa());
	}

}
