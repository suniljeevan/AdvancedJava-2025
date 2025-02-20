/*
 Write a Java program to perform the following 
 operations with text files.
a)	Display the number of characters, 
 words and sentences present in a text file 
multithread.txt.
b)	Display the content of the file on the screen 
with line number before each line.
 */
import java.io.*;
public class Test6 {
	public static void main(String[] args) throws Exception{
		File file=new File("C:\\Presidency\\multithread.txt");
		FileReader fr=new FileReader(file);
		char ch;
		int cc=0,i;
		while((i=fr.read())!=-1) {
			ch=(char)i;
			cc++;
		}
		fr.close();
		int cw=0;
		FileReader fr2=new FileReader(file);
		BufferedReader br=new BufferedReader(fr2);
		String line;
		while((line=br.readLine())!=null) {
			String[] words=line.split(" ");
			cw=cw+words.length;
		}
		System.out.println("No. of characters is "+cc);
		System.out.println("No. of words is "+cw);
		fr2.close();
		br.close();
		int cs=0;
		FileReader fr3=new FileReader(file);
		BufferedReader br2=new BufferedReader(fr3);
		while((line=br2.readLine())!=null) {
			String[] dots=line.split("[!?.:]+");
			cs=cs+dots.length;
		}
		System.out.println("No. of sentences is "+cs);
       fr3.close(); br2.close();
       //Displaying the content of the file with line number
       FileReader reader=new FileReader(file);
       BufferedReader b=new BufferedReader(reader);
       int lineno=0;
       while((line=b.readLine())!=null) {
    	   lineno++;
    	   System.out.println(lineno+"\t"+line);
       }
       reader.close();b.close();
	}
}
