package HLKHocaAdvJavaPractice._001;

public class _01_Variables_Q03 {
    public static void main(String[] args) {
        /*
            verilen 12345 say?s?n?n rakamlar?n? yukar?dan a?a??ya do?ru yazd?r?n?z
            ex: input:
		    output: 1
		            2
		            3
		            4
		            5
        */
        int sayi = 12345;
        int birler = sayi % 10;
        sayi = sayi / 10;
        int onlar = sayi % 10;
        sayi = sayi / 10;
        int yuzler = sayi % 10;
        sayi = sayi / 10;
        int binler = sayi % 10;
        sayi = sayi / 10;
        int onbinler = sayi % 10;

        System.out.println(onbinler);
        System.out.println(binler);
        System.out.println(yuzler);
        System.out.println(onlar);
        System.out.println(birler);

    }
}
