import java.io.*;


public class BinaryFileObjectExample
{

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      String filename = "employeeList.bin";

      Employee employee1 = new Employee("Bob", 27, 9999);
      Employee employee2 = new Employee("Wendy", 51, 5000);

      ObjectOutputStream out = null;

      try
      {
         File file = new File(filename);
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);

         out.writeObject(employee1); 
         out.writeObject(employee2);
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

      filename = "employeeList.bin";
      ObjectInputStream in = null;

      try
      {
         File file = new File(filename);
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);

         Employee emp1 = (Employee)in.readObject();
         System.out.println(emp1);

         Employee emp2 = (Employee)in.readObject();
         System.out.println(emp2);
      }
      
      catch (IOException | ClassNotFoundException e)
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
