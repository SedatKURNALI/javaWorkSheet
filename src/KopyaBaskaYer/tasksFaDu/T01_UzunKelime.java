package KopyaBaskaYer.tasksFaDu;

import java.util.Scanner;

public class T01_UzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        // kullanicidan cumleyi alalim
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter a sentence including a few words : ");
        String wordsArr[] = scan.nextLine().split(" ");

        System.out.println("The longest word is: "+findLongestWord(wordsArr));



    }

    private static String findLongestWord(String[] wordsArr) {
        String longestWord = "";
        int maxLetterNumbers=0;

        for (int i = 0; i < wordsArr.length ; i++) {
            if(wordsArr[i].length()>maxLetterNumbers) {
                maxLetterNumbers=wordsArr[i].length();
                longestWord=wordsArr[i];
            }
        }

        return longestWord;
    }


}
