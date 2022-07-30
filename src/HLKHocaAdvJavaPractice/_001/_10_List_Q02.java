package HLKHocaAdvJavaPractice._001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_List_Q02 {
    public static void main(String[] args) {
        /*TASK :
            2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlar? bir
            listeye kopyalayan ve harf s?ras?na göre yazd?ran bir METHOD yaz?n?z.
            Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
               Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
        */
        String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        List<String> list = new ArrayList<>();
        for (String[] ar1 : arr) {
            for (String each : ar1) {
                list.add(each);
            }
        }
      //Collections.sort(list);
        String temp = "";
        for (int j = 0; j < list.size(); j++) {
            for (int i = j; i < list.size(); i++) {
                if (list.get(i).compareToIgnoreCase(list.get(j)) < 0) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("arr = " + Arrays.deepToString(arr));
        System.out.println("list = " + list);

    }
}
