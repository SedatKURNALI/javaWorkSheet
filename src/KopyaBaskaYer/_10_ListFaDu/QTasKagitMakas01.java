package KopyaBaskaYer._10_ListFaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QTasKagitMakas01 {
 static Scanner scan = new Scanner (System.in);
 static int pcScore = 0;
 static int userScore = 0;
 static List<String> bosTasKagitMakas = new ArrayList<>();




    public static void main(String[] args) {

        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */
        bosTasKagitMakas.add("");
        bosTasKagitMakas.add("Tas");
        bosTasKagitMakas.add("Kagit");
        bosTasKagitMakas.add("Makas");

        System.out.println("*****TAS-KAGIT-MAKAS****\nOYUNUNA HOS GELDINIZ");
        System.out.println("Oyuncan Cikmak icin 0 a basiniz");
        secimTasKagitMakas();


    }

    private static void secimTasKagitMakas() {
        int userChoice = 10;
        int pcChoice = 10;

        while (userChoice!=0) {
            System.out.print("Tas: 1, Kagit: 2, Makas: 3 --> ");
            userChoice = scan.nextInt();
            int r = (int) (Math.random() * (3 - 1)) + 1;
            pcChoice = r;

            if(userChoice>3 || userChoice<0) {
                System.out.println("Hatali Secim Yaptiniz !");
                secimTasKagitMakas();
                break;
            } else if (userChoice==0) {
                System.out.println("Bu eglenceli oyun icin tesekkur ederiz");
                scoreYaz();
            } else {

                if(userChoice==1 && pcChoice==3 ||
                        userChoice==2 && pcChoice==1 ||
                        userChoice==3 && pcChoice==2) {
                    System.out.println("Siz : "+bosTasKagitMakas.get(userChoice) +
                            "\nBilgisayar : "+bosTasKagitMakas.get(pcChoice) + "\nSonuc : Siz Kazandiniz");

                    userScore++;
                } else if (userChoice==1 && pcChoice==2 ||
                        userChoice==2 && pcChoice==3 ||
                        userChoice==3 && pcChoice==1) {
                    System.out.println("Siz : "+bosTasKagitMakas.get(userChoice) +
                            "\nBilgisayar : "+bosTasKagitMakas.get(pcChoice) + "\nSonuc : Bilgisayar Kazandi");

                    pcScore++;
                } else {
                    System.out.println("Siz : "+bosTasKagitMakas.get(userChoice) +
                            "\nBilgisayar : "+bosTasKagitMakas.get(pcChoice) + "\nSonuc : Beraber");

                }

            }

            oyunaDevamMi();


        }
    } // secimTasKagitMakas sonu

    private static void oyunaDevamMi() {

        System.out.print("Devam:1, Skor Tablosu:2 --> ");
        int devamSecim = scan.nextInt();
        if(devamSecim==1) {
            secimTasKagitMakas();
        } else if (devamSecim==2) {
            scoreYaz();
        } else {
            System.out.println("Hatali Secim Yaptiniz!");
            oyunaDevamMi();
        }

    } // oyunaDevamMi sonu

    private static void scoreYaz() {
        System.out.println("OYUN SONUCU PUAN TABLOSU");
        System.out.println("Oyuncu Skoru : "+userScore);
        System.out.println("Bilgisayar Skoru : "+pcScore);


    } // scoreYaz sonu
}



