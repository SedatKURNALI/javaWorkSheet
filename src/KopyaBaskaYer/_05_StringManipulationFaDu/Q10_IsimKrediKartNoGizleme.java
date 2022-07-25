package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q10_IsimKrediKartNoGizleme {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

       /* Scanner scan = new Scanner(System.in);
        System.out.print("Isim giriniz : ");
        String isim = scan.next();
        System.out.print("Soyisim giriniz : ");
        String soyisim = scan.next();
        System.out.print("Kredi Karti No Giriniz : ");
        String kKno = scan.nextLine();

        String yeniIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");
        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");

        String yeniKKno = "**** **** **** " + kKno.substring(kKno.length() - 4);

        System.out.println("Isim-Soyisim : " + yeniIsim + " " + yeniSoyisim);

        if (kKno.length() == 16) {
            System.out.println("kart no : " + yeniKKno);
        } else {
            System.out.println("Gecersiz Kredi Karti Numarasi");
        }

        */

        Scanner scan = new Scanner (System.in);
        System.out.print("İsminizi Soyisminizi ve Kredi Kartinizi aralarinda bosluk birakarak giriniz : ");
        String dizi = scan.nextLine();


        // Bastaki ve sondki bosluklari silelim
        dizi=dizi.trim();

        // Bosluklara gore 3 bilgiyi ayiracagiz


        int ilkBosluk = dizi.indexOf(" ");
        int ikinciBosluk = dizi.indexOf(" ", ilkBosluk+1);

        // isim :
        String isim = dizi.toUpperCase().charAt(0) + dizi.substring(1,ilkBosluk).replaceAll("\\w","*");
        System.out.print(isim+ " ");

        // soyisim
        String soyisim = dizi.toUpperCase().charAt(ilkBosluk+1) + dizi.substring(ilkBosluk+2,ikinciBosluk).replaceAll("\\w","*");
        System.out.println(soyisim+ " ");

        // kredikarti
        String kkNo = dizi.substring(ikinciBosluk+1,dizi.length());


        if(kkNo.length()!=16) {
            System.out.println("Geçersiz kart numarasi");
        } else {
            kkNo = kkNo.substring(0,12).replaceAll("\\d","*")+kkNo.substring(12,kkNo.length());
        }
        System.out.println(kkNo);







    }
}
