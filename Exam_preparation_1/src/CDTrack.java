
public class CDTrack
{
   private String title, artist;
   private Time length;
   
   public CDTrack(String title, String artist, Time length)
   {
      this.artist=artist;
      this.title=title;
      this.length=new Time(length.getHour(), length.getMinute(), length.getSecond());
   }
   public String getTitle()
   {
      return title;
   }
   public String getArtist()
   {
      return artist;
   }
   public Time getLength()
   {
      return new Time(length.getHour(), length.getMinute(), length.getSecond());
   }
   public void setArtist(String artist)
   {
      this.artist=artist;
   }
   public String toString()
   {
      return "\""+artist+" - "+title+" ("+length.toString()+")\"";
   }
   public CDTrack copy()
   {
      return new CDTrack(title, artist, length);
   }
}
