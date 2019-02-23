import java.util.Scanner;
public class ex2_06
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      String name, city, college, profession, animal, pet;
      int age;
      System.out.println("Input your name, age, city, name of your college, your profession, favourite animal and a name for a pet");
      name=input.nextLine();
      age=input.nextInt();
      input.nextLine();
      city=input.nextLine();
      college=input.nextLine();
      profession=input.nextLine();
      animal=input.nextLine();
      pet=input.nextLine();
      
      System.out.println("There was once a person named "+name+" who lived in "+city+".\n"
                        + "Despite the young age, "+age+", "+name+" worked as a "+profession+" at "
                        +college+".\nAfter work she hunted "+animal+"s with "+pet+".");
      
   }
}
