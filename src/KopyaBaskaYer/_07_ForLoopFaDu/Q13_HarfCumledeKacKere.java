package KopyaBaskaYer._07_ForLoopFaDu;

import java.util.Scanner;

public class Q13_HarfCumledeKacKere {
	
	
	public static void main(String[] args) {
		
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		Scanner scan = new Scanner (System.in);
		System.out.print("Bir cumle giriniz : ");
		String cumle = scan.nextLine();
		System.out.print("Bir harf giriniz : ");
		String harf = scan.next();

		int adet = 0;

		for (int i = 0; i < cumle.length() ; i++) {

			if(cumle.substring(i,i+1).equals(harf)) {
				adet+=1;
			}
		}
		System.out.println("Girdiginiz cumlede "+harf+ " harfi "+adet+" kere kullanilmis");
		
		
		
	}

}
