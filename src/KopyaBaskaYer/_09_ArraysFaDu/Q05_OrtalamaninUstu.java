package KopyaBaskaYer._09_ArraysFaDu;

public class Q05_OrtalamaninUstu {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int arr[]= {1,2,3,4,5,6,7};

        ortalamaUstundekiler(arr);




    }

    private static void ortalamaUstundekiler(int[] arr) {

        // toplami bulalim

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }

        // ortalamay bulalaim
        double ortlama = toplam / arr.length;

        // ortalamanin ustundekileri yazdiralim

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ortlama) {

                System.out.print(arr[i]+",");
            }

        }

    }

}


