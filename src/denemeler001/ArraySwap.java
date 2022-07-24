package denemeler001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySwap {
    public static void main(String[] args) {
        /*
            Create a 10-element list. Swap the 8th element with the 3rd element.
            INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
            Output:
            [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
        */
        String temp = "";
        String[] names = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
        System.out.println(Arrays.toString(names));
        temp = names[2];
        names[2] = names[7];
        names[7] = temp;
        System.out.println(Arrays.toString(names));

        List<String> input=new ArrayList<>();
        input.add("Umit");
        input.add("Emin");
        input.add("Kemal");
        input.add("Kerem");
        input.add("Taylan");
        input.add("Orhan");
        input.add("Sinan");
        input.add("Furkan");
        input.add("Ahmet");
        input.add("Ali");
        System.out.println(input);
        temp = input.get(2);
        input.set(2,input.get(7));
        input.set(7,temp);
        System.out.println(input);
    }
}
