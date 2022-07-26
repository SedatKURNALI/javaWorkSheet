package KopyaBaskaYer._10_ListFaDu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06_RemoveDubs {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int arr[] =  {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        removeDub(arr);

    }

    private static void removeDub(int[] arr) {
        List<Integer> kalanSayilar = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(!kalanSayilar.contains(arr[i])) {
                kalanSayilar.add(arr[i]);
            }
        }
        System.out.println("Liste Yazidr : "+kalanSayilar);

        // bunlari array e atmak istersek
        int arrSadelesen[] = new int[kalanSayilar.size()];
        for (int i = 0; i < kalanSayilar.size(); i++) {
            arrSadelesen[i]=kalanSayilar.get(i);
        }
        System.out.println("Array i yazdir: "+ Arrays.toString(arrSadelesen));

    }

}
