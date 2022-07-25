package KopyaBaskaYer.tasksFaDu;

import java.util.Random;
import java.util.Scanner;

public class H1_sayiBulmaca {
    public static void main(String[] args) {

        // Bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde "sayiyi buyut" veya "sayiyi kucult" diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde buldugunu kullaniciya yazdirin

        Random rnd=new Random();
        int tutulanSayi=rnd.nextInt(100);


        Scanner scan = new Scanner(System.in);
        int adet = 0;
        int girilenSayi = 0;
        System.out.println("Lutfen bir sayi giriniz :");

        while (girilenSayi!=tutulanSayi) {

            girilenSayi = scan.nextInt();

            if(girilenSayi>tutulanSayi) {
                System.out.println("Sayiyi kucultunuz");
            } else {
                System.out.println("Sayiyi buyutunuz");
            }
            adet++;
        }

        System.out.println("Toplam "+adet+" tahminde tutulan sayiyi buldunuz");
    }
}
