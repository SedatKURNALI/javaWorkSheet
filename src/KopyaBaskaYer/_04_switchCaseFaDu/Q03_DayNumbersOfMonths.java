package _04_switchCaseFaDu;

import java.util.Scanner;

public class Q03_DayNumbersOfMonths {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan = new Scanner (System.in);
        System.out.println("Bir ay numarasi giriniz (1-12)");
        int month = scan.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiginiz ay 31 gundur");
                break;
            case 2:
                System.out.print("Lutfen bulundugunuz yili giriniz : ");
                int yil = scan.nextInt();
                if(yil%4 == 0) {
                    System.out.println("Girdiginiz ay 29 gundur");
                } else {
                    System.out.println("Girdiginiz ay 28 gundur");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiginiz ay 30 gundur");
                break;
            default:
                System.out.println("Hatali bir ay girdiniz");
        }




    }
}

