package KopyaBaskaYer.JavaProjects.P04_okulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01;

public class Ogrenci extends Kisi {

    private String ogrcNo;
    private String sinif;

    public Ogrenci() {

    }

    public Ogrenci(String ogrcNo, String sinif) {
        this.ogrcNo = ogrcNo;
        this.sinif = sinif;
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrcNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrcNo = ogrcNo;
        this.sinif = sinif;
    }

    public String getOgrcNo() {
        return ogrcNo;
    }

    public void setOgrcNo(String ogrcNo) {
        this.ogrcNo = ogrcNo;
    }

    public String getSinif() {
        return sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrcNo='" + ogrcNo + '\'' +
                ", sınıf='" + sinif + '\'' +
                "} " + super.toString();
    }

// @Override
   // public String toString() {
   //     return "Ogrenci{" +
   //             "ogrcNo='" + ogrcNo + '\'' +
   //             ", sınıf='" + sınıf + '\'' +
   //             '}';
   // }
}
