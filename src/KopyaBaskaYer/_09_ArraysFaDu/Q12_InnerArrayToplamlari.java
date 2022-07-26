package KopyaBaskaYer._09_ArraysFaDu;

import java.util.Arrays;

public class Q12_InnerArrayToplamlari {

    public static void main(String[] args) {
        //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
        // ve yeni array’i ekrana yazdıran bir program yazınız
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

        int arr[][]= { {1,2,3}, {4,5}, {6,7} };

        // Array deki inner arraylerin toplamlari yazdiracagimiz tek boyutlu bir array olusturuyoruz
        int arr2[] = new int[arr.length];

        // Array deki her bir inner elemanlarin toplami :
        int arrToplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arrToplam+=arr[i][j];
                arr2[i]=arrToplam;
            }
            arrToplam=0; // her inner dan sonra arrToplami 0 liyoruz ki uzerine eklemesin
        }
        System.out.println(Arrays.toString(arr2));
    }
}
