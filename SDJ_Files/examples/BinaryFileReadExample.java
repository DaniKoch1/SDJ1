import java.io.*;

public class BinaryFileReadExample
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      String filename = "test.bin";
      ObjectInputStream in = null;

      try
      {
         File file = new File(filename);
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);

         int count = in.readInt(); // The first thing we read from the file is
                                   // of type int

         for (int i = 0; i < count; i++)
         {
            int intValue = in.readInt(); // The next thing we read from the file
                                         // is of type int
            double doubleValue = in.readDouble(); // The next thing we read from
                                                  // the file is of type double
            System.out.println(intValue + ", " + doubleValue);
         }
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            in.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }

   }

}
