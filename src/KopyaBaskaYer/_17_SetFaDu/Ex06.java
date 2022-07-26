package KopyaBaskaYer._17_SetFaDu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex06 {
    public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.


        Set<Integer> hsList = new HashSet<>();
        hsList = hssListHazirla(10, 0, 20);
        System.out.println("HashSet : "+hsList);

        hsListiCevir(hsList);

    }

    private static void hsListiCevir(Set<Integer> hsList) {
        List<Integer> list = new ArrayList<>();
        for (Integer each:hsList
             ) {
            list.add(each);
        }
        System.out.println("List : "+list);
    }

    private static Set<Integer> hssListHazirla(int size, int min, int max) {
        Set<Integer> temp = new HashSet<>();

        for (int i = 0; i < size; i++) {
            int gelenSayi=getRandomInt(min, max);
            if(!temp.contains(gelenSayi)){ // gelen sayi daha once listeye eklenenlerden icinde yoksa temp e at
            temp.add(gelenSayi);
            } else {
                i--;  // gelen sayi temp de varsa, dongu bosuna bir artmasin diye i yi 1 azalt
            }
        }
        return temp;
    }

    public static int getRandomInt(int min, int max) {//bu method max ile min arası sayi return eder

        return (int) ((Math.random() * (max+1 - min )+ min));
    }
}
