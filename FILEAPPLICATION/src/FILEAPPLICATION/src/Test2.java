// To create a file under presidency folder
import java.io.*;
public class Test2 {
	public static void main(String[] args) throws Exception{
		File file=new File("C:\\Presidency\\javanotes.txt");
		FileWriter fw = new FileWriter(file);
		System.out.println("File Created");

	}

}
