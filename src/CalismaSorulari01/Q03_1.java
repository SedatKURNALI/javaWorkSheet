package CalismaSorulari01;

public class Q03_1 {
    /*
         3----belirlenen say?n?n 1 den 10 a kadar çarp?m sonuçlar?n? yapan Java program?n? yaz?n?z.
            Örnek Sonuç:
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
            5 x 7 = 35
            5 x 8 = 40
            5 x 9 = 45
            5 x 10 = 50
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
