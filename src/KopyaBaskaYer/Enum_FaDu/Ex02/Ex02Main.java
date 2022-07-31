package KopyaBaskaYer.Enum_FaDu.Ex02;

public class Ex02Main {
    public static void main(String[] args) {

        /*
        Önceden belli olan sabit verilerin atanmasındaki anlama zorluğu yerine bu değerlerin karşılıkları ENUM ile
        tanımlanarak , atama değeri için kullanılrlar. Bu durum yazma ve anlama kolaylığı sağlar.
        Enum class değildir. new key word kullanilmadan veri tanımlanır.
       Enum değerleri değişken değildir static veriable gibi hafızada yer açması gerekmiyoronun için direk kullanılıyor.
       dynamic değil static bir yapıdır
 */

        User kullanici1 = new User();
        kullanici1.name="Faruk bey";
        kullanici1.role=0;
        kullanici1.status=1;


        User kullanici2 = new User();
        kullanici2.yetkisi=Role.ADMIN;
        kullanici2.name="Deneme bey";
        kullanici2.durumu=Status.ACTIVE;

        User kullanici3 = new User();
        kullanici3.name="Yahya bey";
        kullanici3.yetkisi=Role.CUSTOMER;
        kullanici3.durumu=Status.LOGIN;




        if(kullanici2.yetkisi==Role.ADMIN) {
            System.out.println("silme yetkiniz var");
        } else {
            System.out.println("silme yetkiniz yok");
        }


        if(kullanici3.yetkisi==Role.CUSTOMER) {
            System.out.println("Altin musteri odulu");
        } else {
            System.out.println("Sadece musterilerimize ozel");
        }


    }

}
