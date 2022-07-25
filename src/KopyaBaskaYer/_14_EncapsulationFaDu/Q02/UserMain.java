package _14_EncapsulationFaDu.Q02;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {



    Scanner scan = new Scanner (System.in);
        System.out.print("Enter username and password (keep space between username and password : ");
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");

        if(arr[1].length()<6) {
            System.out.println("your password must be min 6 characters");
            System.out.print("Enter username and password (keep space between username and password : ");
            myStr = scan.nextLine();
            arr = myStr.split(" ");
            User user1 = new User(arr[0],arr[1],true,true);
            System.out.println(user1.toString());

        } else {
            User user1 = new User(arr[0],arr[1],true,true);
            System.out.println(user1.toString());
        }



    }
}
