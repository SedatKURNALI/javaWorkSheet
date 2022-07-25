package generics_FaDu;

public class G06doubleParameterGenerics {
    public static void main(String[] args) {

        EbikGabik<Integer, String> obj1 = new EbikGabik<>(101, "Ahmet Guzel");
        // generic class dan Integer,String data type obje create edildi.

//        EbikGabik<String, String> obj2 = new EbikGabik<>("102", "Suat Bey");
//        EbikGabik<Boolean, String> obj3 = new EbikGabik<>(true, "Ahmet Guzel");
        EbikGabik<Float, String> obj4 = new EbikGabik<>(102f, "Mirac bey");

        System.out.println("obj1.getAnahtar()+\" \"+obj1.getDeger() = " + obj1.getAnahtar() + " " + obj1.getDeger());
        System.out.println("obj4.getAnahtar()+\" \"+obj4.getDeger() = " + obj4.getAnahtar() + " " + obj4.getDeger());

    }
}

// POJO Class
class EbikGabik<K extends Number, V extends String> {  // double parameter generic class,
                                                        // generic data type sinirlari belirliyoruz
    // K: Key
    // V : Value

    /*
        Generic class larda parametre data type sinirlandirilirken istenen data type extend edilir.
        King of Trick: Generic yapilarda data type esnektir,
        Bu isleme PARAMETER BOUNDING denir (Bounded Type Parameters)
     */


    // 1- variebles
    private K anahtar;
    private V deger;

    // 2- Constructor

    public EbikGabik(K anahtar, V deger) { // double parameter generic constructor-> telescopic cons.
        this.anahtar = anahtar;
        this.deger = deger;
    }

    // 3- Getter Setter


    public K getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(K anahtar) {
        this.anahtar = anahtar;
    }

    public V getDeger() {
        return deger;
    }

    public void setDeger(V deger) {
        this.deger = deger;
    }


}
