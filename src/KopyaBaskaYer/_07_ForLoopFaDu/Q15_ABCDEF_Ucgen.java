package KopyaBaskaYer._07_ForLoopFaDu;

public class Q15_ABCDEF_Ucgen {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {

        char harf1='A';
        char harf2='F';

        for (char i = harf1; i <=harf2 ; i++) {
            for (char j = harf1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println("");

        }

    }
}
