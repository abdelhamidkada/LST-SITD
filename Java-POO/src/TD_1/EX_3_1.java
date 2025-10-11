package TD_1;

import java.util.Scanner;
public class EX_3_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Saisie des donnees
        System.out.print("Donner un nombre entier: ");
        int N = in.nextInt();
        //Traitement
        if(N % 2 == 0) System.out.printf("Le nombre %d est paire.", N);
        else System.out.printf("Le nombre %d est impaire.", N);
    }
}