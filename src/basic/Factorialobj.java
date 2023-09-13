package basic;

public class Factorialobj {
	int employee = 100;
	
public void factorialCalculation() 
{int number = 5;

int factorial = 1;

  for (int i = 1; i <= number; i++) {
        factorial *= i;
    }
    System.out.println("Factorial of " + number + " is: " + factorial);
}

public void factorialCalculationNos(int number)
{
	

    int factorial = 1;

      for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorialobj fact= new Factorialobj();
		fact.factorialCalculation();
		fact.factorialCalculationNos(6);
		System.out.println("The value of employee age is "+fact.employee);
		
		
		// we can create n no of objects to a class
		Factorialobj fact1= new Factorialobj();
		fact1.factorialCalculation();
		fact1.factorialCalculationNos(10);
		
		Factorialobj fact2= new Factorialobj();
		fact2.factorialCalculation();
		fact2.factorialCalculationNos(12);


	}

}
