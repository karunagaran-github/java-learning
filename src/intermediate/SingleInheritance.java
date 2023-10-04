package intermediate;


	class Animal{
		String AnimalName= "dog";
		void eat()
		{
		System.out.println("This is the parent class");
		}
		}
	
	public class SingleInheritance extends Animal {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritance obj1 = new SingleInheritance();
		obj1.eat();
		System.out.println("The name of the animal is "+ obj1.AnimalName);
			

	}

}
