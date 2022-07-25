package KopyaBaskaYer._06_Method_CreationFaDu;

public class Q06_StringdekiKarakterler {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        String input = "aabbcccccddddaaa test cenk selam bdfsd";
        removeDublicates(input);
    }

    private static void removeDublicates(String input) {
        String newStr = "";
        for (int i=0; i<input.length(); i++) {
            if(newStr.indexOf(input.substring(i,i+1))>=0) {
                newStr=newStr;
            } else {
                newStr+=input.charAt(i);
            }
        }
        System.out.println(newStr);
    }


}
