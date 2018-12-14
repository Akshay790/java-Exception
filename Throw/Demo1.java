package Throw;

public class Demo1 {
	
	public static void Calculate()
	{
		int n=10,d=0;
		if(d==0)
			
			throw new ArithmeticException("Denominator Can not be Zero");
		
		float res=n/d;
		System.out.println("DIVISION ="+res);
			
	}
	
	
	public static void main(String[] args)
	{
		try
		{
		Calculate();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("IT IS FINE");
	}

}
