package _10_ListFaDu;

import java.util.ArrayList;
import java.util.List;

public class Q10_ArdisikArrayElemanToplami {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7, 12, 10, 4, 7, 21};

        List<Integer> sayilar = new ArrayList<>();


        int i = 0;
        int j = 0;
        int k = 0;  // toplanan sayi adedi
        int satirToplam = 0;

        for (i = 1; k < arr.length; i++) {
            for (j = 0; j < i; j++) {
                satirToplam += arr[k];

                if (j == (i - 1)) {   // bu if kismi tamamen = den once + yazilmamasi icin
                    System.out.print(arr[k]);
                } else {
                    System.out.print(arr[k] + "+");
                }
                k++;

            }
            System.out.println("=" + satirToplam);
            sayilar.add(satirToplam);
            satirToplam = 0;
        }

        System.out.println(sayilar);

    }


}



