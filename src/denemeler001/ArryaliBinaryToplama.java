package denemeler001;

import java.util.Arrays;
import java.util.Scanner;

public class ArryaliBinaryToplama {
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        binary1 = in.nextLong();
        binary2 = in.nextLong();

        long temp1 = binary1;
        long temp2 = binary2;
        int basamakDegeri1 = 0;
        int basamakDegeri2 = 0;
        for (i = sum.length - 1; i > 0; i--) {
            basamakDegeri1 = (int) temp1 % 10;
            basamakDegeri2 = (int) temp2 % 10;
            sum[i] = sum[i] + basamakDegeri1 + basamakDegeri2;
            switch (sum[i]) {
                case 0:
                    sum[i] = 0;
                    break;
                case 1:
                    sum[i] = 1;
                    break;
                case 2:
                    sum[i] = 0;
                    sum[i - 1] = 1;
                    break;
                case 3:
                    sum[i] = 1;
                    sum[i - 1] = 1;
                    break;
            }
            temp1 /= 10;
            temp2 /= 10;
        }
        System.out.println("Binary sayilarin toplami = " + Arrays.toString(sum));
        for (i = 0; i < sum.length; i++) {
            remainder *= 10;
            remainder += sum[i];
        }
        System.out.println("Binary sayilarin toplami = " + remainder);
    }
}
