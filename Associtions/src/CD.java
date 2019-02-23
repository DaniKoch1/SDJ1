import java.util.ArrayList;

public class CD
{
   String title;
   ArrayList<CDTrack> trackList;
   
   public CD(String title)
   {
      this.title=title;
      trackList=new ArrayList<CDTrack>();
   }
   
}
