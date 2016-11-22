public class FlowerFactory extends AbstractFactory {
	
   @Override
   public Flower getFlower(String flowerType){
   
      if(flowerType == null){
         return null;
      }		
      if(flowerType.equalsIgnoreCase("ROSE")){
         return new Rose();
         
      }else if(flowerType.equalsIgnoreCase("APPLEBLOSSOM")){
         return new AppleBlossom();
      }

      return null;
   }
   
   @Override
   Animal getAnimal(String animal) {
      return null;
   }
}
