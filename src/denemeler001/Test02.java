package denemeler001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int[] dizi = {4, 4, 6, 2,  3, 678};
        String yeni = "";
        String sonuc = yediVarMi(dizi, yeni);

    }

    public static String yediVarMi(int[] dizi, String yeni) {

        for (int i = 0; i < dizi.length; i++) {
            yeni += dizi[i];
        }
        if (yeni.contains("7")) {
            System.out.println("Boom!");
        } else {
            System.out.println("dizide 7 rakami yok");
        }

        return yeni;
    }
}