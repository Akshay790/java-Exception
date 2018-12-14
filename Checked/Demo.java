package Checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
	
	public static void main(String[] args)
	{
		
	
	
		try {
			FileInputStream fs=new FileInputStream("d://data.text");
		} 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		int i=10,m=4;
		int c=i+m;
		
		System.out.println("ADD :"+c);
	
	}
	
}
