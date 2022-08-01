package Ogr_Yard_01;

import java.util.ArrayList;
import java.util.List;

public class Pascal_02 {
    static List<Integer> numberList = new ArrayList<>();

    public static void main(String[] args) {

        int input = 5;
        for (int i = 0; i <= input; i++) {
            for (int j = input - i; j > 0; j--) {
                System.out.print(" ");
            }
            pascalUcgeniKatsayiHesapla(i);
            for (int j = 0; j < numberList.size(); j++) {
                System.out.print(numberList.get(j) + " ");
            }
            System.out.println();
        }
    }

    private static void pascalUcgeniKatsayiHesapla(int n) {
        //  C (n,r) = n! / (n?r)! . r!  ?eklinde hesaplan?r.
        numberList.clear();
        for (int r = 0; r <= n; r++) {
            numberList.add(faktor(n) / (faktor(n - r) * faktor(r)));
        }
    }

    public static int faktor(int i) {
        int f = 1;
        for (int j = 1; j <= i; j++) {
            f *= j;
        }
        if (i < 2) f = 1;
        return f;
    }
}