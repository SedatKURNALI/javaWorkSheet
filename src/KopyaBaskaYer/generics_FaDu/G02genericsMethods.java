package generics_FaDu;

import java.util.Arrays;

// - Bir Generic (type özgü)  method tanımlanırken metodun return type önüne < T > (angle brackets) konulur.
// - E - Element (used extensively by the Java Collections Framework)
//   K - Key
//   N - Number
//   T - Type
//   V - Value
//   S,U,V etc. - 2nd, 3rd, 4th types kullanılan parametrik veri tipini göstermektedir
// - Method'un  parametre listesinde Generic parametre tipleri kullanılır.
// - Method parametre listeleri bir veya daha fazla olabilir ve virgülle ayrılarak yazılırlar.
// - çoook önemli TRİCKYYY : Parametre tipleri non-primitif olmalıdır.
// - JVM  derleyici, compile aşamasında generic methotu java byte kodlara çevirirken parametre tiplerini
//   kaldırır ve yerine gerçek parametreleri koyar. Bu prosese erasure denilir.


public class G02genericsMethods {

    public static void main(String[] args) {

        Integer intDizi[] = {1, 2, 3, 4, 5, 6, 7};
        Double dbDizi[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character charDizi[] = {'T', 'U', 'N', 'A'};

        System.out.println("*** Generic ***");
        System.out.println("integer dizi: ");
        diziYazdir(intDizi);
        System.out.println("double dizi: ");
        diziYazdir(dbDizi);
        System.out.println("char dizi: ");
        diziYazdir(charDizi);


        System.out.println("**** non-generic method ile 3 sayidan buyugunu bul");
        System.out.println("maxbul(34,35,17) : " + maxBul(34, 35, 17));
        System.out.println("maxbul(23,44,63) : " + maxBul(23, 44, 63));

        System.out.println("**** generic method ile 3 sayidan buyugunu bul");
        System.out.println("maxbul(34,35,17) : " + maxBulGeneric(34, 35, 17));
        System.out.println("maxbul(23.3,45.5,61.1) : " + maxBulGeneric(23.3, 45.5, 61.1));
        System.out.println("maxbul stringler(12,14,17) : " + maxBulGeneric("12", "14", "17"));

    }

    // Generic method declaration: tek parametreli
    public static <T> void diziYazdir(T dizi[]) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    // - Bir Generic (type özgü)  method tanımlanırken metodun return type önüne < T > (angle brackets) konulur.
    // - E - Element (used extensively by the Java Collections Framework)
    //   K - Key
    //   N - Number
    //   T - Type
    //   V - Value
    //   S,U,V etc. - 2nd, 3rd, 4th types kullanılan parametrik veri tipini göstermektedir
    // - Method'un  parametre listesinde Generic parametre tipleri kullanılır.
    // - Method parametre listeleri bir veya daha fazla olabilir ve virgülle ayrılarak yazılırlar.
    // - çoook önemli TRİCKYYY : Parametre tipleri non-primitif olmalıdır.
    // - JVM  derleyici, compile aşamasında generic methotu java byte kodlara çevirirken parametre tiplerini
    //   kaldırır ve yerine gerçek parametreleri koyar. Bu prosese erasure denilir.

    // Ornek 3 tane sayiyi en buyugunu ver.

    // non-generic method ile
    public static int maxBul(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // - Generic veri tipleri sadece non-primitif olabilir.
    // - Binary operatörler (+, -,*, / ,<, >) ise non-primitif veri tiplerinde kullanılamazlar.
    // - Dolayısıyla bir generic metotta karşılaştırma için ne kullanılabilir?
    // - CEVAP: Comparable interface'i kullanılmalı.


    // generic method ile en buyugu bul
    public static <T extends Comparable<T>> T maxBulGeneric(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {  // b obje int degeri ile max obj int degeri farki return eder
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
