package denemeler001;

import java.util.Scanner;

public class BinaryToplama {
    public static void main(String[] args) {
        long binary1, binary2;
        Scanner in = new Scanner(System.in);
        binary1 = in.nextLong();
        binary2 = in.nextLong();
        int araToplam = 0;
        long toplam = 0;
        long temp1 = binary1;
        long temp2 = binary2;
        int basamakDegeri1 = 0;
        int basamakDegeri2 = 0;
        int elde = 0;
        int k = 1;
        for (int i = 0; i < 25; i++) {
            basamakDegeri1 = (int) (temp1 % 10);
            basamakDegeri2 = (int) (temp2 % 10);
            araToplam = elde + basamakDegeri1 + basamakDegeri2;
            if (araToplam == 0) {
                araToplam = 0;
                elde = 0;
            } else if (araToplam == 1) {
                araToplam = 1;
                elde = 0;
            } else if (araToplam == 2) {
                araToplam = 0;
                elde = 1;
            } else if (araToplam == 3) {
                araToplam = 1;
                elde = 1;
            }
            araToplam *= k;
            toplam += (long) araToplam;
            temp1 /= 10;
            temp2 /= 10;
            k *= 10;
            if (temp1 == 0 && temp2 == 0) {
                if (elde == 1) {
                    toplam = elde * k;
                }
                break;
            }
        }
        System.out.println("Binary sayilarin toplami = " + toplam);
    }
}
