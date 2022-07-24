package denemeler001;
class A {
    int size;
    A(int s) {
        size = s;
    }
}
public class B {
    public static void main(String[] args) {
        A b1 = new A(5);
        A[] ba = go(b1, new A(6));
        ba[0] = b1;
        for (A b : ba)
            System.out.print(b.size + " ");
    }

    static A[] go(A b1, A b2) {
        b1.size = 4;
        A[] ma = {b2, b1};
        return ma;
    }
}
