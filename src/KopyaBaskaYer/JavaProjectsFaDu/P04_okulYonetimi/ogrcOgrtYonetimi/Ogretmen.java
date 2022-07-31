package KopyaBaskaYer.JavaProjectsFaDu.P04_okulYonetimi.ogrcOgrtYonetimi;

public class Ogretmen extends Kisi {
    // 1- Variables
    private String bolum;
    private String sicil;

    // 2- Constructors
    public Ogretmen () {

    }


    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicil) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicil = sicil;
    }

    // 3- Getter Setter
    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }

// 4- toString

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicil='" + sicil + '\'' +
                '}';
    }
}
