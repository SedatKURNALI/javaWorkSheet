package ElifHoca_JavaPractice.day7_practice;

public class Q03_MDArrayFoereachReturn {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        System.out.println("ciftleriTopla(arr) = " + ciftleriTopla(arr));

    }

    public static int ciftleriTopla(int[][] arr) {
        int toplam = 0;
        for (int[] each : arr) {
            for (int w : each) {
                if (w % 2 == 0) {
                    toplam += w;
                }
            }
        }


        return toplam;
    }
}
