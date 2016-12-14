public class PrototypePattern {

	public static Animal cloneAnimal(Animal animal){
   		return (Animal) animal.clone();
   	}  
   
   	public static void main(String[] args) {

	   	Dog dog = new Dog();
		Animal dogCopy = (Animal) cloneAnimal(dog);
		System.out.println("Animal : " + dogCopy.getType());		

	   	Cat cat = new Cat();
		Animal catCopy = (Animal) cloneAnimal(cat);
		System.out.println("Animal : " + catCopy.getType());		
	
   }
}
