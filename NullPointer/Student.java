package NullPointer;

public class Student {
	
	int roll=3;
	
	public void printStudent()
	{
		
		System.out.println(roll);
	}
	
	
	public static void main(String [] args){
		
		try {
			
			Student s=null;
			s.printStudent(); 
			
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("IT IS TRUE");
		
	}

}
