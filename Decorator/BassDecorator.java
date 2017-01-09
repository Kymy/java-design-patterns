public class BassDecorator extends MusicianDecorator {

   public BassDecorator(Artist artist) {
      super(artist);		
   }

   @Override
   public void performance() {
      artist.performance();	       
      playNewInstrument(artist);
   }

   private void playNewInstrument(Artist artist){
      System.out.println("Playing the bass");
   }
}