package basic;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * do
		 * {
		 * 		//execute the code
		 * }while(condition);
		 * 
		 * Do while loop will get executed once irrespective of the condition (pass or fail) 
		 * whereas in while loop, condition would be validated first and then print
		 */
		
		int i=1;
		do
		{
			System.out.println("The value of i is "+i);
			i++; //i=i+1
		}while(i<10);

	}

}
