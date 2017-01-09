public class DecoratorPattern {
   public static void main(String[] args) {

      Artist firstMusician = new Musician("Alan");

      Artist secondMusician = new BassDecorator(new Musician("Daniel"));

      System.out.println("- First artist: " + firstMusician.getName());
      firstMusician.performance();

      System.out.println("- Second artist: " + secondMusician.getName());
      secondMusician.performance();
   }
}