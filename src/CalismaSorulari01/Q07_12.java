package CalismaSorulari01;

import java.util.Scanner;

public class Q07_12 {
    public static void main(String[] args) {
        /*
            Ask user to type a name,
            the length of name should be 3.
            Then check if the name has same characters.
            If the String has same characters
            Print “String has duplicate characters” Else
            Print “String has unique characters”
            Please use ternary.
            Input :
            ala
            OutPut:
            String has duplicate characters
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a name: ");
        String name = scan.nextLine();
        System.out.println(name.substring(0, 1).equals(name.substring(1, 2)) || name.substring(0, 1).equals(name.substring(2)) || name.substring(1, 2).equals(name.substring(2)) ? "String has duplicate characters" : "String has unique characters");

    }
}
