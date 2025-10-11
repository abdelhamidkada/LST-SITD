package TD_1;

//Calcule d'aire du rectangle du circle et du triangle
import java.util.Scanner;
import java.lang.Math;

public class EX_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Calcul d'aire et de périmètre ===");
        System.out.println("Choisissez une figure : ");
        System.out.println("R - Rectangle");
        System.out.println("C - Cercle");
        System.out.println("T - Triangle");

        char choix = in.next().charAt(0);

        if (choix == 'R' || choix == 'r') {
            // Rectangle
            System.out.print("Donner la longueur du rectangle : ");
            double L = in.nextDouble();
            System.out.print("Donner la largeur du rectangle : ");
            double l = in.nextDouble();

            double P = 2 * (L + l);
            double A = L * l;

            System.out.printf("Périmètre du rectangle : %.2f\n", P);
            System.out.printf("Aire du rectangle : %.2f\n", A);

        } else if (choix == 'C' || choix == 'c') {
            // Cercle
            System.out.print("Donner le rayon du cercle : ");
            double R = in.nextDouble();

            double A = Math.PI * Math.pow(R, 2);
            double P = 2 * Math.PI * R;

            System.out.printf("Périmètre (circonférence) du cercle : %.2f\n", P);
            System.out.printf("Aire du cercle : %.2f\n", A);

        } else if (choix == 'T' || choix == 't') {
            // Triangle
            System.out.print("Donner la base du triangle : ");
            double B = in.nextDouble();
            System.out.print("Donner la hauteur du triangle : ");
            double H = in.nextDouble();

            double A = 0.5 * B * H;

            System.out.printf("Aire du triangle : %.2f\n", A);
            System.out.println("(Le périmètre ne peut pas être calculé sans les 3 côtés)");
        } else {
            System.out.println("Choix invalide !");
        }

        in.close();
    }
}