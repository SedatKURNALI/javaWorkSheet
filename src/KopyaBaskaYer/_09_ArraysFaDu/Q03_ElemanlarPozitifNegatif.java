package _09_ArraysFaDu;

import java.util.Arrays;

public class Q03_ElemanlarPozitifNegatif {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int arr[] = {1,2,-3,4,-5,-6};

        int arrYeni[] = new int[arr.length];

        arrYeni = isaretDegistir(arr,arrYeni);

        System.out.println("ilk Array : "+ Arrays.toString(arr));
        System.out.println("Yeni Array : "+ Arrays.toString(arrYeni));

    }

    private static int[] isaretDegistir(int[] arr,int[] arrYeni ) {

        for (int i = 0; i < arr.length; i++) {

            arrYeni[i]=arr[i]*(-1);
        }
        return  arrYeni;
    }


}
