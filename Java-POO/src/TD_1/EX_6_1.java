package TD_1;

import java.util.Scanner;
public class EX_6_1{
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        //Saisie des donnees
        System.out.print("Donner un nombre entier: ");
        int N = clavier.nextInt();
        //Traitement
        int i;
        for(i=0; i<=10; i++){
            System.out.printf("%d * %d = %d\n", i, N, i*N);
        }
        clavier.close();
    }
}