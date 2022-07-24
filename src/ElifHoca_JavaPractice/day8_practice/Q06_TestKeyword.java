package ElifHoca_JavaPractice.day8_practice;

public class Q06_TestKeyword {
    /*
   ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
   //ogrencilerin cevaplari
   char[][] answers = {
   {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
   {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
   {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
   {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
   {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
   *
   * // cevap anahtari
   char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

   output:
   1 nolu ogrencinin 7 dogru cevabi var.
   2 nolu ogrencinin 6 dogru cevabi var.
      "           "
      "           "
      "           "
   8 nolu ogrencinin 7 dogru cevabi var.
*/
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        testSonucu(answers, keys);
    }

    private static void testSonucu(char[][] answers, char[] keys) {
        int[] ogrId = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) ogrId[i]++;
            }
        }
        for (int i = 0; i < ogrId.length; i++) {
            System.out.println(i + 1 + " nolu ogrencinin dogru sayisi " + ogrId[i]);
        }
    }


}
