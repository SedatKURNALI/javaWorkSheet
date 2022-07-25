package KopyaBaskaYer.JavaProjectsFaDu;

/*
  Uygulamalarda bazen tüm metotudun synchronized yapılması gerekmeyebilir.
  Bu durumda, sadece ilgili kısımları synchronized yapıp diğer kısımların klasik multi-threading mantığı ile
  calışmasına izin vermek performans acisindan onemli katkı saglayacaktır.
  İstenilen kısımların synchronized yapılması için "synchronized block" kullanılır.
  Bu durumda block içerisindeki kısıma aynı anda birden fazla thread'in erişimine izin verilmez iken dışında kalan
  kısımlara, aktif olan threadlar tarafından eş zamanlı erişim sağlabilir.
 */
public class MT03BlockLevelSynchronized {
    public static void main(String[] args) {
        Parantez p1 = new Parantez();
        Thread thHabil = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    p1.parantezKoy();
                }
            }
        });
        Thread thKabil = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    p1.parantezKoy();
                }
            }
        });

        thHabil.start();
        thKabil.start();
    }

}

class Parantez {//Multiple Class

    public void parantezKoy() {//process--> [[[[[ ]]]]] & 25 ms sleep
        synchronized (this) {//block  synchronized->block lock'landı
            for (int i = 1; i <= 10; i++) {//bu action eşzamanalı çalışılmaması gereken afitap'a kur yapma
                if (i <= 5) {
                    System.out.print("[");
                } else System.out.print("]");
            }
            System.out.println();
        }


        for (int i = 1; i <= 10; i++) {//bu action eşzamanalı çalışabilen gereken afitap kuaföre götürme
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}