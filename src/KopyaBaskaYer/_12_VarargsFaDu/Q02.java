package KopyaBaskaYer._12_VarargsFaDu;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int num1 = 10;
        int num2 = 6;
        int num3 = 7;
        int num4 = 8;
        int num5 = 9;
        int num6 = 4;
        int num7 = 13;
        int num8 = 17;

        topla(num1,num2,num3,num4,num5,num6,num7,num8);

    }

    public static void topla(int carpilacakSayi, int... toplanacakSayilar) {

        int toplam=0;
        for (int each:toplanacakSayilar
             ) {
            toplam+=each;
        }
        System.out.println("Sonuc : "+(carpilacakSayi*toplam));
    }
}
