import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinaryFileWriteExample
{

   public static void main(String[] args)
   {
      String filename = "test.bin";

      ObjectOutputStream out = null;

      try
      {
         File file = new File(filename);
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);

         int count = 7;
         out.writeInt(count);
         for (int i = 0; i < count; i++)
         {
            out.writeInt(i);
            out.writeDouble(Math.sqrt(i));
         }
      }

      catch (IOException e)
      {
         System.out.println("Exception: " + filename);
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }

   }

}
