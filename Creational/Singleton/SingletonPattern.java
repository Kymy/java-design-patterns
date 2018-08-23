public class SingletonPattern {
   public static void main(String[] args) {
      Session session = Session.getInstance();
      session.setID("QWERTY");
      System.out.println("Session ID: " + session.getID());

   }
}