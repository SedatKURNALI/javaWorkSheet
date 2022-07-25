package KopyaBaskaYer.JavaProjectsFaDu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MT12DeadLockCare {
    public static void main(String[] args) {
        Lock lock1=new ReentrantLock();
        Lock lock2=new ReentrantLock();
        Thread anneTh=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagKizim=false;
                boolean flagOglum=false;
                boolean doneKizim=false;
                boolean doneLOglum=false;
                while (true){

                    try {
                        if (!flagKizim){
                            flagKizim=lock1.tryLock();
                            if(flagKizim){
                                System.out.println("anne kızı yemege cıkardı..");
                            }
                        }
                        if (!flagOglum){
                            flagOglum=lock2.tryLock();
                            if(flagOglum){
                                System.out.println("anne oglu yemege cıkardı..");
                            }
                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                    }
                    finally {
                        if (flagKizim && !doneKizim){
                            lock1.unlock();
                            doneKizim=true;
                            System.out.println("anne kızını yemekten gönderdi...");

                        }
                        if (flagOglum && !doneLOglum){
                            lock2.unlock();
                            doneLOglum=true;
                            System.out.println("anne oglunu  yemekten gönderdi...");
                        }
                    }
                    if (flagKizim && flagOglum){
                        break;
                    }
                }
            }
        });
        Thread babaTh=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagKizim=false;
                boolean flagOglum=false;
                boolean doneKizim=false;
                boolean doneLOglum=false;
                while (true){

                    try {
                        if (!flagKizim){
                            flagKizim=lock1.tryLock();
                            if(flagKizim){
                                System.out.println("baba kızı yemege cıkardı..");
                            }
                        }
                        if (!flagOglum){
                            flagOglum=lock2.tryLock();
                            if(flagOglum){
                                System.out.println("baba oglu yemege cıkardı..");
                            }
                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                    }
                    finally {
                        if (flagKizim && !doneKizim){
                            lock1.unlock();
                            doneKizim=true;
                            System.out.println("baba kızını yemekten gönderdi...");

                        }
                        if (flagOglum && !doneLOglum){
                            lock2.unlock();
                            doneLOglum=true;
                            System.out.println("baba oglunu  yemekten gönderdi...");
                        }
                    }
                    if (flagKizim && flagOglum){
                        break;
                    }
                }
            }
        });
        anneTh.start();
        babaTh.start();
    }
}