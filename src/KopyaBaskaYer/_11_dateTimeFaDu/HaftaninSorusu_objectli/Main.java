package KopyaBaskaYer._11_dateTimeFaDu.HaftaninSorusu_objectli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);



        Kayit yeniKayit = new Kayit(); // Kayit class indan method call yapabilmek icin obje olusturduk
        List<Kullanici> kisi = new ArrayList<>();

        boolean cikilsinMi = false;

        while(!cikilsinMi) {
            System.out.println("Lutfen \n1: Kayit Al\n2: Sansli Kisi Bul\n3: Kisileri Listele\n4: Cikis");
            System.out.print("Isleminizi seciniz : ");
            int islem = scan.nextInt();
            switch (islem) {
                case 1:
                    kisi = yeniKayit.kayitAl();
                    // kisi List i degerini yeniKayit obj ile kayitAl method call dan
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;

                default:
                    System.out.println("Hatali giris yaptiniz");
                    break;
            }
        }




    }
}
