package KopyaBaskaYer.generics_FaDu;

public class G07genericInterface {  // Main class (public ve inner degil)
    public static void main(String[] args) {

        UsAlanClass<Float> floatUsAlma = new UsAlanClass<>();
        System.out.println("floatUsAlma.usAl(4f,3f) = " + floatUsAlma.usAl(4f, 3f));

        UsAlanClass<Double> doubleUsAlma = new UsAlanClass<>();
        System.out.println("doubleUsAlma.usAl(2.3,3.4) = " + doubleUsAlma.usAl(2.3, 3.4));

        UsAlanClass<Integer> integerUsAlma = new UsAlanClass<>();
        System.out.println("integerUsAlma.usAl(3,5) = " + integerUsAlma.usAl(3, 5));


    }
}

interface MathIslem <T extends Number> { // generic interface data type Number olarak bounded type paramter create edildi.
    double usAl(T taban, T us); // abs double parameter generic method

}

class UsAlanClass <T extends Number> implements MathIslem<T> {
    // Generic interface den implement edilen generic Class create edildi.


    @Override
    public double usAl(Number taban, Number us) {
        // return Math.pow((Double) taban,us); cast edebiliriz veya asagidaki gibi
        return Math.pow(taban.doubleValue(),us.doubleValue());

        // pow methodu parametre olarak double data type kullandigi icin
        // ya casting yapmamiz gerekiyordu ya da taban.doubleValue() ile double a cevrildi.

    }
}
