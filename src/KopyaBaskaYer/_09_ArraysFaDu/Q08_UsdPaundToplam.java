package KopyaBaskaYer._09_ArraysFaDu;

import java.util.Arrays;

public class Q08_UsdPaundToplam {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";


        // String i Array a donusturelim
        String arr[] = str.split(" ");

        System.out.println(Arrays.toString(arr));

        // $ isareti olanlari toplatalim
        String usd = "";
        int toplamUsd = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].contains("$")) {
                usd = arr[i].replace("$","");
                toplamUsd+=Integer.valueOf(usd);
            }

        }
        System.out.println("$ olanlarin toplami : "+toplamUsd);

        // £ isareti olanlari toplatalim
        String paund="";
        int topamPaund=0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i].contains("£")) {
                paund = arr[i].replace("£","");
                topamPaund+=Integer.valueOf(paund);
            }

        }
        System.out.println("£ olanlarin toplami : "+topamPaund);
    }
}


