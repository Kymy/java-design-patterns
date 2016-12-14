public class Cat extends Animal {

   public Cat(){
     type = "Cat";
   }

   @Override
   public void eat() {
      System.out.println("CAT eat method");
   }
}