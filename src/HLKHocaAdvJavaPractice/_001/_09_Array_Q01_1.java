package HLKHocaAdvJavaPractice._001;

import java.util.Arrays;
import java.util.Scanner;

public class _09_Array_Q01_1 {
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
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Dizinin max-min degerleri arasi farki :" + (arr[arr.length - 1] - arr[0]));

    }
}
