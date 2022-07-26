package KopyaBaskaYer._10_ListFaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q08_IsimleriYerDegistirme {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        List<String> isimler = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("10 tane isim giriniz");
        int i=0;

        // 10 tane ismi kullanicidan alalim
        while (i<10) {
            System.out.print((i+1)+". ismi giriniz: ");
            isimler.add(scan.nextLine());
            i++;
        }

        // isimleri yazdirip, hangilerinin degistirmek istedigini kullaniciya soralim
        System.out.println("Hangi iki ismin yerini degistirmek istiyorsunuz?");
        for (int j = 0; j < isimler.size() ; j++) {
            System.out.println((j+1+". Isim : "+isimler.get(j)));
        }
        System.out.print("Birinci ismin sira numarasi : ");
        int siraBir = scan.nextInt();
        System.out.print("Ikinci ismin sira numarasi : ");
        int siraIki = scan.nextInt();

        // sira degisikligi yapalim
        String temp = "";
        temp=isimler.get(siraBir-1);
        isimler.set(siraBir-1, isimler.get(siraIki-1));
        isimler.set(siraIki-1,temp);

        // isimleri degistikten sonra yazdiralim
        System.out.println("Yeni Sira: ");
        System.out.print(isimler);




    }

}
