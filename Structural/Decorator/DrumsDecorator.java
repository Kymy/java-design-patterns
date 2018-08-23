public class DrumsDecorator implements Artist {

    Musician artist;

    public DrumsDecorator(Musician artist){
        this.artist = artist;
    }
   
   @Override
   public void performance() {
      artist.performance();	       
      playNewInstrument();
   }

   @Override
   public String getName() {
       return this.artist.getName();
   }

   private void playNewInstrument(){
      System.out.println("Playing the drums");
   }

}