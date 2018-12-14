package Checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
	

	public static void readFile() throws FileNotFoundException
	{
		FileInputStream fs = new FileInputStream("d://data.text");
		
	}
	
	
	public static void main(String [] args)
	{
		
	try {
		readFile();
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int i=5,m=45;
	int c=i+m;
	System.out.println("ADD :"+c);
	}
}
