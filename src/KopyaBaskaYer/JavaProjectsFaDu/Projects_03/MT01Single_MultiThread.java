package KopyaBaskaYer.JavaProjectsFaDu.Projects_03;

public class MT01Single_MultiThread {
    /*

      ============================================ THREAD, PROCESS=========================================================
    Thread : Kelime manası iplik olmasına karşın IT alanında iş parçacığı olarak adlandırılır.
    Thread, Process olarak adlandırılan ve her bir çalışan programın alt iş parçaçığı olarak düşünülebilir.
    Single-Thread: Tek iş parcacığı vardır. Ve tüm işler sıra ile yapılır.JVM default olarak Single-Thread create eder.
    Multi-Thread: Bir den fazla iş parçacığı vardır ve bu işler aynı anda yapılabilir (farklı işlemciler yardımıyla)

    Javada 2 yöntem ile Thread oluşturmak mümkündür.
    ----------------------------------------------
    1- Thread classından bir class extends (türeterek) edilerek
    2- Runnable Interface'inden implements edilerek.--> best practice

    Thread class'ının yaygın kullanılan metotlari:
    -----------------------------------------------
  *  public void run(): Bir threat'in calistiracagi islemleri tanımlamak amacıyla kullanlır.
                        Bir thread create edildiğinde içinde ne çalışacagını run() method override edilerek olusturulur.
                        Bir thread'in yapacagı action run() method içinde tanımlanır.

  *  public void start(): Bir thread'in baslatilmasini saglar.JVM, thread'in run() methodunu calistirir.

  *  public void sleep(long miliseconds): Bir thread'in belirtilen sure (ms) boyunca bekletilmesini saglar.
  *  public void join(): Bir thread olmesini (bitmesi) beklemek icin kullanilir.
                        Thread'in olmesi beklendikten sonra sıradaki komutlar run edilir.Sıralı run işlemlerinde gayet önemlidir.
  *  public int getPriority(): Aynı anda birden cok çalışan Thread'ler için bir thread'in önceligini dondurur.
    public int setPriority(int priority): Bir thread icin oncelik ayarlamaya yarar.
    public String getName(): Bir thread'in adini dondurur.
    public void setName(String name): Bir thread'e isim vermeye yarar.
    public Thread currentThread(): Su an calisan thread'in referansını dondurur.
    public int getId(): Bir thread'in id numarasını dondurur.
    public Thread.State getState(): Bir thread'in state (durum)'ini dondurur.
    public boolean isAlive(): Bir thread'in canlı (alive) olup olmadığını soyler.
    public void yield(): Aktif olan bir thread'in gecici olarak durdurulmasini ve baska thread'lerin calistirilmasini saglar.
    public boolean isDaemon(): Bir thread'in Deamon(şeytan:arka planda çalışan garbage collector gibi JVM'in kapanmasını engellemeyen önceliği düşük thread'ler)
                               threat olup olmadıgını test eder. Gerekmedikçe kullanılmamalı. Arka planda çalışmayacak thread'ler için kulanılırsa JVM kapatabilir
    public void setDaemon(boolean b): Bir thread'i deoman thread olarak işaretler.
  *  public void interrupt(): Thread kesintiye ugratır.mevcut App çalışırken flash bellek takma gibi eş zamalılıgı kesmek için kullanılır.
                              Usp klavye port bu thread'i kullanır
    public boolean isInterrupted(): Bir thread'in kesilip kesilmediğni test eder.


     */
    public static void main(String[] args) throws InterruptedException {

        System.out.println(" ***** Single Thred ******");
        long singleBasla = System.currentTimeMillis();

        SingleThreadSayac sT1 = new SingleThreadSayac(1);
        sT1.sThreadsayac();

        SingleThreadSayac sT2 = new SingleThreadSayac(2);
        sT2.sThreadsayac();

        long singleBitis = System.currentTimeMillis();

        System.out.println("SingleThread Run Suresi : "+(singleBitis-singleBasla));



        System.out.println(" ***** Multi Thred ******");
        long multiBasla = System.currentTimeMillis();

        MultiThreadSayac mT3 = new MultiThreadSayac(3);
        mT3.start();

        MultiThreadSayac mT4 = new MultiThreadSayac(4);
        mT4.start();

        mT3.join();  // mT3 isi bitir, bitmesini bekle
        mT4.join(); // mT4 isi bitir, bitmesini bekle
        // gereksiz yere join method kullanilmasi MultiThredi (app) yavaslatir.
        // dikkatli kullanilmali.
        // mt4 bitmeden alt satir run olmaz.

        long multiBitis = System.currentTimeMillis();

        System.out.println("Multi Thread Run Suresi : "+(multiBitis-multiBasla));


    }
}
class SingleThreadSayac{

    private int threadNo;

    public SingleThreadSayac(int threadNo) {
        this.threadNo = threadNo;
    }
    public void sThreadsayac() throws InterruptedException {
        for (int i = 0; i <=10; i++) {
            System.out.println("i " +i+" için çalışan thread no : "+threadNo);
            Thread.sleep(500);
        }
    }
}
class MultiThreadSayac extends Thread {  // Multiple Class 1.yol -> Thread class'a extend edildi.
    private int threadNo;

    public MultiThreadSayac(int threadNo) {  // constructor obje olusturmak icin
        this.threadNo = threadNo;
    }
    public void mThreadsayac() throws InterruptedException {  // action yapan process
        for (int i = 0; i <=10; i++) {
            System.out.println("i " +i+" için çalışan thread no : "+threadNo);
            Thread.sleep(500);
        }
    }

    @Override
    public void run() {  // hizmetciye is tanimi yapildi. (Thread bir hizmetcidir)
                         // run method olmazsa thred calismaz
        try {
            mThreadsayac();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}