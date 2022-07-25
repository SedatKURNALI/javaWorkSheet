package _14_EncapsulationFaDu.Q01;

public class Araba { // POJO : planning old java object -> modal class

    // 1: POJO class variable larini belirtelim

    private String model;
    private String renk;
    private int motor;
    private int yil;

    // 2: Parametreli ve Parametresiz Constructor lari olusturalim
    public Araba() { // paramatresiz constructor bunu genelde yapiyoruz, bos bir constructor
    }

    public Araba(String model, String renk, int motor, int yil) { // parametreli constructor (bunu yaparsak usttekini hep yapalim
        this.model = model;
        this.renk = renk;
        // this.motor = motor;
        setMotor(motor);
        // this.yil = yil;
        setYil(yil);

    }

    // 3: Getter & Setter asagidakiler getter and setter, variable lar privet oldugundan ulasmak icin
    // ayrica set lerin icine sartlar yazabiliyoruz, encapsulation hatalara karsi
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {

        if(motor<1000) {
            System.out.println("motor hacmmi min 1000cc olmali");
            this.motor = 1200;   // 1000 cc alti motorlari otomatik 1200 cc yapiyor
        } else {
            this.motor = motor;
        }


    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if(yil<0) {
            this.yil=(-1)*yil;  // negatif girilen yillari pozitife cevirir
            System.out.println("Yil negatif olamaz, duzeltildi");
        } else {
            this.yil = yil;
        }


    }

    // 4: toString methodunu yazdiralim, bu bizi rahatlatir sout yaparken
    @Override
    public String toString() {  // bu method bu class'dan create edilen objeleri istenilen
        // String e cevirir ve yazdirir
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
