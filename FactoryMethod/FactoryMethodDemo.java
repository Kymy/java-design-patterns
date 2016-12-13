public class FactoryMethodDemo {

   public static void main(String[] args) {

      AnimalFactory animalFactory = new AnimalFactory();

      Animal animal1 = animalFactory.getAnimal("DOG");
      animal1.eat();

      Animal animal2 = animalFactory.getAnimal("CAT");
      animal2.eat();

   }
}