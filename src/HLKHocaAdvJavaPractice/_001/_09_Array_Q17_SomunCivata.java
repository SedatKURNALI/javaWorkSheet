package HLKHocaAdvJavaPractice._001;

import java.util.Arrays;

public class _09_Array_Q17_SomunCivata {
    /* TASK :
 Elinizde bir miktar farkl? boylarda somun ve bu somunlara uyacak civatalar olsun.
 Civatalar? somunlara e?lemek i?in nas?l bir algoritma yazars?n?z.

  */
    public static void main(String[] args) {
        String somunlar[] = {"a-2", "d-15", "z-8", "f-3", "b-8", "e-9", "c-13"};
        String civatalar[] = {"c-13", "f-4", "a-1", "d-6", "e-17", "b-4", "g-3"};
        String[] somunlarNames = new String[somunlar.length];
        String[] civatalarNames = new String[civatalar.length];
        int[] somunlarNumbers = new int[somunlar.length];
        int[] civatalarNumbers = new int[civatalar.length];
        for (int i = 0; i < somunlar.length; i++) {
            somunlarNames[i] = somunlar[i].
                    replaceAll("\\d", "").
                    replaceAll("\\W", "");
            somunlarNumbers[i] = Integer.parseInt(
                    somunlar[i].replaceAll("\\D", ""));
        }
        for (int i = 0; i < civatalar.length; i++) {
            civatalarNames[i] = civatalar[i].
                    replaceAll("\\d", "").
                    replaceAll("\\W", "");
            civatalarNumbers[i] = Integer.parseInt(
                    civatalar[i].replaceAll("\\D", ""));
        }
        System.out.println(Arrays.toString(somunlarNames));
        System.out.println(Arrays.toString(somunlarNumbers));
        // System.out.println();
        System.out.println(Arrays.toString(civatalarNames));
        System.out.println(Arrays.toString(civatalarNumbers));

        for (int i = 0; i < somunlar.length; i++) {
            for (int j = 0; j < civatalar.length; j++) {
                if (somunlarNames[i].equals(civatalarNames[j])) {
                    if (somunlarNumbers[i] > civatalarNumbers[j]) {
                        System.out.println(somunlarNames[i] + " - " + civatalarNumbers[j] + " eslesti");
                    } else {
                        System.out.println(somunlarNames[i] + " - " + somunlarNumbers[i] + " eslesti");
                    }
                }
            }
        }
    }
}
