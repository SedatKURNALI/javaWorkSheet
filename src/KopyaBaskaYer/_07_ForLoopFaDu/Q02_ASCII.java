package KopyaBaskaYer._07_ForLoopFaDu;

public class Q02_ASCII {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
        int sira = 0;
        for (char i = 0; i <=255 ; i++) {
            System.out.println(sira+":"+i);
            sira++;
        }


    }
}


