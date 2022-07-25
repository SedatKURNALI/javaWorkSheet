package KopyaBaskaYer.tasksFaDu;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=scan.nextInt();
        System.out.print("Enter the second number : ");
        int num2=scan.nextInt();

        System.out.println("----- Combination -----");
        System.out.println("C(n,r) = n! / (r!(n-r)!"+ " -> " + "C("+num1+","+num2+") = "+num1+" ! / ("+num2+"!("+num1+"-"+num2+")!"+ " = " +
                (factorialCalculator(num1)/(factorialCalculator(num2)*(factorialCalculator(num1-num2))))
        );
        System.out.println("----- Permutations -----");
        System.out.println("P(n,r) = n! / (n-r)!"+ " -> " + "P("+num1+","+num2+") = "+num1+" ! / ("+num1+"-"+num2+")!"+ " = " +
                (factorialCalculator(num1)/(factorialCalculator(num1-num2)))
        );

    }

    public static int factorialCalculator (int num) {
        int factorialOfNumber = num;

        for (int i = num-1; i >=1 ; i--) {
        factorialOfNumber*=i;
        }

        return factorialOfNumber;

    }


}
