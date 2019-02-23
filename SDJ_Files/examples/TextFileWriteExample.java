import java.io.*;

public class TextFileWriteExample
{
   public static void main(String[] args) throws FileNotFoundException
   {

      String filename = "test.txt";
      File file = new File(filename);

      PrintWriter out = new PrintWriter(file); // Open the file

      String[] text = { "Line 1; 1; 2.9", "Line 2; 4; 3.4", "Line 3; 4; 3.3",
            "Line 4; 9; 1.1", "Line 5; 3; 3.2" };
      for (int i = 0; i < text.length; i++)
      {
         out.println(text[i]);
         out.flush(); // Force it to write the text
      }

      out.close(); // Close the file
      System.out.println("End writing data to file: " + file.getAbsolutePath());

   }

}
