package _09_ArraysFaDu;

public class Q16_StringdekiDigitleriTopla {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "ade1r4d3";
        System.out.println(digitleriToplaMethodu(str));

    }

    private static int digitleriToplaMethodu(String str) {

        String strArray[] = str.split("");
        int toplam = 0;
        for (int i = 0; i < strArray.length; i++) {
            if(Character.isDigit(strArray[i].charAt(0))) {
                toplam+=Integer.valueOf(strArray[i]);
            } else {
                toplam=toplam;
            }
        }

        return toplam;
    }


}

