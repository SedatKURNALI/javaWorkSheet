package KopyaBaskaYer._07_ForLoopFaDu;

public class Q16_ABBCCC_Ucgen {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

        char harf1='A';
        char harf2='F';

        for (char i = harf1; i <=harf2 ; i++) {
            for (char j = harf1; j <=i ; j++) {
                System.out.print(i);

            }
            System.out.println("");

        }


    }

}
