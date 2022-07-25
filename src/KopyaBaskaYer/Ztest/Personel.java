package KopyaBaskaYer.Ztest;

public class Personel {

    String isim;
    String mezuniyet;
    String perId;
    double puan;
    int yas;

    public Personel(String isim, String mezuniyet, String perId, double puan, int yas) {
        this.isim = isim;
        this.mezuniyet = mezuniyet;
        this.perId = perId;
        this.puan = puan;
        this.yas = yas;
    }

    public Personel(String isim, double puan, int yas) {
        this.isim = isim;
        this.puan = puan;
        this.yas = yas;
    }
}
