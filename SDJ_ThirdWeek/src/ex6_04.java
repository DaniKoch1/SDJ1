import java.util.Scanner;
public class ex6_04
{
   public static void main(String[] args)
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter 2 numbers.");
      int  a=in.nextInt(), b=in.nextInt();
      
      if(a<b)
         System.out.println(a);
      else
         System.out.println(b);
      
      if(a<b)
         System.out.println(a+", "+b);
      else
         System.out.println(b+", "+a);
      
      System.out.println("Enter 3 numbers.");
      a=in.nextInt();
      b=in.nextInt();
      int c=in.nextInt();
      
      if(a<b && a<c)
      {
         if(b<c)
            System.out.println(a+", "+b+", "+c);
         else
            System.out.println(a+", "+c+", "+b);
      }
      else if(b<c)
      {
         if(a<c)
            System.out.println(b+", "+a+", "+c);
         else
            System.out.println(b+", "+c+", "+a);
      }
      else
      {
         if(a<b)
            System.out.println(c+", "+a+", "+b);
         else
            System.out.println(c+", "+b+", "+a);
      }
      
      System.out.println("Enter 4 numbers.");
      a=in.nextInt(); b=in.nextInt(); c=in.nextInt();
      int d=in.nextInt();
      
      if(a<b && a<c && a<d)
      {
         if(b<c && b<d)
         {
            if(c<d)
               System.out.println(a+", "+b+", "+c+", "+d);
            else
               System.out.println(a+", "+b+", "+d+", "+c);
         }
         else if(c<d)
         {
            if(b<d)
               System.out.println(a+", "+c+", "+b+", "+d);
            else
               System.out.println(a+", "+c+", "+d+", "+b);
         }
         else
         {
            if(b<c)
               System.out.println(a+", "+d+", "+b+", "+c);
            else
               System.out.println(a+", "+d+", "+c+", "+b);
         }
      }
      else if(b<c && b<d)
      {
         if(a<c && a<d)
         {
            if(c<d)
               System.out.println(b+", "+a+", "+c+", "+d);
            else
               System.out.println(b+", "+a+", "+d+", "+c);
         }
         else if(c<d)
         {
            if(a<d)
               System.out.println(b+", "+c+", "+a+", "+d);
            else
               System.out.println(b+", "+c+", "+d+", "+a);
         }
         else
         {
            if(a<c)
               System.out.println(b+", "+d+", "+a+", "+c);
            else
               System.out.println(b+", "+d+", "+c+", "+a);
         }
      }
      else if(c<d)
      {
         if(a<b && a<d)
         {
            if(b<d)
               System.out.println(c+", "+a+", "+b+", "+d);
            else
               System.out.println(c+", "+a+", "+d+", "+b);
         }
         else if(b<d)
         {
            if(a<d)
               System.out.println(c+", "+b+", "+a+", "+d);
            else
               System.out.println(c+", "+b+", "+d+", "+a);
         }
         else
         {
            if(a<b)
               System.out.println(c+", "+d+", "+a+", "+b);
            else
               System.out.println(c+d+b+a);
         }
      }
      else
      {
         if(a<b && a<c)
         {
            if(b<c)
               System.out.println(d+", "+a+", "+b+", "+c);
            else
               System.out.println(d+", "+a+", "+c+", "+b);
         }
         else if(b<c)
         {
            if(a<c)
               System.out.println(d+", "+b+", "+a+", "+c);
            else
               System.out.println(d+", "+b+", "+c+", "+a);
         }
         else
         {
            if(a<b)
               System.out.println(d+", "+c+", "+a+", "+b);
            else
               System.out.println(d+", "+c+", "+b+", "+a);
         }
      }
   }
}
