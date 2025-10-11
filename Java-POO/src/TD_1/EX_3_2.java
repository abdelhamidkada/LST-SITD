package TD_1;

import java.util.Scanner;
public class EX_3_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Saisie des donnees
        System.out.print("Donner un nombre entier: ");
        int N = in.nextInt();
        //Paire
        if(N % 2 == 0) System.out.printf("Le nombre %d est paire.\n", N);
        else System.out.printf("Le nombre %d est impaire.\n", N);
        //Divisible par 3
        if(N % 3 == 0) System.out.printf("Le nombre %d est divisible par 3.\n", N);
        else System.out.printf("Le nombre %d n'est pas divisible par 3.\n", N);
        //Divisible par 5
        if(N % 5 == 0) System.out.printf("Le nombre %d est divisible par 5.\n", N);
        else System.out.printf("Le nombre %d n'est pas divisible par 5.\n", N);
        //Divisible par 7
        if(N % 7 == 0) System.out.printf("Le nombre %d est divisible par 7.\n", N);
        else System.out.printf("Le nombre %d n'est pas divisible par 7.\n", N);
    }
}
