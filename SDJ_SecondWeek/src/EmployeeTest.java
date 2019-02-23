import java.util.Scanner;
public class EmployeeTest
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      Employee em1=new Employee();
      Employee em2=new Employee();
      Employee em3=new Employee();
      Employee em4= new Employee("Dani", 358, "IT", "chef");
      
      int i=1;
         System.out.println("Input the name, ID, department and position of the "+i+" person.");
         em1.setName(in.nextLine());
         em1.setID(in.nextInt());
         in.nextLine();
         em1.setDep(in.nextLine());
         em1.setPos(in.nextLine());
        i++;
         System.out.println("Input the name, ID, department and position of the "+i+" person.");
         em2.setName(in.nextLine());
         em2.setID(in.nextInt());
         in.nextLine();
         em2.setDep(in.nextLine());
         em2.setPos(in.nextLine());
        i++; 
         System.out.println("Input the name, ID, department and position of the "+i+" person.");
         em3.setName(in.nextLine());
         em3.setID(in.nextInt());
         in.nextLine();
         em3.setDep(in.nextLine());
         em3.setPos(in.nextLine());
         
         i=1;
         System.out.println(i+". "+em1);
         System.out.println(++i+". "+em2);
         System.out.println(++i+". "+em3);
         System.out.println(++i+". "+em4);
         
   }
}
