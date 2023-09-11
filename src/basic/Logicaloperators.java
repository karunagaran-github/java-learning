package basic;

public class Logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=20, num3=30;
		boolean retVal=false;
		
		if( (num1<num2) && (num2>num1) )
		{
			retVal=true;
			System.out.println("AND Condition "+retVal);
		}
		 if( (num1<num2) && (num2<num1) )
		{
			retVal=true;
			System.out.println("AND Condition "+retVal);
		}
		 if ((num1<num2) || (num3<num1))
		{
			retVal=true;
			System.out.println("OR Condition "+retVal);
		}
	

	}

}
