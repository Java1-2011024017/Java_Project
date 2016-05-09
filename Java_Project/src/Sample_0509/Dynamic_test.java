package Sample_0509;
abstract class Animal1
{
	abstract void sound();
}

class Dog extends Animal1
{
	private int d=11;
	void sound(){
		System.out.println("港港"+d);
	}
}

class Cat extends Animal1
{
	private int c=99;
	void sound(){
		System.out.println("具克"+c);
	}
}


public class Dynamic_test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Animal1 dog = new Dog();
		Animal1 cat = new Cat();
		
		dog.sound(); cat.sound();
		
		//Animal1 obj;
				
		//obj = dog;
		//obj.sound();
		
		//obj = cat;
		//obj.sound();
		
		test(dog); test(cat);
	}
	
		static void test(Animal1 temp)
		{
			temp.sound();
		}
}


