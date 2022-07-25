package KopyaBaskaYer.JavaProjectsFaDu;

public class Mt11DeadLock {

    /*  ===================================================== DEADLOCK======================================================
      Deadlock aslında bir kısır döngüdür ve karşılıklı thread'lerin kilitlediği kaynakların salınmasının beklemesi ile
      oluşur.

      DeadLock genelde nested (iç içe) kaynak erişimi sırasında oluşur. Birbirinde habersiz Thread'ler ters sırada
      kaynaklara nested olarak erişmek isterse DeadLock oluşması muhtemeldir.

      DeadLock'dan kacınmak icin
      - Nested kaynak erişimi yapılmamalıdır.
      - Bir kaynağı kilitleyen Thread'in O kaynağı bırakmadan başka bir kaynağa erişimi engellenebilir.
   */
    public static void main(String[] args) {
        String kizim = "ayşe";//eş zamanlı thread erişimi yapacak olan kaynaklar
        String oglum = "ali";//eş zamanlı thread erişimi yapacak olan kaynaklar

        Thread anneTh = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (kizim) {

                    System.out.println("anne kızını yemeye cıkardı...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (oglum) {
                        System.out.println("anne oglunu yemege cagırdı...");
                    }
                }
            }
        });
        Thread babaTh = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (kizim) {

                    System.out.println("baba kızını yemeye cıkardı...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (oglum) {
                        System.out.println("baba oglunu yemege cagırdı...");
                    }
                }
            }
        });
        anneTh.start();
        babaTh.start();

    }


}
