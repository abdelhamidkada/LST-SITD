package TD_1;

import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("=== Conversion de temperature ===");
        System.out.print("Donner la temperature en °C: ");
        double T = in.nextDouble();
        System.out.println("Choisissez le type de conversion");
        System.out.println("1 - Celsius a Fahrenheit.");
        System.out.println("2 - Celsius a Kelvin.");

        int C = in.nextInt();

        if(C == 1){
            double F = T * (9.0/5.0) + 32;
            System.out.println("Temperature en Fahrenheit: " + F);
        }else if(C == 2){
            double K = T + 273.15;
            System.out.println("Temperature en Kelvin: " + K);
        }else{
            System.out.println("Choix invalid!");
        }

    }
}
