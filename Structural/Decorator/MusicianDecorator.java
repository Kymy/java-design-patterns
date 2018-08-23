public abstract class MusicianDecorator implements Artist {
   protected Artist artist;

   public MusicianDecorator(Artist musician){
      this.artist = musician;
   }

   public void performance(){
   	  artist.performance();
   }

   public String getName(){
   	  return artist.getName();
   }	
}