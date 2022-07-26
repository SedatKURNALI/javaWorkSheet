package KopyaBaskaYer._09_ArraysFaDu;

import java.util.Scanner;

public class Q19_Salyangoz {

    /*  Problem Tanımı
            Verilen boyuttaki bir kare matrisin içerisine salyangoz (helezon) şeklinde
            ardışık sayıları yerleştiriniz.
             ip ucu: maksimum sayınız girilen sayının karesine eşittir.
             Örnek Ekran Çıktıları
            Bir sayi giriniz: 3
            1 2 3
            8 9 4
            7 6 5
            Bir SAyi giriniz : 5
            1  2  3  4  5
            16 17 18 19 6
            15 24 25 20 7
            14 23 22 21 8
            13 12 11 10 9
            Bir sayi giriniz: 4
            1 2 3 4
            12 13 14 5
            11 16 15 6
            10 9 8 7
        */
    public static void main(String[] args) {

        // kaclik matris olacagini kullaniciya soralim
        Scanner scan = new Scanner (System.in);
        System.out.print("Matrisin boyutunu giriniz : ");
        int boyut = scan.nextInt();


        // matrisin govdesini olusturalim
        int[][] matris = new int[boyut][boyut];

        // baslangis noktasi ve toplam variable olusturalim
        int xEksen = 0;
        int yEksen = 0;
        int toplam = 1;

        // hareketi belirlemek icin artim veya azaltim
        boolean artirAzalt = true;

        for (int i = 0; i < boyut; i++){
            matris[xEksen][yEksen] = toplam;
            if (artirAzalt){ // artim yapilacaksa

                while (xEksen + 1 < boyut && matris[xEksen + 1][yEksen] == 0) {
                    toplam++;
                    xEksen++;
                    matris[xEksen][yEksen] = toplam;
                }
                while (yEksen + 1 < boyut && matris[xEksen][yEksen + 1] == 0) {
                    toplam++;
                    yEksen++;
                    matris[xEksen][yEksen] = toplam;
                }
            }
            else{  // azaltim yapilacaksa
                while (xEksen > 0 && matris[xEksen - 1][yEksen] == 0) {
                    toplam++;
                    xEksen--;
                    matris[xEksen][yEksen] = toplam;
                }

                while (yEksen > 0 && matris[xEksen][yEksen - 1] == 0) {
                    toplam++;
                    yEksen--;
                    matris[xEksen][yEksen] = toplam; }
            }
            artirAzalt = !artirAzalt;
        }


        //Matrisi ekrana yazdiralim bakalim ne cikiyor

        for (int i = 0; i < boyut; i++){
            for (int j = 0; j < boyut; j++)
                System.out.print(matris[i][j] + "\t");
            System.out.println();
        }


    }

}
