import java.util.ArrayList;

public class Notebook2
{
   private ArrayList<Note> notes=new ArrayList<Note>();
   public Notebook2()
   {
   }
   public int getNumberOfNotes()
   {
      return notes.size();
   }
   public String getMessage(int index)
   {
      return notes.get(index).toString();
   }
   public void addNote(Note note)
   {
      notes.add(note.copy());
   }
   public void addNote(String message)
   {
      notes.add(new Note(message));
   }
   public void addHighPriorityNote(String message)
   {
      Note other=new Note(message);
      other.setToHighPriority();
      notes.add(other);
   }
   public void removeNote(int index)
   {
      notes.remove(index);
   }
   public boolean isHighPriorityNote(int index)
   {
      return notes.get(index).isHighPriority();
   }
   public int indexOfMostImportantNote()
   {
      for(int i=0;i<notes.size();i++)
         if(isHighPriorityNote(i))
            return i;
      return -1;
   }
   public String getMostImportantNote()
   {
      return notes.get(indexOfMostImportantNote()).toString();
   }
   public String toString()
   {
      String print="The number of notes: "+this.getNumberOfNotes()+"\nThe notes: ";
      for(Note i:notes)
         print+="\n"+i.toString();
      return print;
   }
   
}
