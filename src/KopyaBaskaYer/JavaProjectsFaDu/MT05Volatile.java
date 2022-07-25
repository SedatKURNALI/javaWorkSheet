package KopyaBaskaYer.JavaProjectsFaDu;

 /*
============================================= VOLATILE ===============================================================
 Volatile (uçucu, geçici, kalıcı olmayan) keyword'u, Bir degiskenin farklı threadler tarafından kullanılırken degerinin
 degismesini saglamak icin kullanılmaktadir. Aynı zamanda bir class'ı thread-safe(thread güvenliği ile çalışma) yapmak
 icin de kullanılır.  Yani eş zamanlı olarak volatile veriable threadler tarafından erişip güncelleyebilir ve Volatile
  keywordu sadece degiskenler ile (primitif veya non-primitif)  kullanılabilir. Obj, method ve Class'lara konulmaz

 Volatile keywordu kullanılan bir veriable'ın degeri cache bellege saklanmaz. Her defasında ilgili class'ın process bellegi
 (MAIN MEMORY) den okunur. Dolayısıyla farklı thread'ler degiskeni guncellese de her defasında en guncel deger okunmus olur.
 Bu özellikleri sayesinde Synchronization yönteminin daha iyi bir alternatifi olarak düşünülebilir.
 */

// COK ONEMLI : Obj, method ve Class'lara konulmaz, degeri cache bellege saklanmaz.


public class MT05Volatile {

     volatile public static int yas = 0; // class level da birden cok thred in es zamanli erisecegi variable
                                // (Ornek) sut cekilecek top create edildi

    public static void main(String[] args) {

        Thread thMessi = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) { // sonsuz loop
                    if(yas==0) { // yas variable 0 oldugu surece print run et degilse break;
                        System.out.println("Messi sutu cekti -> yas hala 0 buyumedi bu veled");
                    } else {
                        break;
                    }
                }
            }
        });

        Thread thRonaldo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                yas=1;
                System.out.println("Ronaldo sutu cekti -> veled nihayet yasina basti");
            }
        });

        thMessi.start();
        thRonaldo.start();

    }

}
