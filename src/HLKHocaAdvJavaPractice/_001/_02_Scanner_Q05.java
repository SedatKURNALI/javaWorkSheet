package HLKHocaAdvJavaPractice._001;

import java.util.Scanner;

public class _02_Scanner_Q05 {
    public static void main(String[] args) {
        /*
            Problem Tan?m?
            Bir dik ??genin iki dik kenar?n? alarak hipoten?s?n? hesaplayan kod yaz?n?z.
            ?rnek Ekran ??kt?s?
            birinci kenar: 12
            ikinci kenar: 5
            hipotenus: 13
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ucgenin a kenar uzunlugunu giriniz: ");
        int a = scan.nextInt();

        System.out.print("Ucgenin b kenar uzunlugunu giriniz: ");
        int b = scan.nextInt();

        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenus: " + h);


    }
}
