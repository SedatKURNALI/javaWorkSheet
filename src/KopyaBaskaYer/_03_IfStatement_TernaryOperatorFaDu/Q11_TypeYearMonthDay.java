package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q11_TypeYearMonthDay {

    public static void main(String[] args) {

    /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter day");
        int day = scan.nextInt();
        System.out.println("Please enter month");
        int month = scan.nextInt();
        System.out.println("Please enter year");
        int year = scan.nextInt();

        System.out.println("day-month-year :"+day+"-"+month+"-"+year);
        System.out.println("year-month-day :"+year+"-"+month+"-"+day);

    }
}
