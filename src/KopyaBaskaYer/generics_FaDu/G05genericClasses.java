package generics_FaDu;

public class G05genericClasses { // non-generic Main class

    public static void main(String[] args) {

        VeriSakla<String> data1 = new VeriSakla<>("Suat Basaran ama yavas basaran");
        // generic class dan String data tipinde bir obje create edildi.

        VeriSakla<Integer> data2 = new VeriSakla<>(1453);
        // generic class dan Integer data tipinde bir obje create edildi.

        VeriSakla<Double> data3 = new VeriSakla<>(19.05);
        // generic class dan Double data tipinde bir obje create edildi.

        // VeriSakla generic pojo class dan create edilen obj (data1, data2, data3) encap get() ile print edildi.
        System.out.println("data1.getData() = " + data1.getData());
        System.out.println("data2.getData() = " + data2.getData());
        System.out.println("data3.getData() = " + data3.getData());

        // VeriSakla generic pojo class dan create edilen obj (data1, data2, data3) dataPrint non-generic
        // class dan call edilen generic method ile print edildi..
        DataPrint.yazdir(data1.getData());
        DataPrint.yazdir(data2.getData());
        DataPrint.yazdir(data3.getData());

    }
}

// /Generic Pojo Class
class VeriSakla<T> {
    // 1- variable
    private T data;

    // 2- Constructor
    public VeriSakla(T veri) { // parametreli generic constructor
        this.data = veri;
    }

    // 3- getter setter
    public T getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }
}

// Non-Generic Class içinde Generic Method
class DataPrint {

    public static <T> void yazdir(T veri) { // parametreli generic method create edildi.
        System.out.println("veri = " + veri);
    }

}