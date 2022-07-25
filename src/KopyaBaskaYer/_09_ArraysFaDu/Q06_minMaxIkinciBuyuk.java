package _09_ArraysFaDu;

import java.util.Arrays;

public class Q06_minMaxIkinciBuyuk {
    public static void main(String[] args) {
	
	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        Arrays.sort(arr);

        int minSayi=arr[0];
        int maxSayi=arr[arr.length-1];
        int ikinciBuyuk=0;

        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>arr[i-1] & arr[i]!=arr[arr.length-1]) {
                ikinciBuyuk = arr[i];
                break;
            }
        }

        System.out.println("En kucuk Sayi : "+minSayi);
        System.out.println("En buyuk ikinci Sayi : "+ikinciBuyuk);
        System.out.println("En kucuk Sayi : "+maxSayi);

    }
}
