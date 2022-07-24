package denemeler001;

import java.util.Arrays;

public class ArrayEkleme {
    public static void main(String[] args) {
        /*Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
                Input1={1,2,3,4}
        Input2={5,6}
        Output={1,2,3,4,5,6}
         */
        int input1[] = {1, 2, 3, 4};
        int input2[] = {5, 6};
        int[] yeniArray = newArray(input1, input2);
        System.out.println("yeniArray = " + Arrays.toString(yeniArray));
    }

    public static int[] newArray(int[] input1, int[] input2) {
        int yedek[] = new int[input1.length + input2.length];
        int index = 0;
        for (int i = 0; i < input1.length; i++) {
            yedek[index] = input1[i];
            index++;
        }
        for (int i = 0; i < input2.length; i++) {
            yedek[index] = input2[i];
            index++;
        }
        return yedek;
    }
}

