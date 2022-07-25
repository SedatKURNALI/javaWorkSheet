package generics_FaDu;

import java.util.Arrays;

public class G01overloadingMethods {

    public static void main(String[] args) {

        Integer intDizi[] = {1,2,3,4,5,6,7};
        Double dbDizi[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character charDizi[] = {'T','U','N','A'};

        System.out.println("*** Array yazdiralim ***");
        System.out.println("*** Generic ***");
        System.out.println("integer dizi: ");
        diziYazdir(intDizi);
        System.out.println("double dizi: ");
        diziYazdir(dbDizi);
        System.out.println("char dizi: ");
        diziYazdir(charDizi);

        System.out.println("*** Super Object Class ****");
        diziYazdirObject(intDizi);
        diziYazdirObject(dbDizi);
        diziYazdirObject(charDizi);

    }

    // 1- Overloaded methods
    public static void diziYazdir(Integer dizi[]) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    public static void diziYazdir(Double dizi[]) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    public static void diziYazdir(Character dizi[]) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    // 2- Obje yazdiralim

    // Object class daki datalarin datatype lari farkli oldugu icin
    // bu veriler alinirken casting yapilmazsa CTE Throw olusur
    public static void diziYazdirObject(Object dizi[]) {
        Arrays.stream(dizi).forEach(System.out::println);
    }



}
