package KopyaBaskaYer.Enum_FaDu.Ex03;

import java.util.ArrayList;

public class Ex03Main {

    /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 2 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.

 */
    public static void main(String[] args) {
        Kitap ktp1 = new Kitap();
        ktp1.name="Leyla ile Mecnun";
       // ktp1.kitapKategori="roman";
        ktp1.kategori=KitapKategori.ROMAN;

        Kitap ktp2 = new Kitap();
        ktp2.name="Koy maydeni";
        // ktp2.kitapKategori="Roman";
        ktp2.kategori=KitapKategori.ROMAN;

        ArrayList<Kitap> kutuphane = new ArrayList<>();
        kutuphane.add(ktp1);
        kutuphane.add(ktp2);

        for (Kitap k: kutuphane
             ) {
            if(k.kategori==KitapKategori.ROMAN) {
                System.out.println(k.name);
            }
        }


    }




}
