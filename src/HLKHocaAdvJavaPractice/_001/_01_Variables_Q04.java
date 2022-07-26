package HLKHocaAdvJavaPractice._001;

public class _01_Variables_Q04 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);         //
        System.out.println("i = " + i++);       //

        System.out.println("i = " + i);         //
        System.out.println("i = " + ++i);       //

        System.out.println("i = " + i);         //
        System.out.println(++i + i++ + ++i);    //

        System.out.println("i = " + i);         //

        int a = 5;
        System.out.println("son hali :" + (a++ + ++a));   //
        System.out.println("a = " + a); //

        int b = 10;
        System.out.println("son hali :" + (++b + b++));   //
        System.out.println("b = " + b); //

        int x = 20;
        int y = 15;

        System.out.println(++x + --y);  //
        System.out.println(x);          //
        System.out.println(y);          //


        System.out.println(++x + --y);  //
        System.out.println(x);          //
        System.out.println(y);          //

        System.out.println(x++ + y--);  //
        System.out.println(x);          //
        System.out.println(y);          //


    }
}
