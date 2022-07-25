package _17_SetFaDu;

import java.util.Arrays;
import java.util.HashSet;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanlari set'e convert eden bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        HashSet<Integer> hs1 = new HashSet<>();
        elementEkle(arr, hs1);

    }

    private static void elementEkle(int[] arr, HashSet<Integer> hs1) {
        for (Integer each : arr
        ) {
            hs1.add(each);
        }
        yaz(hs1);
    }

    private static void yaz(HashSet<Integer> hs1) {
        System.out.println(hs1);
    }


}
