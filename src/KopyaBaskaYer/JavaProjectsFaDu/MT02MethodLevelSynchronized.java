package KopyaBaskaYer.JavaProjectsFaDu;

    /*
    =========================================   SYNCHRONIZED  ==========================================================
multi-threading çalışma koşullarında birden fazla thread'in aynı kaynağa (değişken method, class, bellek vb)(Habil-Kabil kavgası )
erişimi (okuma veya yazma) sırasında verinin güncellenmesi ve tutarlılığı ile ilgili sorunlar çıkabilir.
Bu tutarsızlığı engellemek için synchronized keywordu kullanılabilir.
Kısaca, Syncronization bir kaynağın tread'ler tarafından eş zamanlı kullanımına kapatılması (Lock) işlemidir.
Synchronized keywordunun farklı kullanımları bulunmaktadır.
 1- Eğer bir metot "synchronized" yapılırsa (Method-Level Syncronization) bu metota aynı andan birden fazla thread'in
    erişimine izin verilmez.
 2- Eğer bir metot yerine o metodun ait olduğu class'ı aynı anda birden fazla thread'in kullanımına kapatmak
    (class-level Synchronization) istersek o zaman "synchronized static" kullanmalıyız.
 3- Eğer bir metot içerisinde belirli bir kismin eş zamanlı thread kullanımına kapatılmasını istenire
    "synchronized block" (block-level Synchronization) kullanılmalı.
     */

public class MT02MethodLevelSynchronized {

    public static int afitop=0; // kavga edilecek ortak erisim sorunu olacak thred' lerin erisecegi variable create edildi

    public static void main(String[] args) {

        Thread thHabil = new Thread(new Runnable() {
            @Override
            public void run() {
                Sevdiren.kur("Habil Canimsin");
            }
        });

        Thread thKabil = new Thread(new Runnable() {
            @Override
            public void run() {
                Sevdiren.kur("kabil ben sana ne diim");
            }
        });

        thHabil.start();
        thKabil.start();

        // Methotu synchronized yaparak her iki thread'in aynı anda (eş-zamanlı, concurently) metoda erişimini engellemiş olduk.
        // Eger böyle yapmasaydık eş zamanlı olarak Thread1->habil ve thread2->kabil kur() methodu call edip afitap'a kur yapabilir.
        // Bu sıkıntı join metodu ile de giderilebilirdi. Ancak ikisi arasında ince nuanslar bulunmaktadır.
        // join() metodu bir thread'in tamamıyla bitmesinin beklenmesini sağlarken, syncronization aynı anda bir kaynağa
        // erişimi engellemektedir.
        // Hangisinin daha elverişli olacağı uygulamanın gereksinimlerine ve koşullara göre değişebilir.

    }

}

class Sevdiren { // Multiple Class

    // synchronized --> key word ile bu methodun threadler tarafindan es zamanli call edilmeyecek
    public synchronized static void kur(String thread) { // method level synchronized

        for (int i = 1; i <= 10 ; i++) {
            MT02MethodLevelSynchronized.afitop++;
            System.out.println("afitop "+thread+":"+MT02MethodLevelSynchronized.afitop);
        }

    }

    public static void ebikGabuk() {

    }

}