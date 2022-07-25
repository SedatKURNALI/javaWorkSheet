package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q03_Bmi_bodymassindex {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen boyu cm olarak giriniz");
        double boy = scan.nextDouble();
        System.out.println("Lutfen lilo bilgisini kg olarak giriniz");
        double kilo = scan.nextDouble();
        double bmi = kilo / ((boy/100)*(boy/100));

        System.out.println("Vucut Kitle Endeksiniz : "+bmi);
        if(bmi<0) {
            System.out.println("Hatali Giris Yaptiniz");
        }
        else if (bmi <=20) {
            System.out.println("Oldukca zayifsiniz");
        }
        else if (bmi <=25) {
            System.out.println("Normal sinirdasiniz");
        }
        else if (bmi <=30) {
            System.out.println("Sisman kategorisindesiniz");
        }
        else {
            System.out.println("Obez grubundasiniz");
        }

        System.out.println("Ideal kg ust siniriniz ="+((boy/100)*(boy/100))*25);

        scan.close();
    }

}
