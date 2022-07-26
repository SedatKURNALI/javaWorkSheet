package KopyaBaskaYer._09_ArraysFaDu;

import java.util.Arrays;

public class Q10_StringleriDegistirme {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String str = "GayetBasarılı";
        String arr[] = str.split("");
        System.out.println("String str: "+str);
        System.out.println("Array str: "+Arrays.toString(arr));

        String str2 = "CoookBasarılı";
        System.out.println("String str2 : "+str2);
        String arr2[] = str2.split("");
        System.out.println("Array str2: "+Arrays.toString(arr2));

        // arr yi komple arr2 olarak degistiriyoruz, hem icerik hem de boyut oldugu gibi

        arr = arr2;

        System.out.println("Array str: "+Arrays.toString(arr));
    }

}
