package _09_ArraysFaDu;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_EnBuyukEnKucukFark {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Kac elemanli bir array olusturmak istiyorsunuz? : ");
		int adet = scan.nextInt();

		int arr[] = new int[adet];

		int fark = arrayOlusturBuyukKucukFarkAl(adet,arr);
		System.out.println("Girilen elemanlarin en buyuk ile en kucuk arasindaki fark:  "+fark);


	}

	private static int arrayOlusturBuyukKucukFarkAl(int adet, int[] arr) {
		int i = 0;
		Scanner scan = new Scanner (System.in);

		while (i<adet) {
			System.out.print(i+ " . index elemanini giriniz : ");
			arr[i] = scan.nextInt();
			i++;
	}
		Arrays.sort(arr);
		return (arr[arr.length-1]-arr[0]);

}

}
