import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class binary_file_write
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Input the name of the file: ");
      String filename=in.nextLine();
      
      ObjectOutputStream write=null;
      try
      {
         File file=new File(filename+".bin");
         FileOutputStream fos=new FileOutputStream(file);
         write=new ObjectOutputStream(fos);
         
         for(int i=1; i<200;i++)
         {
            write.writeInt(i*7);
            write.writeObject(", ");
         }
         fos.close();
      }
      catch(IOException io)
      {
         System.out.println(io.getStackTrace());
      }
      finally
      {
         try
         {
            write.close();
         }
         catch(IOException io)
         {
            System.out.println(io.getStackTrace());
         }
      }
   }
}
