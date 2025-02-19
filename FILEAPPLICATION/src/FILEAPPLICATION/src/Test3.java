// Writes some java contents to the file
// C:\\Presidency\\javanotes
import java.io.*;
public class Test3 {
	public static void main(String[] args)throws Exception {
		File file=new File("C:\\Presidency\\javanotes.txt");
		FileWriter fw=new FileWriter(file);
		String content="Features: Exception Handling\n Multithreading \n Polymorphism";
		fw.write(content);
		System.out.println("file written");
        fw.close();
	}

}
