package KopyaBaskaYer._09_ArraysFaDu;

public class Q04_SayiCiftleri {

    public static void main(String[] args) {
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;

        sayiCiftleri (arr,istenenToplam);



    }

    private static void sayiCiftleri(int[] arr, int istenenToplam) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==istenenToplam) {
                    System.out.print(arr[i]+","+arr[j]+"\n");
                }

            }

        }System.out.println();
    }

}
