package KopyaBaskaYer._04_switchCaseFaDu;

import java.util.Scanner;

public class Q02_BasamaklarText {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
        Scanner scan = new Scanner (System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagi = (sayi%100)%10;
        int onlarBasamagi = (sayi/10)%10;
        int yuzlerBasamagi = (sayi/100);

        System.out.println("Yuzler Basamagi : "+yuzlerBasamagi);
        System.out.println("Onlar Basamagi :" +onlarBasamagi);
        System.out.println("Birler Basamagi :" +birlerBasamagi);

        // BINLER BASAMAGI OKUNUSLAR
        switch (yuzlerBasamagi) {
            case 1:
                System.out.print("Yüz");
                break;
            case 2:
                System.out.print("İki Yüz");
                break;
            case 3:
                System.out.print("Üç Yüz");
                break;
            case 4:
                System.out.print("Dört Yüz");
                break;
            case 5:
                System.out.print("Beş Yüz");
                break;
            case 6:
                System.out.print("Altı Yüz");
                break;
            case 7:
                System.out.print("Yedi Yüz");
                break;
            case 8:
                System.out.print("Sekiz Yüz");
                break;
            case 9:
                System.out.print("Dokuz Yüz");
                break;
            default:
                System.out.print("Hatalı Yüz");

        }
        System.out.print("-");

        // YUZLER BASAMAGI OKUNUSLAR
        switch (onlarBasamagi) {
            case 1:
                System.out.println("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
            default:
                System.out.print("Hatalı Veri");

        }
        System.out.print("-");

        // BIRLER BASAMAGI OKUNUSLAR
        switch (birlerBasamagi) {
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("İki");
                break;
            case 3:
                System.out.print("Üç");
                break;
            case 4:
                System.out.print("Dört");
                break;
            case 5:
                System.out.print("Beş");
                break;
            case 6:
                System.out.print("Altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
            default:
                System.out.print("Hatalı Veri");

        }




    }
}
