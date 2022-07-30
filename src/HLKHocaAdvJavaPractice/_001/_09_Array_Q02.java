package HLKHocaAdvJavaPractice._001;

import java.util.Arrays;

public class _09_Array_Q02 {
    public static void main(String[] args) {
         /* TASK :
        multidimensional arrayin iç arraylerindeki tüm elemanlar?n toplam?n? birer birer bulan
        ve herbir sonucu yeni bir arrayin eleman? yapan ve yeni array i ekrana yazd?ran program? yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
         */
        int arr[][] = {{10, 20, 30}, {11, 35}, {4}, {6, 7, 20}};
        int[] sum = new int[arr.length];
        int toplam;
        for (int i = 0; i < arr.length; i++) {
            toplam = 0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            sum[i] = toplam;
        }
        System.out.println(Arrays.toString(sum));
    }
}
