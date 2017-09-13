package Section6;

import java.util.Scanner;

public class Multiplication{

    int z;
    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Please enter first number: ");
       int firstNum = scan.nextInt();
               
       System.out.println("Please enter second number: ");
       int secNum = scan.nextInt();
       
       int multi = firstNum * secNum;
       
       System.out.println("Your answer is " + multi);
    }
    
}
