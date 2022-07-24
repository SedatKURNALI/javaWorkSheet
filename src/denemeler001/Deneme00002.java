package denemeler001;

import java.util.Arrays;

public class Deneme00002 {
    public static void main(String[] args) {
        //bir string olusturun,bu string'deki character'leri for-each loop kullanarak yazdirin
        //ip ucu:split()
        String str = " Java cok zor, ogrenese kadar";
        String arr1[] = str.split("");
        for (String each : arr1) {
            System.out.print(each + " ");
        }
    }
}
