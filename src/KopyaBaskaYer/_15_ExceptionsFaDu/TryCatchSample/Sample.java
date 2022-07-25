package _15_ExceptionsFaDu.TryCatchSample;

import java.util.Scanner;

public class Sample implements Exceptions {

    // 1- Aritmetik Exception
    @Override
    public void arithmeticException() {

        int bolunen = SAYI1;
        int bolen = SAYI3;
        double bolum ;
        try {
            bolum = bolunen / bolen;
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("Exception Olustu : Bir sayinin sifira bolumu exception verir");
        }
        System.out.println("Bolunen :" + SAYI1+
                "\nBolen : "+SAYI3);


    }


    // 2- Null Pointer Exception
    @Override
    public void nullPointerException() {
        String str = null;
        try {
            System.out.println("Stringin uzunlugu : " + str.length());
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Null Pointer Exception Olustu");
        }

    }

    // 3- Array dizin index Exception
    @Override
    public void arrayIndexOutOfBoundsException() {
        int arr[] = {4, 5, 6};
        try {
            System.out.println(arr[0] + arr[3]);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Array dizinde index hatasi olustu, boyutundan fazla");
        }

    }

    // 4- Sayi Format Hatasi
    @Override
    public void numberFormatException() {
        String str = "123.23";
        int numStr = 0;
        try {
            numStr = Integer.parseInt(str);
            System.out.println(numStr);
        } catch (NumberFormatException e) {
            // e.printStackTrace();
            System.out.println("Format hatasi olustur");
        }


    }

    // 5- Girilen Verinin Hatali Olmasi
    @Override
    public void inputMismatchException() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Bir sayi giriniz : ");
            int sayi = scan.nextInt();
            System.out.println(sayi);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Bir sayi girmeniz gerekiyordu");
        }
    }

    // 5- Girilen Verinin Istedigimiz Sekilde Olmamasi
    @Override
    public void illegalArgumentException() {

        Scanner scan = new Scanner (System.in);


        try {
            System.out.println("Sinav notunu giriniz : ");
            int sinavNotu=scan.nextInt();
            if (sinavNotu < 0 || sinavNotu > 100) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("Sinav notunuz : " + sinavNotu);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Sinav notu 0 ile 100 arasinda olmali");
        } catch (Exception e) {
            System.out.println("Hatali giris yaptiniz");
        }

    }

    // while ile try catch

    public void emailKontrol() {
        System.out.println("E-Mail kontrol Sistemi");
        String email = WhileTryCatch.emailGirKontrolEt();
        System.out.println(email);
    }


}
