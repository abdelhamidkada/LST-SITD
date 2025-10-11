package TD_1;

import java.util.Scanner;

public class EX_8 {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner un nombre entier: ");
        int  N = clavier.nextInt();

        long fact = 1;

        for(int i=1; i<=N; i++){
            fact *= i;
        }

        System.out.printf("Le factoriel de %d est: %d\n", N, fact);
        int nbChiffres = String.valueOf(fact).length();
        System.out.println("Le factoriel contient " + nbChiffres + " chiffres.");

        clavier.close();
    }
}
