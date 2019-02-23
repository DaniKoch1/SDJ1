import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class binary_files_read
{
   public static void main(String[] args)
   {
      ObjectInputStream read=null;
      try
      {
         File file=new File("seveen.bin");
         FileInputStream fis=new FileInputStream(file);
         read=new ObjectInputStream(fis);
         
         int num;
         String comma;
         for(int i=0;i<199;i++)
         {
            num=read.readInt();
            comma=(String)read.readObject();
            System.out.println(num+comma);
         }
         fis.close();
      }
      catch(IOException io)
      {
         System.out.println(io.getStackTrace());
      }
      catch(ClassNotFoundException nfe)
      {
         System.out.println(nfe.getStackTrace());
      }
      finally
      {
         try
         {
            read.close();
         }
         catch(IOException io)
         {
            System.out.println(io.getStackTrace());
         }
      }
   }
}
