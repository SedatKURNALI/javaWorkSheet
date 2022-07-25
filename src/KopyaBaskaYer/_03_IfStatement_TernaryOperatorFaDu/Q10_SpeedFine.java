package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q10_SpeedFine {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);

        System.out.print("Do you have driver licence Yes or No :");
        String dl = scan.next();

        if (dl.equalsIgnoreCase("yes") || dl.equalsIgnoreCase("no")) {
            // Ehliyetin varlik yokluk sartina gore diger kosullar calisacak

            if (dl.equalsIgnoreCase("no")) {
                System.out.println("You were fined 200 USD for not having a driving license.");
            }

            System.out.print("Please enter your current speed :");
            int currentSpeed = scan.nextInt();


            int dl_fine = 0;

            // Driver Licence avaliable or not
            if (dl.equalsIgnoreCase("yes")) {
                dl_fine = 0;
            } else if (dl.equalsIgnoreCase("no")) {
                dl_fine = 200;
            } else {
                dl_fine = 0;
            }

            // Fine for speed limit

            if (currentSpeed < 55) {
                System.out.println("Your Current Speed :" + currentSpeed + "\nYour Fine :" + dl_fine);
            } else if (currentSpeed < 75) {
                System.out.println("Your Current Speed :" + currentSpeed + "\nYour Fine :" + (dl_fine + 100));
            } else if (currentSpeed < 85) {
                System.out.println("Your Current Speed :" + currentSpeed + "\nYour Fine :" + (dl_fine + 150));
            } else if (currentSpeed < 95) {
                System.out.println("Your Current Speed :" + currentSpeed + "\nYour Fine :" + (dl_fine + 320));
            } else {
                System.out.println("Your Current Speed :" + currentSpeed + "\nYour Fine :" + (dl_fine + 500));
            }

        } else {
            System.out.println("Driver Licence is invalid"); // Ehliyetin hatali olmasi durumu
        }
    }
}
