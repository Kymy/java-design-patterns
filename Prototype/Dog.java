public class Dog extends Animal {

   public Dog(){
     type = "Dog";
   }

   @Override
   public void eat() {
      System.out.println("DOG eat method");
   }
}