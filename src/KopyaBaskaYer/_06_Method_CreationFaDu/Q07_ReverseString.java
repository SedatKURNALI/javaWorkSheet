package KopyaBaskaYer._06_Method_CreationFaDu;

public class Q07_ReverseString {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
    public static void main(String[] args) {
        String input = "Abcd fsdfs dfs 1234";
        reverseString(input);
    }

    private static void reverseString(String input) {
        String tersString ="";
        for(int i=input.length()-1; i>=0; i--) {
         tersString+=input.charAt(i);
        }
        System.out.println(tersString);
    }


}
