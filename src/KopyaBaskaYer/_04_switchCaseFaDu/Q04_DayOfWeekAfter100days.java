package KopyaBaskaYer._04_switchCaseFaDu;

import java.util.Scanner;

public class Q04_DayOfWeekAfter100days {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        // bugunun kac nolu gun oldugunu girdirelim
        Scanner scan = new Scanner(System.in);
        System.out.print("Bugun haftanin kac numarali gunudur? Or: Pazartesi 1, Sali 2 ...: ");
        int today = scan.nextInt();
        System.out.print("Kac gun sonrasini Ogrenmek isterseniz? : ");
        int kacgun = scan.nextInt();
        // 100 gun sonra mod 7 ye gore kalan kadar fazla olur
        int nextday = (today + kacgun % 7) % 7;
        System.out.print(kacgun+" sonra : ");

        switch (nextday) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 0:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Sistemde bir hata olustu");

        }


    }
}

