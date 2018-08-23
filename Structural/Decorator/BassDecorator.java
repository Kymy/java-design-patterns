public class BassDecorator extends MusicianDecorator {

   public BassDecorator(Artist artist) {
      super(artist);
   }

   @Override
   public void performance() {
      artist.performance();	       
      playNewInstrument();
   }

   private void playNewInstrument(){
      System.out.println("Playing the bass");
   }
}