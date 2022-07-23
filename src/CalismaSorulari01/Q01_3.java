package CalismaSorulari01;

public class Q01_3 {
    /*
            1---Say?n?n Say? de?erlerinin toplamas?n? yapan Java kodu yaz?n?z.
            Test Data
            34
            Beklenen Ç?kt?
            7
    */
    public static void main(String[] args) {
        int sayi = 381495;
        String temp = "" + sayi;
        int sonuc = 0;
        for (int i =0 ; i <temp.length(); i++) {
            sonuc+=Integer.parseInt(temp.substring(i,i+1));
        }
        System.out.println("sonuc = " + sonuc);
    }
}