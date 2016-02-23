/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project1;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author it.student
 */
public class SE330Project1 {

   
   
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException, InterruptedException{
        /* This line clears the screen when run from the console. Very useful.
         * new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         */
        
        //DISPLAY FORMAT:
        // ||-------------[[ MENU  NAME ]]------------------------||
        // || (number [3 digits]): (information) [up to 50 chars] ||
        // || (number [3 digits]): (information) [up to 50 chars] ||
        // || (number [3 digits]): (information) [up to 50 chars] ||
        // ||-----------------------------------------------------||
        // Make a selection [0 returns]: 
        
        //DISPLAY EXAMPLE:
        // ||---------------------[[ STUDENTS  ]]---------------------||
        // || James Talor                                             ||
        // || David S. Nolestein                                      ||
        // ||---------------------------------------------------------||
        // ||   1: Add Student                                        ||
        // ||   2: Remove Student                                     ||
        // ||   3: View Student Details                               ||
        // ||---------------------------------------------------------||
        // Make a selection [0 exits]: 
        
        //Allow students to take/drop courses
        //When course is full, student is put on a waiting list
        //After a specific time, when a course is not full, students from the
        //ist are auto-registered up to the course's capacity.
        //Students are allowed to register for up to four courses at once        
        Scanner s = new Scanner(System.in);
        int menuSelection = 0;
        boolean keepRunning = true;
        boolean inMenu = true;
        /* Menu IDs:
        ** 0 - Main
        ** 1 - Classes
        ** 2 - Students
        */
        int menuID = 0;
        
        /*Menu Stuff:
        ** Goto Students
        ** Sudents -> Add Student
        ** Students -> Remove Student
        ** Students -> Student -> Apply for Course
        ** Students -> Student -> Drop Course
        ** Students -> Student -> Goto Course
        ** Goto Courses
        ** Courses -> View Course
        **
        **
        */
        
        System.out.print("Testing clear screen.");
        s.nextLine();
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        System.out.println();
        System.out.printf("|| %3s: %-50s ||\n", "[|]", "Test Complete");
        System.out.printf("||---------------------------------------------------------||\n");
        System.out.printf("|| %-55s ||\n", "Press enter to continue...");
        
        s.nextLine();        
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
              
        while(keepRunning){
            menuSelection = s.nextInt(); 
            
        }
        
    }
    
}
