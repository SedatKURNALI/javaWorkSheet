package CalismaSorulari01;

public class Q06_1 {
    /*

     6----     Kullan?c?dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldu?unu,
           de?ilse sessiz harf oldu?unu ekrana yazd?rs?n. Girdi?i de?er harf de?ilse yada
            1 karakterden fazla ise hata mesaj? g﷿stersin. (Test girilen harfi b﷿y﷿k yada k﷿﷿﷿kl﷿?﷿ne duyarl?d?r.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen ﷿?kt?:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen ﷿?kt?:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen ﷿?kt?:
    Yanlis karakter girdiniz!
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
