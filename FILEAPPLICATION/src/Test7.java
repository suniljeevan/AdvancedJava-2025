/*
 Write a Java program to perform the following operations with binary files.
a)	Create a folder , 
section name as  folder name in c 
drive by passing the folder name at run 
time using Scanner.
b)	Create a file to write about students 
those who submitted above essay , 
file name must be “students.dat”.
c)	Add the content to the above file as follows:
The first line is the header line, the remaining 
lines corresponds to rows in the table, The elements are separated by spaces.
Name         Regdno          Essaysubmitted
Irfan           123                    yes
Manoj        124                    yes 
Pavan         126	             no			
d)	Read the above file to console

This is data/binary file
 */
import java.io.*;
import java.util.Scanner;
public class Test7 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter folder name");
		String foldername=sc.next();
		File f=new File(foldername);
		if(f.exists()&&f.isDirectory())
		System.out.println("already exist");
		else if(f.mkdir()==true)
		System.out.println("successfully created");
		else
		System.out.println("cannot be created");
		System.out.println("Enter file name ");
		String filename=sc.next();
		FileOutputStream output = new FileOutputStream(foldername+"\\"+filename+".dat");
		System.out.println("file created");
		String header = "Name\tRegdno\tEssaysubmitted";
		
		byte[] arrheader=header.getBytes();
		output.write(arrheader);
		String record=new String();
		String name;
		int regdno; 
		char submitted,ch='n';
		do {
			System.out.println("Enter name regdno, submitted or not");
			name=sc.next();
			regdno=sc.nextInt();
			submitted=sc.next().charAt(0);
			String newrecord=record.concat("\n").concat(name).concat("\t").concat(String.valueOf(regdno)).concat("\t").concat(String.valueOf(submitted));
			arrheader=newrecord.getBytes();
			output.write(arrheader);
			System.out.println("Enter y for continue else press n");
			ch=sc.next().charAt(0);
		}while(ch!='n');

		System.out.println("All contents to file written");
		
		output.close();

	}

}
