package _09_ArraysFaDu;

import java.util.Arrays;

public class Q14_StringiTersCevirHarfDegistir {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String str = "Congratulations";

        // Array kullanarak ters yazdiralim
        String arr[] = str.split("");
        String arrTers[] = new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            if(arr[i].equalsIgnoreCase("a") ||
                    arr[i].equalsIgnoreCase("o") ||
                    arr[i].equalsIgnoreCase("u")) {
                arrTers[i] = "i";
            }
            arrTers[arr.length-1-i]=arr[i];



        }
        System.out.println("Input : "+str);
        System.out.println("Input un Array hali : "+Arrays.toString(arr));
        System.out.println("Arry in terse Cevrilmis Hali ve Harflerin degismis hali : "+ Arrays.toString(arrTers));

    }
}


