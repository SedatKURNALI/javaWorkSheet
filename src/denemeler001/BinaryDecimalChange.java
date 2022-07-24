package denemeler001;

import java.util.Scanner;

public class BinaryDecimalChange {
    public static void main(String[] args) {
        // Klavyeden girilen binary (2 lik sayi sistemi) sayiyi,
        // decimal (10 luk sayi sistemi) sayiya cevirene methodu yaziniz.
        // Ornegin : (1101) binary sayisi 13 sayisina esittir

        Scanner scan = new Scanner(System.in);
        System.out.print("Binary sayiyi giriniz : ");
        int bin = scan.nextInt();
        System.out.println(bin + " ikili sistemdeki sayinin onluk sistemdeki karsiligi :" + binaryToDecimal(bin));
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int basamaklar = 0;
        int temp = binary;
        int b = 1;                          // sayi binary desekte int 10 luk oldugu için herbir rakami almak
        do                                  // için 10 a bolmek gerekir ama unutmayin sayimiz ikilik sistemde diye girdik
        {
            basamaklar = (temp % 10) * b;
            decimal += basamaklar;
            temp /= 10;
            b *= 2;
        } while (temp != 0);
        return decimal;
    }
}
