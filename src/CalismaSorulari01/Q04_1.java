package CalismaSorulari01;

public class Q04_1 {
    /*
        4----1 den 10 a kadar her sat?rda bir art?rarak a?a??daki ?ekli olu?turan Java kodunu yaz?n?z.
         Beklenen ç?kt?:
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
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
