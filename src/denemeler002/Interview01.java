package denemeler002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview01 {
    public static void main(String[] args) {
        /*
            If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
            type a program to create a new array whose elements are like
            { 3, 5+1, 2+7+9, 2+3+5+7 }
            Verilen bir aray?n elemanlar?n?n ard???k artan toplam?n? hesaplay?p
            yeni bir array'a atayan bir program cretae ediniz..
            input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
            output : { 3, 5+1, 2+7+9, 2+3+5+7 }
        */
        int[] input = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        List<Integer> out2 = new ArrayList<>();

        int count = 0;
        int temp = 0;
        int i = 0;
        while (i < input.length) {
            temp = 0;
            for (int j = 0; j <= count; j++) {
                temp = temp + input[i];
                i++;
            }
            out2.add(temp);
            count++;
        }
        int[] output = new int[out2.size()];
        for (int j = 0; j < out2.size(); j++) {
            output[j] = out2.get(j);
        }
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(output));
        System.out.println(out2);
    }
}
