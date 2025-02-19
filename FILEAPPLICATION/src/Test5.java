// copy file 
import java.io.*;
public class Test5 {
	public static void main(String[] args)throws Exception {
         File source = new File("C:\\Presidency\\javanotes.txt");
         File target = new File("C:\\Presidency\\javanotescopy.txt");
         FileReader fr=new FileReader(source);
         FileWriter fw=new FileWriter(target);
         int i;
         while((i=fr.read())!=-1) {
        	fw.write(i);
         }
         System.out.println("1 File Copied");
         fw.close();
         fr.close();
	}

}
