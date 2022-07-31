package buyukProjeler01.ManavProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavUrun_Nur {

    static List<Double> sepet = new ArrayList<>();
    static List<String> sepetIsim = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {


        String manavUrun[][] = new String[10][2];
        manavUrun[0][0] = "Karpuz";
        manavUrun[0][1] = "9.0 TL";
        manavUrun[1][0] = "Kavun";
        manavUrun[1][1] = "9.0 TL";
        manavUrun[2][0] = "Seftali";
        manavUrun[2][1] = "12.0 TL";
        manavUrun[3][0] = "Erik";
        manavUrun[3][1] = "20.0 TL";
        manavUrun[4][0] = "Patates";
        manavUrun[4][1] = "11.0 TL";
        manavUrun[5][0] = "Ananas";
        manavUrun[5][1] = "25.20 TL";
        manavUrun[6][0] = "Domates";
        manavUrun[6][1] = "13.90 TL";
        manavUrun[7][0] = "Salatalik";
        manavUrun[7][1] = "10.10 TL";
        manavUrun[8][0] = "Marul";
        manavUrun[8][1] = "10.30 TL";
        manavUrun[9][0] = "Havuc";
        manavUrun[9][1] = "12.70 TL";


        System.out.println("Manavimiza Hosgeldiniz");
        for (int i = 0; i < manavUrun.length; i++) {
            System.out.println((i + 1) + " nolu urun : " + manavUrun[i][0] + "  fiyati : " + manavUrun[i][1]);
        }
        System.out.println("Lutfen sepete eklemek istediginiz urunun numarasini yaziniz");
        int urunNo = scan.nextInt();
        System.out.println("Bu üründen kaç kilo alacaks?n?z: ");
        int urunAdet = scan.nextInt();

        sepet.add(Double.parseDouble(manavUrun[urunNo - 1][1].replace(" TL", "")) * urunAdet);
        sepetIsim.add(manavUrun[urunNo - 1][0]);

        System.out.println("Seçti?iniz ürün sepete eklendi");
        System.out.println("sepet: " + sepet.get(0) + "TL" + " " + sepetIsim.get(0) + " " + "aldiniz");

        System.out.println();

        System.out.println("Baska bir urun almak isterseniz click 1");

        int click = scan.nextInt();
        if (click == 1) {
            System.out.println("Lutfen sepete eklemek istediginiz ikinci urunun numarasini yaziniz");

            urunNo = scan.nextInt();

            System.out.println("Bu üründen kaç kilo alacaks?n?z: ");
            urunAdet = scan.nextInt();

            sepet.add(Double.parseDouble(manavUrun[urunNo - 1][1].replace(" TL", "")) * urunAdet);
            sepetIsim.add(manavUrun[urunNo - 1][0]);

            System.out.println("Seçti?iniz ürün sepete eklendi");
            System.out.println("yeni sepet:" + sepet.get(1) + "TL" + " " + sepet.get(0) + " " + "aldiniz");

            double sepettoplam = 0;
            sepettoplam = sepet.get(0) + sepet.get(1);
            System.out.println();
            System.out.println("sepettoplam:" + sepetIsim.get(0) + " + " + sepetIsim.get(1) + " " + sepettoplam + "TL");
            System.out.println("***Tesekkur Ederiz***");
        } else {
            System.out.println(sepet.get(0) + "TL" + "\n Bizi tercih ettiginiz icin tesekkur ederiz ");
        }
    }
}


