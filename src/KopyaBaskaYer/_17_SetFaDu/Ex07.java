package _17_SetFaDu;

import java.util.HashSet;
import java.util.Set;

public class Ex07 {

    /*  TASK :
     * main method altinda bir double hashSet olusturunuz.
     *
     * ve bu seti, adi setOlustur ve return tipi hashSet double olan
     *
     * ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
     * kullanarak doldurun.
     *
     * adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
     * edecek ayri bir method olusturarak
     *
     * hashSetin degerlerinin toplamini alacaksiniz.
     */

    public static void main(String[] args) {

        Set<Double> dbHashSet = new HashSet<>();
        dbHashSet = setOlustur(dbHashSet);
        double toplam = toplaminiAl(dbHashSet);
        System.out.println("Toplam : "+toplam);

    }

    private static double toplaminiAl(Set<Double> dbHashSet) {
        double toplam = 0;
        for (Double each : dbHashSet
        ) {
            toplam += each;
        }
        return toplam;
    }

    // HashSet imizi icine degerler alarak olusturalim
    private static Set<Double> setOlustur(Set<Double> dbHashSet) {
        dbHashSet.add(3.23);
        dbHashSet.add(3.10);
        dbHashSet.add(5.12);
        dbHashSet.add(10.10);
        dbHashSet.add(23.12);

        return dbHashSet;
    }


}
