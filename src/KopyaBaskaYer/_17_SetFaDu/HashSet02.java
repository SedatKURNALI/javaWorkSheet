package _17_SetFaDu;


import java.util.ArrayList;

public class HashSet02 {
    public static void main(String[] args) {
/*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}

    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */

        String str[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};
        ArrayList<String> strList = new ArrayList<>();
        strList=arrToStrMethod(str);

    }

    // Array i Liste cevirip return eden method
    private static ArrayList<String> arrToStrMethod(String[] str) {
        ArrayList<String> temp = new ArrayList<>();
        for (String each:str
             ) {
            temp.add(each);
        }return temp;
    }
}
