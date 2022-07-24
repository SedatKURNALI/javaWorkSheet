package ElifHoca_JavaPractice.day5_practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {


    /* Interview Question
     Write a Java program to reverse a string. Use for loop and create a method called
      reverseString */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yazi giriniz : ");
        String yazi = scan.nextLine();
        reverseString(yazi);
    }

    private static void reverseString(String ters) {
        String reverse = "";

        for (int i = ters.length() - 1; i >= 0; i--) {
            reverse += ters.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
