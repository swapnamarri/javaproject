package project;
import java.util.Scanner;
 
public class StudentDetails
{
      public static void main(String args[])
      {
          String name;
          int roll, math, phy, eng;
           
          Scanner SC=new Scanner(System.in);
           
          System.out.println("welcome to sms(student management system");
          System.out.println("body of the student");
          System.out.print("Enter the Name: ");
          name=SC.nextLine();
          System.out.print("Enter the Roll Number: ");
          roll=SC.nextInt();
          System.out.print("Enter the subjects: ");
          math=SC.nextInt();
          phy=SC.nextInt();
          eng=SC.nextInt();
           
          int total=math+eng+phy;
          float perc=(float)total/300*100;
           
          System.out.println("Roll Number:" + roll +"\tName: "+name);
          System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
          System.out.println("Total: "+total +"\tPercentage: "+perc);
            
      }
}     