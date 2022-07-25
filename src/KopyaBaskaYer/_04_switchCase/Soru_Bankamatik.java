package KopyaBaskaYer._04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4\nyapacagınız işlemi seciniz : ");
        int islem = scan.nextInt();
        int bakiye=1000;
        switch (islem) {
            case 1:
                System.out.println("mevcut bakıyeniz : "+bakiye);
                break;
            case 2:
                System.out.print("cekecegınız miktarı giriniz : ");
                int cekilenMiktar = scan.nextInt();
                if(cekilenMiktar>bakiye){
                    System.out.println("agam niddin olmayan parayı mi cekicen  :-) ");
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("bakıyenizin güncel hali : "+bakiye);
                }
                break;
            case 3:
                System.out.print("yatıracagınız miktarı giriniz : ");
                int yatirilanMiktar = scan.nextInt();
                bakiye+=yatirilanMiktar;
                System.out.println("bakıyenizin güncel hali : "+bakiye);
                break;
            case 4:
                System.out.println("cıkısınız yapılmıstır yine bekleriz :-)");
                break;

        }

    }
}

