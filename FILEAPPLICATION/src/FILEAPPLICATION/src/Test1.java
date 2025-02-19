// to create a folder in D drive
import java.io.*;
public class Test1 {
	public static void main(String[] args) {
       File folder=new File("C:\\Presidency");
       if(folder.mkdir())
    	   System.out.println("Folder Created");
       else 
    	   System.out.println("Unable to create");
	}

}
