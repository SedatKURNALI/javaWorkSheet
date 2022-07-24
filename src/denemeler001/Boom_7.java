package denemeler001;

import java.util.ArrayList;
import java.util.List;

public class Boom_7 {
    public static void main(String[] args) {
        /*
        bir diziyi parametre olarak alan  ve dizide 7 rakam?  var ise  "Boom!"
        ifadesini; aksi takdirde  "dizide 7 rakam? yok" ifadesini döndüren bir method olu?turun".
            Örnek ç?kt?:
            [1, 2, 3, 4, 5, 6, 7])? "Boom!"
            [8, 6, 33, 100] ? "dizide 7 rakam? yok"
            [2, 55, 60, 97, 86] ? "Boom!"                                                                                                                                               Çözümlerinizi buradan payla?abilirsiniz.
         */
        int[] x = {0, 1, 2, 3, 4, 5, 6, 9, 8, 9};
        int kontrol = 0;
        int temp = 0;
        int basamak = 0;
        for (int sayi : x) {
            temp = sayi;
            for (int i = 0; i < ("" + sayi).length(); i++) {   // basamak say?s? kadar çal??acak
                basamak = temp % 10;
                temp /= 10;
                if (basamak == 7) kontrol = 1;
            }
        }
        if (kontrol == 1) {
            System.out.println("Boom!");
        } else {
            System.out.println("dizide 7 rakami yok");
        }
    }
}
