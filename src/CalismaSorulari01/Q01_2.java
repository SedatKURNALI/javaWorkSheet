package CalismaSorulari01;

public class Q01_2 {
    /*
            1---Say?n?n Say? de?erlerinin toplamas?n? yapan Java kodu yaz?n?z.
            Test Data
            34
            Beklenen Ç?kt?
            7
    */
    public static void main(String[] args) {
        int sayi = 3145;
        int temp = sayi;
        int sonuc = 0;
        for(int i=1;i<=(""+sayi).length();i++){
            sonuc += temp % 10;
            temp /= 10;
        }
        System.out.println("sonuc = " + sonuc);
    }
}