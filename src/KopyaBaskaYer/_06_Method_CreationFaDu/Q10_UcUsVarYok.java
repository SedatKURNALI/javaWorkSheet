package KopyaBaskaYer._06_Method_CreationFaDu;

import java.util.Scanner;

public class Q10_UcUsVarYok {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tamsayi giriniz : ");
        int input = scan.nextInt();

        boolean ucUssuVarMi = powerOfThree(input);
        System.out.println(ucUssuVarMi);


    }

    private static boolean powerOfThree(int input) {
        boolean varYok = false;

        for (int i = 3; i <= input; i*=3) {

            if(i==input) {
                varYok=true;
            }

        }

        return varYok;
    }


}
