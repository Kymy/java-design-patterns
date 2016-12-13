public class AnimalFactory {
	
   public Animal getAnimal(String animalType){
      if(animalType == null){
         return null;
      }		
      if(animalType.equalsIgnoreCase("DOG")){
         return new Dog();
         
      } else if(animalType.equalsIgnoreCase("CAT")){
         return new Cat();
      } 
      
      return null;
   }
}