package KopyaBaskaYer._06_Method_CreationFaDu;

import java.util.Scanner;

public class Q04_Contains {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("String ifadeyi giriniz : ");
        String text = scan.nextLine();

        boolean xyzCheck = xyzCheckMethod (text);
        System.out.println(xyzCheck);


    }

    private static boolean xyzCheckMethod(String text) {
        Boolean sonuc = text.contains("xyz")? true: false;
        return sonuc;
    }

}
