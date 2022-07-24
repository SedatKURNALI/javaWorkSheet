package denemeler001;

import java.util.Scanner;

public class DecimalBinaryChange {
    public static void main(String[] args) {
        // Klavyeden girilen decimal (10 luk sayi sistemi) sayiyi,
        // binary (10 luk sayi sistemi) sayiya cevirene methodu yaziniz.
        // Ornegin : (10) decimal sayisi 1010 binary sayisina esittir

        Scanner scan = new Scanner(System.in);
        System.out.print("Decimal sayiyi giriniz (maximum  2000000 sayisina kadar): ");
        int dec = scan.nextInt();
        int sonuc = decimalToBinary(dec);
        System.out.println(dec + " onluk sistemdeki sayinin ikilik sistemdeki karsiligi :" + sonuc);
    }

    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int basamaklar = 0;
        int temp = decimal;
        int k = 1;
        do {
            basamaklar = (temp % 2);
            binary = binary + basamaklar * k;
            k *= 10;
            temp /= 2;
        } while (temp != 0);
        return binary;
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
