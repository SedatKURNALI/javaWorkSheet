package KopyaBaskaYer.JavaProjectsFaDu;

/*
============================ WAIT, NOTIFY ==========================
   object.wait()-->(obj ile çalışır Multi-Thread ile kullanılır) methodu bir thread'i suresiz olarak askıya alir(suspent).
    Diğer bir ifade ile bu thread'in kilitlemiş (locked) olduğu bir kaynağı salıvermesini ve askıya geçmesini sağlar.
    Thread bu durumdan bir başka thread Onu bilgilendirirse (notify) çıkabilir.

   object.notify()-->(obj ile çalışır Multi-Thread ile kullanılır) metodu ise aynı obj üzerinde wait (askıya alınan) bir
    thread'in uyanmasini saglar.  notify : Bildirmek, haber vermek, ihbar etmek
   Object.notifyAll() metodu bir nesne üzerinde askıya alınan tum thread'lerin uyandirilmasini saglar.

   Bu methodlar, thread'ler arasi iletişim (inter-Thread communication) metodu olarak kullanılır.
   Aynı  class'ta birden çok method'lar wait() ve notify() yapılabilir.

 */

public class MT06WaitNotify {

    public static double bakiye = 0;

    public static void main(String[] args) {

        MT06WaitNotify islem = new MT06WaitNotify(); // obj create edildii.

        Thread paraCekTh = new Thread(new Runnable() {
            @Override
            public void run() {
                //    try { // para cekme islemi 5 saniye bekletildi, para yatirma thread one cekildi.
                //        Thread.sleep(5000);
                //    } catch (InterruptedException e) {
                //        throw new RuntimeException(e);
                //    }


                islem.paraCek(200);
            }
        });


        Thread paraYatirTh = new Thread(new Runnable() {
            @Override
            public void run() {
                islem.paraYatir(500);
            }
        });

        paraYatirTh.start();
        paraCekTh.start();


    } // main method sonu

    public void paraCek(double cekilecekMiktar) {

        synchronized (this) {

            try {
                //paraCekTh threadi bir başk thread notify() veya notiyfAll() meth call edene kadar askıya (suspent bekleme) alınır.
                //Ancak bunun olabilmesi için wait obj. nin kendine ait bir gözlemcisi(monitor) olması gerekir.
                //synchronized block ve synchronized static veya synchronized obj. gözlenmesi (monitor) saglar.

                wait(); // bu method notify gelene kadar askiya alinacak (suspend)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (bakiye < 0 || bakiye < cekilecekMiktar) {
                System.out.println("Bakiyeniz yetersiz : " + bakiye + " TL");
            }


            bakiye -= cekilecekMiktar;
            System.out.println("Cekilen Miktar : " + cekilecekMiktar + "\nGuncel Bakiyeniz : " + bakiye + " TL");
        }
    }

    public void paraYatir(double yatirilacakMiktar) {
        bakiye += yatirilacakMiktar;
        System.out.println("Yatirilan Para : " + yatirilacakMiktar + " TL" + "\nGuncel Bakiyeniz : " + bakiye + " TL");

        synchronized (this) { //synchronized(this)--> thread'in wiat-notify hali sisteme monitoring(gözlemleme) yapıldı...inter-thread comminication
            // notifyAll(); // notify bekleyen tum waitleri active edebiliriz
            notify();
        }
    }


}
