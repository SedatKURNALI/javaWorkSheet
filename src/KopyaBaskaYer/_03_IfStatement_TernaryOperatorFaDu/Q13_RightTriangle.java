package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q13_RightTriangle {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 sides of the triangle");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();

        if( (side1*side1+side2*side2==side3*side3)
                || (side2*side2+side3*side3==side1*side1)
                    || (side1*side1+side3*side3==side2*side2)) {
            System.out.println("This is a righr-triangle");
        } else {
            System.out.println("This is not a right-triangle");
        }


    }
}
