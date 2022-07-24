package ElifHoca_JavaPractice.day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     */
    public static void main(String[] args) {
        List<String> dataBaseIsimler = new ArrayList<>();
        dataBaseIsimler.add("Enes");
        dataBaseIsimler.add("Ismail");
        dataBaseIsimler.add("AbdulBaki");
        dataBaseIsimler.add("Emre");
        dataBaseIsimler.add("Melisa");
        dataBaseIsimler.add("Oguz");

        System.out.println("dataBaseIsimler = " + dataBaseIsimler);

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanmak istediginiz user name i giriniz = ");
        String userName = scan.nextLine().trim();

        boolean userNameVarMi = dataBaseIsimler.contains(userName);
        if (userNameVarMi) {
            System.out.println("Kullanici adi zaten alinmistir.");
        } else {
            System.out.println("Kullanici adini kullanabilirsiniz.");
        }
        if (userNameVarMi) {
            int randomSayi = new Random().nextInt(100);
            userName += randomSayi;
        }
        System.out.println("Yeni kullanici adiniz = " + userName);
        dataBaseIsimler.add(userName);
        System.out.println("dataBaseIsimler = " + dataBaseIsimler);
    }
}
