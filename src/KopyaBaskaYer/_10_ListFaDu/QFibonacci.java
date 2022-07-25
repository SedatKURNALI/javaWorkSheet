package _10_ListFaDu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {

     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci dizisi olusturmak istediginiz son sayi : ");
        int num = scan.nextInt();
        List<Integer> fibonacciDizisi = new ArrayList<>();
        fibonacciDizisi = fibonacci(num);
        System.out.println(fibonacciDizisi);

    }

    private static List<Integer> fibonacci(int num) {
        List<Integer> fibonacciDizisi = new ArrayList<>();
        int i = 2;

        fibonacciDizisi.add(1);
        fibonacciDizisi.add(1);

        while (fibonacciDizisi.get(i - 1) < num) {

            if ((fibonacciDizisi.get(i - 2) + fibonacciDizisi.get(i - 1)) < num) {
                fibonacciDizisi.add(fibonacciDizisi.get(i - 2) + fibonacciDizisi.get(i - 1));
                i++;
            } else {
                break;
            }

        }

        return fibonacciDizisi;
    }


}
