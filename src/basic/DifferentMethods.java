package basic;

public class DifferentMethods {
	
	public void add(int a , int b) 
	{
	int c = a+b;
	    System.out.println("Addition value is: " + c);
	}

	public void sub(int a , int b) 
	{

	int c = a-b;
	    System.out.println("Subtraction value is: " + c);
	}
	
	public void multiple(int a , int b)
	{

	int c = a*b;
	    System.out.println("Multiplication value is: " + c);
	}
	
	public void div(int a , int b) 
	{
	int c = a/b;
	    System.out.println("Division value is: " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentMethods cal= new DifferentMethods();
		cal.add(5,5);
		cal.sub(10,5);
		cal.multiple(2,4);
		cal.div(10,2);
		
		DifferentMethods cal1= new DifferentMethods();
		cal1.add(10,5);
		cal1.sub(50,5);
		cal1.multiple(12,4);
		cal1.div(110,2);
		
		

	}

}
