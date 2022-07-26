package KopyaBaskaYer._17_SetFaDu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Ex03 {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {

        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();
        Set<Integer> arrSet1 = new TreeSet<>();
        ArrayList<Integer> arrList3 = new ArrayList<>();

        int min = 0; // random min
        int max=11; // random max
        int size=30; // list size

        // arraylist in icini dolduralim
        arrList1=arrListEkle(arrList1,min,max,size);
        System.out.println("1- ArrayList e randonlar eklenince    : "+arrList1);

        // arraylist den dubliceleri silelim
        arrList2=arrList1RemDub(arrList1);
        System.out.println("2- ArrayList den dublikeler silinince : "+arrList2);

        // ilk arraylist i set e cevirelim
        arrSet1=arrListSeteCevir(arrList1,arrSet1);
        System.out.println("3- ArrayList1 i Set'e cevrilince      : "+arrSet1);

        // set i arraylist e cevirelim
        arrList3=setArrayListYap(arrSet1);
        System.out.println("4- ArraySet1 i ArrayList'e cevrilince : "+arrList3);


    }

    // arrSet1 i  ArrayListe cevirelim e cevirelim
    private static ArrayList<Integer> setArrayListYap(Set<Integer> arrSet1) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (Integer each:arrSet1
             ) {
            temp.add(each);
        }
        return temp;
    }

    // arrList1 i Set e cevirelim
    private static Set<Integer> arrListSeteCevir(ArrayList<Integer> arrList1, Set<Integer> arrSet1) {
        for (Integer each: arrList1
        ) {
            arrSet1.add(each);
        }

        return arrSet1;
    }



    // arrList1 deki dublike eden elemanlari silme methodu
    private static ArrayList<Integer> arrList1RemDub(ArrayList<Integer> arrList1) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arrList1.size(); i++) {
            if(!temp.contains(arrList1.get(i))) {
                temp.add(arrList1.get(i));
            }

        }
        return temp;

    }


    // arrList1 in icin random sayilar uretip icini dolduralim
    private static ArrayList<Integer> arrListEkle(ArrayList<Integer> arrList1, int min, int max, int size) {
        for (int i = 0; i < size; i++) {
            arrList1.add((int) (Math.random() * (max - min)) + min);
        }
        return  arrList1;
    }





}

