package KopyaBaskaYer._09_ArraysFaDu;

import java.util.Arrays;

public class Q09_ArrayKareleri {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int arr[]= {2,6,4,5,8,9};
        int arrSqr[] = new int[arr.length];

        arrSqr = kareleriniBul(arr,arrSqr);

        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Kareleri : "+Arrays.toString(arrSqr));



    }

    private static int[] kareleriniBul(int[] arr, int[] arrSqr) {

        for (int i = 0; i < arr.length; i++) {

            arrSqr[i]=arr[i]*arr[i];

        }
        return arrSqr;
    }


}
