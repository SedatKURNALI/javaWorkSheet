package KopyaBaskaYer._04_switchCaseFaDu;

import java.util.Scanner;

public class Q01_ScorePointABCD {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
		// Iki deger arasindaki duruma gore switch olusturma
/*
        kullanicidan bir not girmesini isteyin ve asagidaki skalaya gore hesaplayin
    not hesaplayici
            A => 90 ~100
            B => 80 ~ 89
            C => 70 ~ 79
            D => 60 ~ 69
            F =>  0 ~ 59
     */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1 ile 100 arasinda bir tam sayi giriniz");
		int num = scan.nextInt();
		switch ((int) num/10) {
			case 9:
				System.out.println("90-99 Araliginda : A");
				break;
			case 8:
				System.out.println("80-89 Araliginda : B");
				break;
			case 7:
				System.out.println("70-79 Araliginda : C");
				break;
			case 6:
				System.out.println("60-69 Araliginda : D");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
				System.out.println("0-59 Araliginda : F");
				break;
			default:
				break;
		}

	}
}
