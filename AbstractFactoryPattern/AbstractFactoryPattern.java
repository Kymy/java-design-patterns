public class AbstractFactoryPattern {
   public static void main(String[] args) {

      AbstractFactory animalFactory = FactoryProducer.getFactory("ANIMAL");

      Animal animal1 = animalFactory.getAnimal("DOG");
      animal1.eat();

      Animal animal2 = animalFactory.getAnimal("CAT");
      animal2.eat();

      AbstractFactory flowerFactory = FactoryProducer.getFactory("flower");

      Flower flower1 = flowerFactory.getFlower("ROSE");
      flower1.eat();

      Flower flower2 = flowerFactory.getFlower("APPLEBLOSSOM");
      flower2.eat();
   }
}