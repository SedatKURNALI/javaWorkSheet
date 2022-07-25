package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q05_Age_Weight_BloodDonation {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		System.out.println("Please enter your weight");
		double weight = scan.nextDouble();

		if (age>0 && age<18) {
			System.out.println("You are not allowed to donate blood due to your age");
		}
		else if (age>=18){
			if (weight>0 && weight<50) {
				System.out.println("You are not allowed to donate blood due to your weight");
			} else if (weight >=50)
			{
				System.out.println("You are allowed to donate blood");
			} else {
				System.out.println("Please enter a valid weight number");
			}

		} else {
			System.out.println("Please enter a valid number for age");
		}



	}

}
