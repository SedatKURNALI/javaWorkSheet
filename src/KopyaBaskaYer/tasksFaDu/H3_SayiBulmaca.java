package KopyaBaskaYer.tasksFaDu;

import java.util.Random;
import java.util.Scanner;

public class H3_SayiBulmaca {
    public static void main(String[] args) {

        // Bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde "sayiyi buyut" veya "sayiyi kucult" diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde buldugunu kullaniciya yazdirin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100); // 100 den kucuk rastgele bir sayi

        Scanner scan = new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while (sayi!=tahmin) {
            System.out.print("Lutfen bir sayi giriniz : ");
            tahmin = scan.nextInt();

            if(tahmin>sayi) {
                System.out.println("Daha kucuk bir sayi girmelisiniz");
            } else if (tahmin<sayi) {
                System.out.println("Daha buyuk bir sayi girmelisiniz");

            }
            sayac++;

        }

        System.out.println("Tuttugum sayiyi "+sayac + " tahminde buldunuz");


    }
}
