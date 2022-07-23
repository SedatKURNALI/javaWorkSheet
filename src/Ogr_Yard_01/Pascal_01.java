package Ogr_Yard_01;

public class Pascal_01 {
    public static void main(String[] args) {
        int satir = 5;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = satir - i; k >= 0; k--) {
                    if (j == 0) System.out.print(" ");
                }
                System.out.print(fact(i) / fact(j) / fact(i - j) + " ");
            }
            System.out.println("");
        }
    }

    public static int fact(int x) {
        if (x == 0) return 1;
        if (x == 1) return 1;
        else return x * fact(x - 1);
    }
}
