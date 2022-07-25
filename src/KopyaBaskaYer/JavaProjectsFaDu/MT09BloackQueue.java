package KopyaBaskaYer.JavaProjectsFaDu;

/*
ArrayBlockingQueue sınıfı, bir Array tarafından desteklenen sınırlı bir engelleme(Blocking) kuyruğudur.
Sınırlı olarak, Kuyruğun boyutunun sabit olduğu anlamına gelir. Kapasite oluşturulduktan sonra değiştirilemez.
Bir obj full Queue koyma girişimleri, işlemin engellenmesine neden olur. Benzer şekilde,
boş bir Queue'tan eleman alma girişimleri de engellenecektir. ArrayBlockingQueue'nun sınırı,
başlangıçta ArrayBlockingQueue constructor'daki parametre olarak kapasite atanarak elde edilebilir.
 Yeni eklenen obj her zaman Queue'nin sonuna eklenir
ve Queue alma işlemleri, öğeleri Queue'in başında alır.Bu class ve iterator, Collection ve
iterator implement'in tüm isteğe bağlı method'ları uygular . Bu Class, Java Collections Framework'ün bir üyesidir .
 */

import java.util.concurrent.ArrayBlockingQueue;

public class MT09BloackQueue {

    public static int urun=0;

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> urunRafi=new ArrayBlockingQueue<>(10);
        // kapasitesi 10 olan, integer data saklayan bir urun queue kaydettik.

        Uretici ureten = new Uretici(urunRafi);
        Thread uretenThread=new Thread(ureten);
        // urunRafi kuyrugundaki datalari bulunduran ureten objesi ile calisan bir Thread create edildi

        Tuketici tuketen = new Tuketici(urunRafi);
        Thread tuketenThread= new Thread(tuketen);

        uretenThread.start();
        tuketenThread.start();


    }
}



class Uretici extends Thread {
    private ArrayBlockingQueue<Integer> stok;

    public Uretici(ArrayBlockingQueue<Integer> stok) {
        this.stok = stok;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                stok.put(++MT09BloackQueue.urun); // stoklara yeni urun miktari update edildi
                System.out.println("Yeni urun stoklara eklenmistir "+MT09BloackQueue.urun);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Tuketici extends Thread {
    private ArrayBlockingQueue<Integer> stok;

    public Tuketici(ArrayBlockingQueue<Integer> stok) {
        this.stok = stok;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
                stok.take(); // stoklardan urun satisi yapildi
                MT09BloackQueue.urun--; // stoktaki urun miktari update edildi
                System.out.println("Satilan urun stoktan cikarildi "+MT09BloackQueue.urun);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}