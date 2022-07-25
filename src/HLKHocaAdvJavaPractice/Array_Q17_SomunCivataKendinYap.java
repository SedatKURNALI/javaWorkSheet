package HLKHocaAdvJavaPractice;

import java.util.Arrays;

public class Array_Q17_SomunCivataKendinYap {
    /* TASK :
 Elinizde bir miktar farkl? boylarda somun ve bu somunlara uyacak civatalar olsun.
 Civatalar? somunlara e?lemek i?in nas?l bir algoritma yazars?n?z.

  */
    public static void main(String[] args) {
        String somunlar[] = {"a-2", "d-15", "f-3", "b-8", "e-9", "c-13"};
        String civatalar[] = {"c-13", "f-4", "a-1", "d-6", "e-17", "b-4", "g-3"};

        String[] somunlarName = new String[somunlar.length];
        int[] somunlarSayi = new int[somunlar.length];

        String[] civatalarName = new String[civatalar.length];
        int[] civatalarSayi = new int[civatalar.length];

        for (int i = 0; i < somunlar.length; i++) {
            somunlarName[i] = somunlar[i].replaceAll("\\d", "").replaceAll("\\W", "");
            somunlarSayi[i] = Integer.parseInt(somunlar[i].replaceAll("\\D", ""));
        }
        for (int i = 0; i < civatalar.length; i++) {
            civatalarName[i] = civatalar[i].replaceAll("\\d", "").replaceAll("\\W", "");
            civatalarSayi[i] = Integer.parseInt(civatalar[i].replaceAll("\\D", ""));
        }
        System.out.println(Arrays.toString(somunlarName));
        System.out.println(Arrays.toString(somunlarSayi));

        System.out.println(Arrays.toString(civatalarName));
        System.out.println(Arrays.toString(civatalarSayi));
    }
}
