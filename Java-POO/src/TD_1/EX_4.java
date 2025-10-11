package TD_1;

import java.util.Scanner;
public class EX_4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Entrer l'année: ");
        int A = in.nextInt();

        if((A%4 == 0 && A%4 != 0)||(A%400 == 0)){
            System.out.printf("L'année %d est bissextile", A);
        }else{
            System.out.printf("L'année %d n'est pas bissextile", A);
        }
    }
}
