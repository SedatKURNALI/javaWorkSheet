package KopyaBaskaYer._11_dateTimeFaDu.HaftaninSorusu_objectli;

import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamani;


    public Kullanici() { // parametresiz constructor
        // parametreli olusturdugumuz icin ihtiyaten bunu
        // yapiyoruz, bos obje olusturursak ihtiyac
    }

    public Kullanici(String name, LocalDateTime kayitZamani) { // parametreli constructor
        this.name = name;
        this.kayitZamani = kayitZamani;
    }


}
