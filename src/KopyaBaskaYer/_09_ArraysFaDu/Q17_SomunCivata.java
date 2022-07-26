package KopyaBaskaYer._09_ArraysFaDu;

import java.util.Arrays;

public class Q17_SomunCivata {
  /* TASK :
  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
  Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

   */

    public static void main(String[] args) {

        String somunlar[] = {"a-2", "d-15", "f-3", "b-8", "e-9", "c-13"};
        String civatalar[] = {"c-13", "f-4", "a-1", "d-6", "e-17", "b-4", "g-3"};

        somunCivataEslestir(somunlar, civatalar);

    }

    private static void somunCivataEslestir(String[] somunlar, String[] civatalar) {
        // somunlari isim ve adetlere gore ayiralim

        String somunIsim[] = new String[somunlar.length];
        String somunAdet[] = new String[somunlar.length];

        int somunMin[] = new int[somunlar.length];
        int civataMin[] = new int[civatalar.length];

        for (int i = 0; i < somunlar.length; i++) {

            somunIsim[i] = somunlar[i].substring(0, 1);
            somunAdet[i] = somunlar[i].substring(2);

        }
        System.out.println("Somunlar: ");
        System.out.println(Arrays.toString(somunIsim));
        System.out.println(Arrays.toString(somunAdet));


        // Civatalari isim ve adetlere gore ayiralim

        String civataIsim[] = new String[civatalar.length];
        String civataAdet[] = new String[civatalar.length];

        for (int i = 0; i < civatalar.length; i++) {

            civataIsim[i] = civatalar[i].substring(0, 1);
            civataAdet[i] = civatalar[i].substring(2);

        }
        System.out.println("Civatalar: ");
        System.out.println(Arrays.toString(civataIsim));
        System.out.println(Arrays.toString(civataAdet));

        // burada aynı grup civata ve somunlardan en cok elemani olani esas alip
        // varsa aynı gruptan en kucuk olanlari bulalim, yoksa 0 yazdiralim

        if (somunlar.length>=civatalar.length) {

            for (int i = 0; i < somunIsim.length; i++) {
                for (int j = 0; j < civataIsim.length; j++) {

                    if(somunIsim[i].equals(civataIsim[j])) {
                        if(Integer.valueOf(somunAdet[i]) < Integer.valueOf(civataAdet[j])) {
                            somunMin[i] = Integer.valueOf(somunAdet[i]);
                        } else {
                            somunMin[i] = Integer.valueOf(civataAdet[j]);
                        }
                        break;
                    } else {
                        somunMin[i]=0;
                    }
                }

            }
           // System.out.println("Somunlara gore minumum : \n"+Arrays.toString(somunIsim));
           //  System.out.println(Arrays.toString(somunMin));
        } else {


            for (int i = 0; i < civataIsim.length; i++) {
                for (int j = 0; j < somunIsim.length; j++) {

                    if(civataIsim[i].equals(somunIsim[j])) {
                        if(Integer.valueOf(civataAdet[i]) < Integer.valueOf(somunAdet[j])) {
                            civataMin[i] = Integer.valueOf(civataAdet[i]);
                        } else {
                            civataMin[i] = Integer.valueOf(somunAdet[j]);
                        }
                        break;
                    } else {
                        civataMin[i]=0;
                    }
                }

            }
            // System.out.println("Civatalara gore Minumum : \n"+Arrays.toString(civataIsim));
            // System.out.println(Arrays.toString(civataMin));

        }


        System.out.println("*********SONUC*********");
        if(somunlar.length> civatalar.length) {
            for (int i = 0; i < somunlar.length; i++) {

                System.out.println(somunIsim[i]+" nolu gruptan "+somunMin[i]+ "adet eslesir");

            }
        } else {
            for (int i = 0; i < civatalar.length; i++) {

                System.out.println(civataIsim[i]+" nolu gruptan "+civataMin[i]+ " adet eslesir");

            }
        }

    }

}
