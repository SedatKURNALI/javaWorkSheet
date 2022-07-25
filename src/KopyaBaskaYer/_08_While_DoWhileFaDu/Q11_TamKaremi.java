package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q11_TamKaremi {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Tam kare olup olmadigini ogreneceginiz pozitif tamsayiyi giriniz : ");
        int num=scan.nextInt();
        int i=1;
        boolean tamKareMi = false;
        while (i<=num) {
            if(i*i == num) {
                System.out.println("Girdiginiz sayi tam kare dir cunku : "+i+"*"+i+"="+(i*i));
                tamKareMi=true;
                break;
            } else {
                i++;
            }
        }

        System.out.println(tamKareMi);

    }
}
