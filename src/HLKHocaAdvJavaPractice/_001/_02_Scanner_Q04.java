package HLKHocaAdvJavaPractice._001;

import java.util.Scanner;

public class _02_Scanner_Q04 {
    public static void main(String[] args) {

        /*
         *  Kullanicidan alacaginiz 5 veya daha fazla basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen  5 veya daha fazla basamakli sayi giriniz : ");

        int num = scan.nextInt(); // 1234567 ise sonuc 16

        String str = "" + num;

        System.out.println(Integer.parseInt(str.substring(0, 1)) +
                Integer.parseInt(str.substring(1, 2)) +
                Integer.parseInt(str.substring(str.length() - 2, str.length() - 1)) +
                Integer.parseInt(str.substring(str.length() - 1)));
    }
}
