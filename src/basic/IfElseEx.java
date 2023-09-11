package basic;

public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If Else is a conditional statement which will be used to validate a condition in java
		
		
		
		/*
		 * if(condition)
		 * {
		 * 	//condition passes
		 * }
		 * else if(next condition)
		 * {
		 *	//condition passes
		 *	}
		 *else
		 *{
		 *	//no condition passes
		 *
		 *}
		 *
		 */
		
		int a =10;
		int b=10;
		int c=30;
		
		if (a>b)

		{
			System.out.println("a is greater than b");
			
		}
		else if (b>a)
		{
			System.out.println("b is greater than a");
		}
		else if(c>b)
		{
			System.out.println("c is greater than b");
		}
		else
		{
			System.out.println("a and b are equal");
		}
	}

}
