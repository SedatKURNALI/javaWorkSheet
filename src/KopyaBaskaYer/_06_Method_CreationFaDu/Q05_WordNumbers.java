package KopyaBaskaYer._06_Method_CreationFaDu;

public class Q05_WordNumbers {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        String str = "The quick brown fox jumps over the lazy dog";
        kelimeSayiBul(str);



    }

    private static void kelimeSayiBul(String str) {
        String trimOfStr = str.trim(); //basdaki ve sondaki bosluklari kaldirdik
        String sadeceBoslukOfStr = trimOfStr.replaceAll("\\S", ""); // bosluk disindakileri hiclik yaptik
        System.out.println("Verilen text : "+str);
        System.out.println("Girdiginiz ifadedeki kelime sayisi : "+(sadeceBoslukOfStr.length()+1));
    }
}
