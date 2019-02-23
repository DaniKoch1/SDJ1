import java.io.*;
import java.util.Scanner;

public class TextFileReadExample
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filename = "test.txt";
      File file = new File(filename);

      Scanner in = new Scanner(file);      // Open the file

      while (in.hasNext())
      {
         String line = in.nextLine();      // Read a line

         String[] token = line.split(";"); // Split the line into an array

         String txt = token[0].trim(); // store the first entry in the array

         int x = Integer.parseInt(token[1].trim()); // cast the second entry to int and store

         double d = Double.parseDouble(token[2].trim()); // cast the third entry to double and store

         System.out.println(txt + " - " + x + " - " + d); //print out all 3 entries
      }

      in.close(); // Close the file

      System.out.println("End reading data from file: " + file.getAbsolutePath());


   }
}
