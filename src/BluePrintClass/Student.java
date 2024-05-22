package BluePrintClass;

import java.sql.SQLOutput;

public class Student {
    //Attribute
    String name ;
    String email;
    String age ;
     // Behaviour/ Functions
    int experiance;
   public void  Studentocupation(int experience ){
         if (experience > 0 ){
             System.out.println("Student is Working professional");

         }else{
             System.out.println("Student is Fresher/Non-It Background");
         }

    }
}
