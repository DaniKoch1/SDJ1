
public class Notebook
{
   private int numberOfNotes;
   private Note[] notes;
   public Notebook(int maxNumberOfNotes)
   {
      notes=new Note[maxNumberOfNotes];
      numberOfNotes=0;
   }
   public int getNumberOfNotes()
   {
      return numberOfNotes;
   }
   public Note getNote(int index)
   {
      return notes[index];
   }
   public String getMessage(int index)
   {
      return notes[index].toString();
   }
   public void addNote(Note note)
   {
      notes[numberOfNotes]=note.copy();
      numberOfNotes++;
   }
   public void addNote(String message)
   {
      notes[numberOfNotes]=new Note(message);
      numberOfNotes++;
   }
   public void addHighPriorityNote(String message)
   {
      notes[numberOfNotes]=new Note(message);
      notes[numberOfNotes].setToHighPriority();
      numberOfNotes++;
   }
   public void removeNote(int index)
   {
      for(int i=index;i<numberOfNotes-1;i++)
         notes[i]=notes[i+1];
      notes[numberOfNotes-1]=null;
      numberOfNotes--;
   }
   public Note[] getAllNotes()
   {
      Note[] other=new Note[numberOfNotes];
      for(int i=0;i<numberOfNotes;i++)
         other[i]=notes[i].copy();
      return other;
   }
   public int getNumberOfHighPriorityNotes()
   {
      int s=0;
      for(int i=0;i<numberOfNotes;i++)
         if(notes[i].isHighPriority())
            s++;
      return s;
   }
   public Note[] getAllHighPriorityNotes()
   {
      Note[] other=new Note[getNumberOfHighPriorityNotes()];
      int j=0;
      for(int i=0;i<numberOfNotes;i++)
         if(notes[i].isHighPriority())
         {
            other[j]=notes[i].copy();
            j++;
         }
      return other;
   }
   public String toString()
   {
      String print="The number of notes: "+numberOfNotes+"\nThe notes: ";
      for(int i=0;i<numberOfNotes;i++)
         print+="\n"+notes[i].toString();
      return print;
   }
   public String importantToString()
   {
      String print="The number of important notes: "+getNumberOfHighPriorityNotes()+"\nThe notes: ";
      for(int i=0;i<numberOfNotes;i++)
         if(notes[i].isHighPriority())
            print+="\n"+notes[i].toString();
      
      return print;
   }
   
}
