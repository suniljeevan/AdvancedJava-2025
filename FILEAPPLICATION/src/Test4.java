//Reading the content of the file 
import java.io.*;
public class Test4 {
	public static void main(String[] args)throws Exception {
		File file=new File("C:\\Presidency\\javanotes.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String line;
		System.out.println("The content of file is");
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
       br.close();
       fr.close();
	}

}
