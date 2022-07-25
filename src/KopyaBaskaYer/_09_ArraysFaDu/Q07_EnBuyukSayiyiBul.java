package _09_ArraysFaDu;

public class Q07_EnBuyukSayiyiBul {

    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 8
         */

        int arr[][] = {{1,2,-3},{41,55},{-61,-17,80}};

        int enBuyukSayi = enBuyukSayiBul(arr);
        System.out.println(enBuyukSayi);



    }

    private static int enBuyukSayiBul(int[][] arr) {
        int enBuyuk = arr[0][0];  // baslangic icin herhangi bir index i belirleyelim
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]>enBuyuk) {
                    enBuyuk=arr[i][j];
                }

            }

        }
        return enBuyuk;
    }
}
