package Section7;

import java.util.Scanner;

public class GasMileCalc {

    public static void main(String[] args){

        double lastTrip = 0;

        Scanner miles = new Scanner(System.in);

        if(lastTrip!=0){
            //double lastTrip = totalGasCost;
            System.out.println("Previous entry: " + lastTrip);
        }
        else{

            System.out.println("Please enter the current cost of gas:");
            System.out.print("$");
            double fuel = miles.nextDouble();

            System.out.println("Please enter the number of miles to go:");
            int thisTripMiles = miles.nextInt();
            //System.out.println("You've entered " + tripMiles);

            double totalGasCost = thisTripMiles * fuel;
            System.out.println("The total cost of gas this trip is $" + totalGasCost);

            lastTrip = totalGasCost;
        }

        


    }
}
