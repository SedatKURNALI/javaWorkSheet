package KopyaBaskaYer._07_ForLoopFaDu;

public class Q19_DuzUcgen {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 0; j--) {
                if (j>=i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}

