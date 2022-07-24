package denemeler001;

import java.util.Scanner;

public class ArraysizBinaryTopla {
    public static void main(String[] args) {
        int binary1, binary2;
        Scanner in = new Scanner(System.in);
        binary1 = in.nextInt();
        binary2 = in.nextInt();
        System.out.println(decimalToBinary(binaryToDecimal(binary1) + binaryToDecimal(binary2)));
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
        int b = 1;
        do {
            basamaklar = (temp % 10) * b;
            decimal += basamaklar;
            temp /= 10;
            b *= 2;
        } while (temp != 0);
        return decimal;
    }
}

