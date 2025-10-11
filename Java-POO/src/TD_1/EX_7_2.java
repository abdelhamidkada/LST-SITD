package TD_1;

public class EX_7_2 {
    public static void main(String[] args){
        int i, S = 0;
        for(i=1; i<101; i++) {
            if (i % 2 == 0) {
                S = S + i;
            }
        }
        System.out.println("La somme est : S = " + S);
    }
}
