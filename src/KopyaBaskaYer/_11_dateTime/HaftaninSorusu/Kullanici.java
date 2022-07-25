package KopyaBaskaYer._11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamani;
    public Kullanici() {//p'siz cons...
    }

    public Kullanici(String name, LocalDateTime kayitZamani) {//p'li cons...
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}
