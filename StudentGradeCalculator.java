/*STUDENT GRADE CALCULATOR */

import java.util.Scanner;

public class StudentGradeCalculator {
  public static void main(String[] args) {

   Scanner in = new Scanner(System.in);

        int totalSubjects;
        System.out.print("\nEnter the number of subjects: ");
        totalSubjects = in.nextInt(); 

    int total_Marks = 100*totalSubjects;

    System.out.println("\nTotal marks is : " + total_Marks);
    
  

      System.out.println("\nEnter the  marks obtaine in  "+totalSubjects+ "  subjects: ");

      int Obtained_Marks = 0;
      String grade;
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("\nEnter marks obtained in subject " + i + ": ");
            int marks = in.nextInt(); 
            Obtained_Marks += marks;
        }
      
      System.out.println("\nTotal marks obtained:= " + Obtained_Marks);

      float Avg_Percent = Obtained_Marks / totalSubjects;

      System.out.println("\nAverage Percentage is : " + Avg_Percent);
      
       if (Avg_Percent >= 90)
       grade="A";
        
      else if (Avg_Percent >= 80)
        grade="B";
      else if (Avg_Percent >= 65)
         grade="C";
      else if (Avg_Percent >= 50)
         grade="D";
      else if (Avg_Percent >= 33)
        grade="E";
      else
        grade="F";
      
        System.out.println("\nGrade : "+ grade);

    }
  }