package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q07_UppLowChr {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a character");
		char chr = scan.next().charAt(0);

		if (chr>'a' && chr<'z') {
			System.out.println("This is a lowercase character");
		}
		else if (chr>'A' && chr<'Z') {
			System.out.println("This is a uppercase character");
		}
		else {
			System.out.println("Wrong character set");
		}
		 
		

	

	}

}
