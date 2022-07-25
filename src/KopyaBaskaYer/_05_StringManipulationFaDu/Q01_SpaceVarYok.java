package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Scanner;

public class Q01_SpaceVarYok {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen bir text giriniz : ");
        String text = scan.nextLine();

        String sonuc = text.indexOf(" ")>0 ? "Girdiginiz text de bosluk vardir": "Girdiginiz text de bosluk yoktur";
        System.out.println(sonuc);

    }
}

