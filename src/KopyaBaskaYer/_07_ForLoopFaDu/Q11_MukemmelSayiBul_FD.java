package KopyaBaskaYer._07_ForLoopFaDu;

public class Q11_MukemmelSayiBul_FD {
    public static void main(String[] args) {

        // 1 den baslayip int max degere kadar mukemmel sayilari bulan
        // bir kod yazalim

        int maxSayi = Integer.MAX_VALUE;
        int toplam = 0;
        int sayi = 1;
        int mukemmelKontrol = 0;

        for (int i = 6; i < maxSayi ; i++) {
            mukemmelKontrol= mukemmelSayi(i);
            if (mukemmelKontrol==1) {
                System.out.println(i);
            }
        }



    }

    private static int mukemmelSayi(int sayi) {

        int toplam = 0;

        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0) {
                toplam+=i;
            } else {
                toplam=toplam;
            }
        }

        if(sayi==toplam) {
            return 1;
        } else {
            return 0;
        }
    }
}
