package CalismaSorulari01;

import java.util.Scanner;

public class CalismaSorulariSedat {
    public static void main(String[] args) {
/*
5-----

Scanner scan = new Scanner(System.in);
        int input = 7;
        for (int i = 1; i < input; i++) {
            for (int j = input-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < input-1; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = input-1-i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

A?a??daki elmas deseni görüntüsünü çizen java kodunu yaz?n?z.
    Test Data:
    Yar?m elmas uzunlu?u : 7
    Beklenen Ç?kt?:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
        6b1y
        5b3y
        4b5y
        1b11y
        0b13y

 */
        Scanner scan = new Scanner(System.in);
        int input = 5;
        for (int i = 1; i <= input; i++) {
            for (int j = input - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = input - 1; i >= 1; i--) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
