package _10_ListFaDu;

public class Q07_ArraySimetrikmi {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr1[] = {5,1,2,3,4,4,3,2,1,5};
        boolean sonuc = aynaMi(arr1);
        if(sonuc==true) {
            System.out.println("Verilen Array Simetriktir");
        } else {
            System.out.println("Verilen Array Simetrik Degildir");
        }



    } // main method sonu

    private static boolean aynaMi(int[] arr1) {
        boolean sonuc = false;

        if(arr1.length%2==0 && arr1.length>2) {
            int midPoint = arr1.length/2;
            for (int i = 0; i < midPoint; i++) {
                for (int j = arr1.length-1; j >=midPoint ; j--) {
                    if(arr1[i]==arr1[j]) {
                        sonuc = true;
                    }
                }

            }


        } else {
            sonuc = false;
        }

        return sonuc;
    } // aynaMi method sonu

}
