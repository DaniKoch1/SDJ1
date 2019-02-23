
public class CDTrack
{
   private String title;
   private String artist;
   private Time length;
   
   public CDTrack(String title, String artist, Time length)
   {
      this.artist=artist;
      this.title=title;
      this.length= new Time(length.getHour(),length.getMinute(),length.getSecond());
   }
   public String toString()
   {
      return "title: "+title+"\nartist: "+artist+"\nLength: "+length;
   }
   public CDTrack copy()
   {
      return new CDTrack(title, artist, length);
   }
}
