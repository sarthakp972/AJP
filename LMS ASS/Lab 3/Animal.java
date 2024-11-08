/******************************************************************************

*******************************************************************************/

public class Animal
{
    
    public void Makesounds(){
        System.out.println("Animal MAking Sounds");
    }
    
	public static void main(String[] args) {
	    Animal a=new Animal();
	    a.Makesounds();
			Dog d=new Dog();
		d.Makesounds();
		Cat c=new Cat();
		c.Makesounds();
		
	
	}
}
class Dog extends Animal{
    public void Makesounds(){
        System.out.println("Dog barking");
    }
    
}
class Cat extends Animal {
     public void Makesounds(){
        System.out.println("cat meowing");
    }
}