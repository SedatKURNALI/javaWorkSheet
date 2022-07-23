package CalismaSorulari01;

public class Q05_1 {
    /*
            5-----A?a??daki elmas deseni görüntüsünü çizen java kodunu yaz?n?z.
            Test Data:
            Yar?m elmas uzunlu?u : 7
            Beklenen Ç?kt?:
                  *
                 ***
                *****
               *******
              *********
             ***********
            *************
             ***********
              *********
               *******
                *****
                 ***
                  *
    */
    public static void main(String[] args) {
        int sayi = 34;
        int temp = sayi;
        int sonuc = 0;
        while (temp != 0) {
            sonuc += temp % 10;
            temp /= 10;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
