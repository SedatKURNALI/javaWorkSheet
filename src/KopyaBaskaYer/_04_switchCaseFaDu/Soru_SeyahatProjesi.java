package KopyaBaskaYer._04_switchCaseFaDu;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.


      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        int frankfurtKm = 60;
        int kolnKm = 80;
        int kmBirimFiyat = 5;
        double bakiye = 750;
        double biletFiyat = 0;
        int kontrol = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("(Frankfurt : 60 KM ---  Koln : 80 KM --- " +
                "\n(20 KM basina 5 euro bilet parasi alinmaktadir..)");
        System.out.println("Nereye yolculuk etmek istiyorsunuz=");
        String todo = scan.next();
        String rota = todo.toUpperCase();

        switch (rota) {
            case "FRANKFURT":
                System.out.println("Rota : FRANKFURT");
                biletFiyat = frankfurtKm / 20 * kmBirimFiyat;
                System.out.println("Bilet Ucreti : " + biletFiyat + " EUR");
                kontrol = 1;
                break;
            case "KOLN":
                System.out.println("Rota : KOLN");
                biletFiyat = kolnKm / 20 * kmBirimFiyat;
                System.out.println("Bilet Ucreti : " + biletFiyat + " EUR");
                kontrol = 1;
                break;
            default:
                biletFiyat = 0;
                System.out.println("Lutfen Frankfurt veya Koln den birini yaziniz");
                kontrol = 0;
                break;
        }

        if (kontrol == 1) {
            System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir)");
            int biletSayi = scan.nextInt();


            switch (biletSayi) {

                case 0:

                case 1:
                    biletFiyat = biletFiyat;
                    break;
                case 2:
                    biletFiyat *= 2;
                    break;
                default:
                    System.out.println("Lutfen en fazla 2 kisi belirtebilirsiniz");
                    break;


            }


            System.out.println("Mevcut Bakiyeniz : " + bakiye);
            bakiye = bakiye - biletFiyat;
            System.out.println("Olusan Toplam Tutar : " + biletFiyat);
            System.out.println("Bilet Isleminden sonra Bakiyeniz : " + bakiye);
        } else {

        }
    }
}
