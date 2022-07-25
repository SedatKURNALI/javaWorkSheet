package HLKHocaAdvJavaPractice;

import java.util.Arrays;

public class Array_Q17_SomunCivataKendinYap {
    /* TASK :
        Elinizde bir miktar farkli boylarda somun ve bu somunlara uyacak civatalar olsun.
        Civatalari somunlara eslemek icin nasil bir algoritma yazarsiniz.
        ornegin:
        somunlar = {"a-2", "d-15", "f-3", "b-8", "e-9", "c-13"};
        civatalar = {"c-13", "f-4", "a-1", "d-6", "e-17", "b-4", "g-3"};
        a somunundan 2, a civatasindan 1 tane ise       a 1 eslesir
        b somunundan 8, b civatasindan 4 tane ise       b 4 eslesir
        sadece eslesenler ve eslestigi sayi kadari yazilacak
  */
    public static void main(String[] args) {
        String[] somunlar = {"a-2", "d-15", "f-3", "b-8", "e-9", "c-13"};
        String[] civatalar = {"c-13", "f-4", "a-1", "d-6", "e-17", "b-4", "g-3"};

        String[] somunlarName = new String[somunlar.length];
        int[] somunlarSayi = new int[somunlar.length];

        String[] civatalarName = new String[civatalar.length];
        int[] civatalarSayi = new int[civatalar.length];

        int sayi = 0;

        for (int i = 0; i < somunlar.length; i++) {
            somunlarName[i] = somunlar[i].replaceAll("\\d", "").replaceAll("\\W", "");
            somunlarSayi[i] = Integer.parseInt(somunlar[i].replaceAll("\\D", ""));
        }
        for (int i = 0; i < civatalar.length; i++) {
            civatalarName[i] = civatalar[i].replaceAll("\\d", "").replaceAll("\\W", "");
            civatalarSayi[i] = Integer.parseInt(civatalar[i].replaceAll("\\D", ""));
        }
        for (int i = 0; i < somunlarName.length; i++) {
            for (int j = 0; j < civatalar.length; j++) {
                if (somunlarName[i].equals(civatalarName[j])) {
                    sayi = Math.min(somunlarSayi[i], civatalarSayi[j]);
                    System.out.println(somunlarName[i] + " somun ve civatasindan " + sayi + " tane eslesti");
                }
            }
        }
        System.out.println(Arrays.toString(somunlar));
        System.out.println(Arrays.toString(civatalar));
    }
}
