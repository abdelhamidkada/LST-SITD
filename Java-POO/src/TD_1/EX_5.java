package TD_1;

import java.util.Scanner;
public class EX_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("=== Simple calculator ===");
        System.out.print("Choisissez une operatrion (+ - * /): ");
        char op = in.next().charAt(0);
        System.out.print("Entrer le premier nombre: ");
        double A = in.nextInt();
        System.out.print("Entrer le deuxieme nombre: ");
        double B = in.nextInt();

        double resultat;

        switch(op){
            case '+' :
                resultat = A + B;
                System.out.print("Resultat: " + resultat);
                break;
            case '-' :
                resultat = A - B;
                System.out.print("Resultat: " + resultat);
                break;
            case '*' :
                resultat = A * B;
                System.out.print("Resultat: " + resultat);
                break;
            case '/' :
                if(B == 0){
                    System.out.print("Operation invalid, Division par zero interdite!");
                }else {
                    resultat = A / B;
                    System.out.print("Resultat: " + resultat);
                }
                break;
            default:
                System.out.print("Operation invalid!");
        }
    }
}
