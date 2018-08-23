public class DecoratorPattern {
   public static void main(String[] args) {

      Artist firstMusician = new Musician("Fer");

      Artist secondMusician =  new DrumsDecorator(new Musician("Luis"));

      Artist thirdMusician = new BassDecorator(new DrumsDecorator(new Musician("Kim")));


      System.out.println("- First artist: " + firstMusician.getName());
      firstMusician.performance();

      System.out.println("- Second artist: " + secondMusician.getName());
      secondMusician.performance();

      System.out.println("- Third artist: " + thirdMusician.getName());
      thirdMusician.performance();
   }
}