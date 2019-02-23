import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Friends
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      String filename;
      
      System.out.println("Type the filename ending with .txt: ");
      filename=in.nextLine();
      File file=new File(filename);
      try {
      PrintWriter write=new PrintWriter(file);
      System.out.println("Type the names of your friends, to quit, write quite.");
      String k=in.nextLine();
      String[] text=null;
      int i=0;
      while(!k.equalsIgnoreCase("quit"))
      {
         text[i]=k;
         i++;
         k=in.nextLine();
      }
      if(text.length==0)
      {
         write.println("Poor creature, you have no friends");
         write.flush();
      }
      else
      {
         for(i=0;i<text.length;i++)
         {
            write.println(text[i]);
            write.flush();
         }
      }
      
      
      write.close();
      }
      catch(FileNotFoundException fnfe)
      {
         System.out.println("No file.");
      }
      
      
   }
}
