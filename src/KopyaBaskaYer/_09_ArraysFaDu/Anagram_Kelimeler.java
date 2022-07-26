package KopyaBaskaYer._09_ArraysFaDu;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Kelimeler {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

		Scanner scan = new Scanner (System.in);
		System.out.print("Birinci kelimeyi giriniz : ");
		String kelime1 = scan.next();
		System.out.print("Ikinci kelimeyi giriniz : ");
		String kelime2 = scan.next();

		boolean anagramMi = anagram(kelime1,kelime2);
		System.out.println(anagramMi);

	}

	private static boolean anagram(String kelime1, String kelime2) {

		String arr1[] = kelime1.toLowerCase().split("");
		Arrays.sort(arr1);
		String arr2[] = kelime2.toLowerCase().split("");
		Arrays.sort(arr2);


		if(Arrays.equals(arr1,arr2)) {
			return true;
		} else {
			return false;
		}


	}

}
