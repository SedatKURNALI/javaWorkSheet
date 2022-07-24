package ElifHoca_JavaPractice.day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_UniqeArray {
    public static void main(String[] args) {

        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */
        int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        List<Integer> tekrarsiz = new ArrayList<>();
        for (int each : arr) {
            if (!tekrarsiz.contains(each)) {
                tekrarsiz.add(each);
            }
        }
        System.out.println("Ilk Hali :" + Arrays.toString(arr));
        System.out.println("Son Hali :" + tekrarsiz);
    }
}