package JavaProjectsFaDu.P11_depoYonetimiTur;

import java.util.HashMap;
import java.util.Map;

public class Urunler {

    // 1- Variables ve Listler

    private static int idCounter = 1000;
    private static int urunId;
    private String urunAdi;
    private String urunUretici;
    private int urunMiktar;
    private String urunBirim;
    private String urunRafNo;

    static Map<Integer, Urunler> eklnenUrunlerMap = new HashMap<>();

    // 2- Construction

    public Urunler() {

    }

//   public Urunler(int productId, String urunAdi, String urunUretici, int urunMiktar, String urunBirim, String urunRafNo) {
//       //this.urunId = idCounter++;
//       this.urunAdi = urunAdi;
//       this.urunUretici = urunUretici;
//       this.urunMiktar = urunMiktar;
//       this.urunBirim = urunBirim;
//       this.urunRafNo = urunRafNo;
//   }

    public Urunler(String urunAdi, String urunUretici, String urunBirim) {
        this.urunAdi = getUrunAdi();
        this.urunUretici = getUrunUretici();
        this.urunBirim = getUrunBirim();

    }


    // 3- Getter and Setter

    public static int getUrunId() {
        return ++idCounter;
    }

    public static void setUrunId(int urunId) {
        Urunler.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunUretici() {
        return urunUretici;
    }

    public void setUrunUretici(String urunUretici) {
        this.urunUretici = urunUretici;
    }

    public int getUrunMiktar() {
        return urunMiktar;
    }

    public void setUrunMiktar(int urunMiktar) {
        this.urunMiktar = urunMiktar;
    }

    public String getUrunBirim() {
        return urunBirim;
    }

    public void setUrunBirim(String urunBirim) {
        this.urunBirim = urunBirim;
    }

    public String getUrunRafNo() {
        return urunRafNo;
    }

    public void setUrunRafNo(String urunRafNo) {
        this.urunRafNo = urunRafNo;
    }


    // 4- toString


    @Override
    public String toString() {
        return "Urun: " +
                "urunID='" + urunId + '\'' +
                "urunAdi='" + urunAdi + '\'' +
                ", urunUretici='" + urunUretici + '\'' +
                ", urunMiktar=" + urunMiktar +
                ", urunBirim='" + urunBirim + '\'' +
                ", urunRafNo='" + urunRafNo + "\n";
    }




}
