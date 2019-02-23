

public class NotebookTest2
{
   public static void main(String[] args)
   {
      Note note1=new Note("Hey!");
      Note note2=new Note("Hello!");
      Note note3=new Note("Hi!");
      
      note1.setToHighPriority();
      note3.setToLowPriority();
      
      Notebook2 nb=new Notebook2();
      System.out.println(nb.getNumberOfNotes());
      nb.addNote(note1);
      nb.addNote(note2);
      nb.addNote(note3);
      nb.addNote("Aye!");
      nb.addHighPriorityNote("What's up?!");
      
      System.out.println(nb);
      nb.removeNote(2);
      nb.removeNote(3);
      System.out.println(nb);
      System.out.println(nb.getMostImportantNote());
   }
}
