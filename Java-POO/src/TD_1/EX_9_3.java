package TD_1;

import java.util.Scanner;

public class EX_9_3 {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner la hauteur du triangle: ");
        int h = clavier.nextInt();

        for(int i=0; i<h; i++) {
            //espaces
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            //etoiles
            for(int j=0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        clavier.close();
    }
}
