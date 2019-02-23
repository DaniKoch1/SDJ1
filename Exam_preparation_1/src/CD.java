import java.util.ArrayList;

public class CD
{
   private String title;
   private ArrayList<CDTrack> trackList;
   
   public CD(String title)
   {
      this.title=title;
      trackList=new ArrayList<CDTrack>();
   }
   public void addTrack(CDTrack track)
   {
      trackList.add(track);
   }
   public String getTitle()
   {
      return title;
   }
   public Time getDuration()
   {
      int seconds=0;
      for(CDTrack i: trackList)
         seconds+=i.getLength().getTimeInSeconds();
      return new Time(seconds);
   }
   public CDTrack getCDTrack(int trackNumber)
   {
      return trackList.get(trackNumber-1);
   }
   public String toString()
   {
      String s=title+"\n"+this.getDuration()+"\n";
      for(CDTrack i: trackList)
      {
         s+=i.toString()+"\n";
      }
      return s;
   }
}
