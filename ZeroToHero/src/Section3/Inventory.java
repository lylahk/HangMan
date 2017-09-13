package Section3;

import java.util.Scanner;

public class Inventory {
    public static void main(String[] args){

        Scanner inventory = new Scanner(System.in);

        System.out.println("Please choose inventory slot.");
        System.out.println("Choose 1 for Sword.");
        System.out.println("Choose 2 for Shield.");
        System.out.println("Choose 3 for Bow.");
        System.out.println("Choose 4 for Axe.");
        System.out.println("Choose 5 for Magic.");

        int item = inventory.nextInt();

        switch (item){

            case 1:{
                System.out.println("You have chosen a Sword.");
                break;
            }
            case 2:{
                System.out.println("You have chosen a Shield.");
                break;
            }
            case 3:{
                System.out.println("You have chosen a Bow.");
                break;
            }
            case 4:{
                System.out.println("You have chosen an Axe.");
                break;
            }
            case 5:{
                System.out.println("You have chosen Magic.");
                break;
            }
        }
    }
}
