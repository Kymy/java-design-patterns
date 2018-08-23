public class Session {

   private static Session instance = new Session();
   private String sessionID;

   private Session(){};

   public static Session getInstance(){
      return instance;
   };

   public void setID(String id){
      sessionID = id;
   };

   public String getID(){
      return sessionID;
   };
}