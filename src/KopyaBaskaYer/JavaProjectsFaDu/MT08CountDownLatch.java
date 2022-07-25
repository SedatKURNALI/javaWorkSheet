package KopyaBaskaYer.JavaProjectsFaDu;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MT08CountDownLatch {
    /* ============================================= COUNTDOWNLATCH ========================================================
        Var olan Thread'lerin yönetilmesini saglayan bir yontemdir. Belirli sayıda Thread'in islem gordukten sonra
        diger Thread'lere gecilmesini saglayan bir yontemdir.

        Geri Sayım sayac mantığı ile çalışır.Sayaca yüklenen sayıdan başlar ve her bir Thread'in calimasi tamamlaninca
        sayac'ın degeri otomatik olarak bir azalır. Böylelikle sayac sifir degerine ulasana kadar  latch.await()->hazır ol mandalı komutu ile
        diğer Thread'lerin bekletilmesini sağlar. Eger sayac Sifira ulaşırsa yani istenilen sayida Thread islem görmüş
        ise o zaman yeni gelecek olan Thread'lerin calismasina izin verilir.
    */
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(6);//geri sayım class'tan obj create edildi.Thread'ler  bu sayaca göre eş zamanlı run edilecek.
        ExecutorService service = Executors.newFixedThreadPool(10);//eş zamanlı  sadece 6 thread run edilebilir bir havuz için service obj create edildi

        for (int i = 0; i < 10; i++) {
            //service.submit(new Thread(new ThreadYap(latch)));//geri sayimı  6 olan 6 kapasiteli havuz için thread create eder
            service.execute(new Thread(new ThreadYap(latch)));//geri sayimı  6 olan 6 kapasiteli havuz için thread create eder
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            latch.await();//geri sayım sayacı bitene kadar diğer thread'leri hazırda bekletir.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("geri sayımdaki 6 adet thread çalıştı ve durdu");
        service.shutdown();

        Thread bekleyenThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("bekleyen thread çalıştı ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("bekleyen thread durdu ...");
            }
        });
        bekleyenThread.start();

    }
}

class ThreadYap extends Thread {
    private CountDownLatch işaret;

    public ThreadYap(CountDownLatch işaret) {
        this.işaret = işaret;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  çalışmaya başladı...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " durdu...");
        System.out.println("    *****     ");
        işaret.countDown();//geçerli geri sayımı return eder.
    }


}