import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriteAndReadEmployee
{

   /**
    * @param args
    * @throws FileNotFoundException
    */
   public static void main(String[] args) throws FileNotFoundException
   {

      String filename = "employees.txt";
      File file = new File(filename);

      PrintWriter out = new PrintWriter(file); // Open the file

      Employee bob = new Employee("Bob", 24, 5000);
      
      out.println(bob.getName());
      out.println(bob.getAge());
      out.println(bob.getSalary());
      out.flush(); // Force it to write the text

      filename = "employees.txt";
      file = new File(filename);

      Scanner in = new Scanner(file);      // Open the file

      String name = in.nextLine();
      System.out.println(name);
      
      int age = in.nextInt();
      System.out.println(age);
      
      int salary = in.nextInt();
      System.out.println(salary);
      
     Employee bob2 = new Employee(name, age, salary);
      
      out.close(); // Close the file
      
      System.out.println(bob2);

   }

}
