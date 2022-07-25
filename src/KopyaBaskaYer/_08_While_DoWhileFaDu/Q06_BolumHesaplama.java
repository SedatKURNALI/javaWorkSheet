package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q06_BolumHesaplama {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

		Scanner scan = new Scanner (System.in);
		System.out.print("Bolunen Sayiyi Giriniz : ");
		int bolunen = scan.nextInt();
		System.out.print("Bolen Sayiyi Giriniz : ");
		int bolen = scan.nextInt();

		int bolumSonuc = bolmeIslemi(bolunen,bolen);
		System.out.println("Bolme Islemi Sonucu = "+bolumSonuc);


	}

	private static int bolmeIslemi(int bolunen, int bolen) {
		int bolum= 0;

		if (bolunen == 0)
			bolum=0;
		if (bolen == 0)
			bolum= Integer.MAX_VALUE;
		if (bolen!=0 && bolunen!=0) {

			while (bolunen>=bolen) {
				bolunen = bolunen - bolen;
				bolum++;
			}
		}

		return bolum;
	}

}


