package KopyaBaskaYer._11_dateTimeFaDu.HaftaninSorusu_objectli;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici> kisiler = new ArrayList<>(); // bos list create edildi. method bu listete element atayacak


    public List<Kullanici> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz : ");
        String isim = scan.nextLine();

        Kullanici k1 = new Kullanici(isim, LocalDateTime.now()); // kullanici class indan parametreli const
        // obje create edildi.

        kisiler.add(k1); // Kullanici class p.li const ile create edilen obje kisiler listesine eklendi

        return kisiler;
    }


    public void sansliKullanici(List<Kullanici> kisiler) {

        for (Kullanici each : kisiler
        ) {
            if (each.kayitZamani.getSecond() < 10) {
                System.out.println("Sansli kisiniz " + each.name + " kazandiniz");
            } else {
                System.out.println("Malesef " + each.name + " sansli kisi degilsiniz");
            }
        }

    }



    public void listele(List<Kullanici> kullanicilar) { // kayitAl methodundan gelen kisiler listini donguye sokuyor
        for (Kullanici each : kullanicilar
             ) {
            System.out.println("Adi : "+each.name+"kayit zamani : "+each.kayitZamani); // kisiler list deki her
            // kullanicinin ad ve kayit zamanini yazdiri
        }
    }


}
