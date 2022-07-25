package KopyaBaskaYer.JavaProjectsFaDu;
public class MT04ClassLevelSynchronized {
    /*
      Thread'ler farklı obj'ler kullanılırsa durum nasıl değişir?
    Dolayısıyla method seviyesi synchronization işe yaramayacaktır.
    Çünkü her iki thread, farklı obj'lerin parantezKoy() methodunu calistirmaktadir.
    Burada çözüm için class seviyesinde blocklama yapmaktır.
    Çünkü her iki obje aynı class'dan create edilmektedir.
    */
    public static void main(String[] args) {
        ParantezYazanClass p1 = new ParantezYazanClass();
        ParantezYazanClass p2 = new ParantezYazanClass();
        Thread thHabil = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {// 5 satır [[[[[ ]]]]] print eder
                    p1.parantezKoy();
                }
            }
        });
        Thread thKabil = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {// 5 satır [[[[[ ]]]]] print eder
                    p2.parantezKoy();
                }
            }
        });
        thHabil.start();
        thKabil.start();
    }
}
class ParantezYazanClass {//Multiple Class
    public synchronized static void parantezKoy() {//synchronized static-> keyword ile class level synchronized(class lock'lama) yapıldı
        //public synchronized  void parantezKoy() {//synchronized -> keyword ile method level synchronized(method lock'lama) yapıldı
        for (int i = 1; i <= 10; i++) {//bu action eşzamanalı çalışılmaması gereken afitap'a kur yapma
            if (i <= 5) {
                System.out.print("[");
            } else System.out.print("]");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {//bu action eşzamanalı çalışabilen gereken afitap kuaföre götürme
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}