package JavaProjectsFaDu.P04_okulYonetimi.ogrcOgrtYonetimi;

public class Ogrenci extends Kisi {

    // 1- Variables
    private String numara;
    private String sinif;

    // 2- Constructor

    public Ogrenci () {

    }

    public Ogrenci(String numara, String sinif) {
        this.numara = numara;
        this.sinif = sinif;
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    // 3- Getter Setter
    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }




    // toString


    @Override
    public String toString() {
        return "Ogrenci{" +
                "numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
