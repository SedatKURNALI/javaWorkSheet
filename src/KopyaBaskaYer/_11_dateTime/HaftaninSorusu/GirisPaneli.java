package KopyaBaskaYer._11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {

    public static void panel() {


        Scanner scan = new Scanner(System.in);


        Kayit yeniKayit = new Kayit();//obj ile method cal yapılacak

        List<Kullanici> kisi = new ArrayList<>();
        boolean cikilsinMi = true;
        while (cikilsinMi) {

            System.out.println("lutfen \n1:Kayıt al\n2:sanslı kiş bul\n3:kişileri listele\n4cıkıs");
            System.out.print("isleminizi seciniz : ");
            int islem = scan.nextInt();

            switch (islem) {

                case 1:
                    kisi = yeniKayit.kayitAl();//kisi list'i degerini yeniKayıt obj ile kayıtAl() method call dan lacak
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi = false;
                    break;
                default:
                    System.out.println("hatalı veri girdiniz");
                    break;
            }

        }


    }
}
