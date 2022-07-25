package generics_FaDu;

public class G04genericClass <T> { // T : type parametric pojo class declaration




    private T ebikGabuk;


    // parametreli constructor
    public G04genericClass(T ebikGabuk) {
        this.ebikGabuk = ebikGabuk;
    }

    // parametresiz constructor
    public G04genericClass() {
        this.ebikGabuk = ebikGabuk;
    }


    // Getter Setter

    public T getEbikGabuk() {
        return ebikGabuk;
    }

    public void setEbikGabuk(T ebikGabuk) {
        this.ebikGabuk = ebikGabuk;
    }


    public static void main(String[] args) {

        G04genericClass<Integer> intEbikGabuk = new G04genericClass<>(1453);
        System.out.println("intEbikGabuk.getEbikGabuk() = " + intEbikGabuk.getEbikGabuk()); // 1453

        G04genericClass<Double> doubleEbikGabuk = new G04genericClass<>(19.91);
        System.out.println("doubleEbikGabuk.getEbikGabuk() = " + doubleEbikGabuk.getEbikGabuk());

        G04genericClass<String> stringEbikGabuk = new G04genericClass<>();
        stringEbikGabuk.setEbikGabuk("selam guzel insan");
        System.out.println("stringEbikGabuk.getEbikGabuk() = " + stringEbikGabuk.getEbikGabuk());


    }


}
