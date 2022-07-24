package ElifHoca_JavaPractice.day4_practice;

import java.util.Scanner;

public class Q03_MethodCreation {
    /*
           Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
           0-1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("47 den kucuk bir sayı giriniz");
        int sayi = scan.nextInt();
        fibonacci(sayi);
    }

    private static void fibonacci(int sayi) {
        int sayi1 = 0, sayi2 = 1, sayi3 = 0;
        if (sayi < 47) {
            for (int i = 1; i <= sayi; i++) {
                System.out.print(sayi1 + " ");
                sayi1 = sayi2 + sayi3;
                sayi2 = sayi3;
                sayi3 = sayi1;
            }
        } else {
            System.out.println("47 den kucuk bir sayı giriniz");
        }
    }
}
