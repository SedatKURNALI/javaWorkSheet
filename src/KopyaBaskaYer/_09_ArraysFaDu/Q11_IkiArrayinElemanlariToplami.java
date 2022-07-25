package _09_ArraysFaDu;

public class Q11_IkiArrayinElemanlariToplami {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
        int arr1[][] = { {1,2}, {3,4,5}, {6} };
        int arr2[][] = { {7,8,9}, {10,11}, {12} };

        // ilk array in elemanlari toplami :
        int arr1Toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                arr1Toplam+=arr1[i][j];
            }

        }

        // İkinci array in elemanlari toplami :
        int arr2Toplam = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                arr2Toplam+=arr2[i][j];
            }

        }

        System.out.println("Array1 in elemanlari toplami : "+arr1Toplam);
        System.out.println("Array2 in elemanlari toplami : "+arr2Toplam);
        System.out.println("Arraylerin elemanlari toplami : "+(arr1Toplam+arr2Toplam));
    }

}
