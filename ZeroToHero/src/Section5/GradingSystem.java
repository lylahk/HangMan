
package Section5;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args){
 
        Scanner grade = new Scanner(System.in);                                 //sets up receiving info from console.

        System.out.println("Please enter the student grades");                  //prints out to console requesting grade to be entered.
        int graded = grade.nextInt();                                           //sets variable to the grade entered.
    
        if(graded > 90){                                                        //decision operators
            System.out.println("Congragulations, you have an A");
        }
        else if(graded > 80){
            System.out.println("Congragulations, you have an B");
        }
        else if(graded > 70){
            System.out.println("Congragulations, you have an C");
        }
        else if(graded > 60){
            System.out.println("Congragulations, you have an D");
        }
         else{
            System.out.println("You received an F.  You may want to study.");
        }
    
    }
}
