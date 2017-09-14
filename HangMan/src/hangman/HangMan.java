package hangman;

import java.util.Scanner;


public class HangMan{
    public static void main(String[] args){
        
    /**     Instantiations      **/
        
        //create a list of words to choose from
        String[] words = {"House", "Horse", "Water", "Phone"};

        //Select random index from words[]
        int randomWordInt = (int) (Math.random() * words.length);
        //assign selected word from array by index
        String wordSelect = words[randomWordInt];

        //create array to hold letters for selected word
        int length = wordSelect.length();
        char[] ltrWord = new char[length];
        
        for (int i = (length - 1); i >= 0; i--){
             wordSelect.charAt(i);
        }
        
        //count number of guesses
        int ltrTried = 0;
        //check if word is completely guessed
        String guessedWord = "";

        
        
        
            //set up console input
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a letter to guess.\n");

            String ltr = in.nextLine();
       
            
            if(wordSelect.equals(guessedWord)){
                System.out.println("Congrats! You have guessed all the letters.");
        }
        else{
            System.out.println("You have guess wrong 6 times.  You've failed.");
        }
        }
        
        
         
        
	
        
        
        /*
		System.out.print(words.length + "\n");
                System.out.print(randomWordInt + "\n");
                System.out.print(guessedLetters + "\n");
   
*/

}