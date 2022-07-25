package HLKHocaAdvJavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Q01_2 {
    public static void main(String[] args) {
        /* TASK :
	        kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
	        kullanicidan alan
	        ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin
	        arasinki farki gosteren
	        java code create ediniz.
	    */
        Scanner input = new Scanner(System.in);

        System.out.print("Kac tane sayi girelim : ");
        int elemanSayisi = input.nextInt();

        int[] arr = new int[elemanSayisi];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanini giriniz :");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int each : arr) {
            if (min > each) min = each;
            if (max < each) max = each;
        }

//        for (int i = 1; i < arr.length; i++) {
//            if (min > arr[i]) min = arr[i];
//            if (max < arr[i]) max = arr[i];
//        }

        System.out.println("Dizinin max-min degerleri arasi farki :" + (max - min));
    }
}
