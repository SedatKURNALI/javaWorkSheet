package CalismaSorulari01.oca11;

import java.util.Arrays;

public class Q20 {
    /*
     [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

    Beklenen Ç?kt?:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
     */
    public static void main(String[] args) {
        int[] arr1 = {1232, 1134, 2345, 1022};
        String[] arr2 = {"C Programming", "Java", "C++", "Python", "C#", "PHP",};

        int temp = 0;
        String temp2 = "";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j < arr2.length; j++) {
                if (arr2[i].compareToIgnoreCase(arr2[j]) < 0) {
                    temp2 = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp2;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
