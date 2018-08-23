public abstract class Animal implements Cloneable {
   
   protected String type;
   
   abstract void eat();
   
   public String getType(){
      return type;
   }
   
   public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
   }
}