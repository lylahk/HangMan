package HangFromScratch;

import java.util.Scanner;

class Hanging{

    public static void main(String[] args){

        String wordList[]={"rock","paper","scissors","lizard","Spock"};

        int randomWordInt = (int) (Math.random() * wordList.length);
        String pickedWord = wordList[randomWordInt];
        System.out.println(wordList[randomWordInt] + " : " + pickedWord);
//        System.out.println(randomWordInt);
        System.out.println("A word is now selected.");
    //Word is now selected

        char letterList[] = pickedWord.toCharArray();
    //Word is now set into an array
    
        for (int i = 0; i <= letterList.length-1; i++){
            System.out.print("*");
        }
        System.out.println("\nWhat letter is your guess?");

        Scanner in = new Scanner(System.in);
      
        char guess = in.next().charAt(0);

        System.out.println("You have guessed "+guess);

        for (int i = 0; i <= letterList.length-1; i++){
                    //System.out.println(i);
            if(letterList[i]==(guess)){
                    System.out.print(letterList[i]);
            }
            else{
             System.out.print("*");
            }
            
            
        }
            
        System.out.print("\n");
    


    }
}