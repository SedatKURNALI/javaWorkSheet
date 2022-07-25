package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q08_DiscountPrice {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a customer card? Yes or No");
		String card = scan.next();
		System.out.println("How many products do you want to bu?");
		int num = scan.nextInt();

		if(card.equalsIgnoreCase("yes")) {
			if (num>10) {
				System.out.println("Discount Rate is 20%");
			}
			else {
				System.out.println("Discount Rare is 15%");
			}
		} else if (card.equalsIgnoreCase("no")) {
			if (num>10) {
				System.out.println("Discount Rate is 15%");
			} else {
				System.out.println("Discount Rate is 10%");
			}
		} else {
			System.out.println("If you have a card please Type Yes or No");
		}


	}

}
