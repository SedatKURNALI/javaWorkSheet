package _10_ListFaDu;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi_NormalCozum {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {

        List<Integer> asalSayilar = new ArrayList<>();
        asalSayilar.add(2); // 2 en kucuk asal sayi oldugu icin manuel ekliyoruz.
        int control = 0;

        // 3 den 100 e kadar her sayisi kendinden kucuk sayilar icin modulus aliyoruz
        for (int i = 3; i < 100; ) {
            control = 0;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    control = 1;      // kendinden kucuk herhangi bir sayiyia bolunebiliyorsa break ediyoruz
                    i++;              // break ettigimiz icin de i yi 1 arttiriyoruz, loop da i yok
                    break;
                }

            } // icdeki dongunun sonu

            if (control == 0) {      // eger tam bolunme yoksa bu sayi asaldir ve listeye at
                asalSayilar.add(i);  // i yi de 1 arttiriyoruz
                i++;
            }

        } // ilk dongunun sonu

        System.out.println(asalSayilar);


    } // main method sonu
}
