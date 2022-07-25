package KopyaBaskaYer.JavaProjectsFaDu;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

    /*  ================================================== REENTRANT LOCK =================================================
    ReentrantLock sinifi Lock interface'ini implement eder ve paylaşımlı kaynaklara erişim sırasinda senkronizasyon
    saglar. Paylaşımlı olan bir kaynağı, çalışmakta olan bir thread için kilitlerken(lock) diğer thread'leri bloklar.Yaptığı
    iş bakımından Synronized'a benzese de çok daha esnek ve kullanışlı bir method sunar.
    İçerisinde bir kaynağı bir thread'in kaç kere kilitlediğini(lock) tutan sayac bulunmaktadır. Ayrıca, istenilirse
    en uzun süredir bekleyen Thread'e oncelik verilmesini sağlayan (fairness=eşitlik adalet) bir modu bulunmaktadir.
*/

public class MT10ReentrantLock {

    public static void main(String[] args) {
        Lock engelle = new ReentrantLock();
        BiletSatis islem = new BiletSatis(engelle);
        Thread yolcu1 = new Thread(islem, "Yolcu1 thread");
        Thread yolcu2 = new Thread(islem, "Yolcu2 thread");
        Thread yolcu3 = new Thread(islem, "Yolcu3 thread");
        yolcu1.start();
        yolcu2.start();
        yolcu3.start();
    }
}
class BiletSatis implements Runnable {
    public int biletSayisi = 2;
    Lock kilit;
    public BiletSatis(Lock kilit) {
        this.kilit = kilit;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " bileti almak için bekliyor...");
        kilit.lock();//Bilet alm islemini diğer thread'ler için kilitlendi(lock)
        if (biletSayisi > 0) {
            System.out.println(Thread.currentThread().getName() + " bileti almak uzere...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            biletSayisi--;
            System.out.println(Thread.currentThread().getName() + " bileti aldı...");
        } else System.out.println(Thread.currentThread().getName() + " bileti kalmadıgı için alamadı...");
        kilit.unlock();//diger threadlerin islem yapması için kilit açıldı(unlock)
    }
}
