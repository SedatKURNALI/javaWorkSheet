package Enum_FaDu.Ex04;

public enum Aylar {

    // OCAK(31,"Kis","Ali bey"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);

    int days;

    /*
   Aylar(int gunMiktari, String mevsim, String birthDay) {
       days=gunMiktari;
   }
     */

    // ENUM CONSTRUCTOR Parametreli
    Aylar (int gunMiktari) {
        days=gunMiktari;
    }


    // ENUM method()
    void getGunMiktari() {
        System.out.println("gun miktari :"+days);
    }

}
