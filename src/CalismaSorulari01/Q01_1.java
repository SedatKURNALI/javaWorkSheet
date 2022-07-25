package CalismaSorulari01;

public class Q01_1 {
    /*
            1---Sayýn?n Say? de?erlerinin toplamas?n? yapan Java kodu yaz?n?z.
            Test Data
            34
            Beklenen Ç?kt?
            7
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
