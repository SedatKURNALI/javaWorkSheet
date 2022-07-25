package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q02_Triangle_conditions {

    public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :
	     1- herhangi iki kenar toplami diger kenardan büyük,
	     2- herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle as integers:");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();

		int bigSide = 0;
		int smallSide = 0;
		int midSide =0;

		// en buyuk kenari bulma
        if(side1>side2 &&side1>side3) {
			bigSide=side1;
		}
		else if (side2>side1 && side2>side3) {
			bigSide=side2;
		}
		else {
			bigSide=side3;
		}

		// en kucuk kenari bulma
		if (side1<side2 && side1<side3) {
			smallSide = side1;
		}
		else if (side2<side1 && side2<side3) {
			smallSide = side2;
		}
		else {
			smallSide = side3;
		}

		// orta kenari bulma

		if(side1>smallSide && side1<bigSide) {
			midSide = side1;
		} else if (side2>smallSide && side2<bigSide) {
			midSide = side2;
		} else {
			midSide = side3;
		}

		System.out.println("En buyuk kenar :" + bigSide);
		System.out.println("En kucuk kenar :" + smallSide);
		System.out.println("Orta kenar : " +midSide);

		// BURADA UCGEN OLMA SARTI ILE ILGILI IF ELSE YAZALIM

		if(smallSide+midSide<bigSide || midSide+bigSide<smallSide || smallSide+bigSide<midSide){
			System.out.println("With these entered values, triangles are not formed.");
		}
		else {
			if (bigSide==midSide && midSide==bigSide) {
				System.out.println("This is an equilateral triangle.");
			}
			else {
				System.out.println("With these entered values, a triangle is formed.");
			}
		}

    }

}
