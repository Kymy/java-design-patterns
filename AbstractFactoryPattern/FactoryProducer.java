public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("ANIMAL")){
         return new AnimalFactory();
         
      }else if(choice.equalsIgnoreCase("FLOWER")){
         return new FlowerFactory();
      }
      
      return null;
   }
}