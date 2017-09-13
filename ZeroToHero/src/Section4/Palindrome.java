package Section4;

import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args){

        String word, reverse = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check for a palindrome.");
        word = in.nextLine();

        int length = word.length();

        for (int i = (length - 1); i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("String is a palindrome.");
        }
        else{
            System.out.println("String is not a palindrome.");
        }

    }
}
