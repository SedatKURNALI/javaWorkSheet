package _13_StringBuilderFaDu;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */

        // Step1: get a text from user and assign it into userText
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a meaningful text :");
        String userText = scan.nextLine();

        // Step2: create a new StringBuilder from userText
        StringBuilder sbUserText = new StringBuilder(userText);

        // Step3: reverse sbUserText
        sbUserText.reverse();
        System.out.println("The reverse of your text : "+sbUserText);

        // Step4: check the text is palindrome (without case sensitivity)
        // in JAVA String and StringBuilder variables ara totally different
        // so if we want to compare, both of them should be String.

        // converting StringBuilder to String
        String reverseUserText = sbUserText.toString();

        // check palindrome
        System.out.println(userText.equals(reverseUserText) ? true : false);


    }

}
