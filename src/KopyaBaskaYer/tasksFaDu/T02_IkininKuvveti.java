package KopyaBaskaYer.tasksFaDu;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer number to see if it's a power of 2 : ");
        int num = scan.nextInt();

        System.out.println(checkPowersofTwo(num));

    }

    private static boolean checkPowersofTwo(int num) {
        boolean result = false;
        int calculated = 1;

        if (num == 1) { // 2^0 = 1 oldugu icin bunu ilk olarak yazdik
            result = true;
        } else {

            while (calculated < num) { // calculated <= num olmuyor, once buyukluge bakiyor
                // sonra 2 ile carpiyor, eger 2 ile caprim sayidan
                // buyuk cikarsa sonraki donguyu yapmiyor.

                calculated *= 2;

            }

            // donguye bitirdigi yerde calculated==num ise 2 nin kuvveti
            result = calculated == num;


        } // else sonu
        System.out.println("Calculated: " + calculated);
        return result;

    } // method sonus
}

