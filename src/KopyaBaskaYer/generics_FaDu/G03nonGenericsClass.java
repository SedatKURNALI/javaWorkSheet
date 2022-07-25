package generics_FaDu;

import java.util.ArrayList;
import java.util.List;

public class G03nonGenericsClass {



    public static void main(String[] args) {
        /*
        Java5 öncesi (raw list) farklı data type ile çalışılabilir..
        Ancak list elemanlrı alınırken  Cast işlemi
        yapılırken Runtime hatası lama ihtimali yuksektir.
        */
        // List<String> liste = new ArrayList<>(); generic list
        List liste = new ArrayList(); // Java5 oncesi row list
        liste.add("faruk bey");
        liste.add(232342);

        System.out.println(liste);

        String name = (String) liste.get(0); // Object class data type String Class data type a Casting
        int telNo = (int) liste.get(1); // // Object class data type int data type a Casting

        System.out.println("name telNo = " + name + " " + telNo);

        liste.add(20.21);
        // System.out.println((Integer) liste.get(2)); // CTE Vermedi amd RTE ClassCastException verecek


        // Row list yerine Object super Class data type:
        List<Object> objList = new ArrayList<>();
        objList.add("Enes Farruk");
        objList.add(2022);
        objList.add(20000.5);

        String uzman = (String) objList.get(0);
        Integer yil = (Integer) objList.get(1);

        for (Object each:objList
             ) {
            String yazi = (String) each;
            System.out.println(yazi);  // CTE olmaz ama RTE ClassCastException verir.
        }



    }

}
