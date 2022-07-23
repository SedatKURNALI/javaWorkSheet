package CalismaSorulari01;

public class Q02_1 {
    /*
            2---1 den 20 ye kadar tam say?lar? alt alta yazan Java kodu yaz?n?z.
            Hint: For döngüsü kullan?n?z.
            Beklenen Ç?kt?:
            1
            2
            .
            .
            .
            19
            20
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
