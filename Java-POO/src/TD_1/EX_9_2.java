package TD_1;

import java.util.Scanner;

public class EX_9_2 {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        //Saisie des donnees
        System.out.print("Donner la hauteur du triangle: ");
        int h = clavier.nextInt();
        //Traitement
        for(int i=h; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        clavier.close();
    }
}
