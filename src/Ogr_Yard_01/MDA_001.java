package Ogr_Yard_01;

import java.util.ArrayList;
import java.util.List;

public class MDA_001 {
    public static void main(String[] args) {
        /*
            iki adet MDA dizide bulunan elemanların ( küme elemanı gibi düşünün )
            kesişim kümesini ve birleşim kümesini ayrı ayrı yazdıran JAVA kodu yazınız.
            input :  String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
                     String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
            output:  Dizilerin Kesişim Kümesi : 2c
                     Dizilerin Birleşim Kümesi : a2c75kr1e8
        */
        String[][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String[][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
        String kesisim = "";
        String birlesim = "";
        List<String> listBirlesim = new ArrayList<>();
        for (String[] arr1 : dizi1) {
            for (String s1 : arr1) {
                if (!listBirlesim.contains(s1)) {
                    listBirlesim.add(s1);
                    birlesim += s1;
                }
            }
        }
        for (String[] arr2 : dizi2) {
            for (String s2 : arr2) {
                if (listBirlesim.contains(s2)) {
                     kesisim+=s2;
                }
            }
        }
        for (String[] arr2 : dizi2) {
            for (String s2 : arr2) {
                if (!listBirlesim.contains(s2)) {
                    listBirlesim.add(s2);
                    birlesim += s2;
                }
            }
        }
        System.out.println("Dizilerin Kesisim Kumesi : " + kesisim);
        System.out.println("Dizilerin Birlesim Kumesi : " + birlesim);
    }
}
