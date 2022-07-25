package _14_EncapsulationFaDu.Q01;

public class ArabaMain {
    public static void main(String[] args) {


        Araba honda = new Araba(); // parametresiz obje create ettik
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setMotor(1600);
        honda.setRenk("kirmizi");


        Araba toyota = new Araba("avensis","beyaz", 300,-2020); // parametreli obje create ettik
        Araba volvo = new Araba("s80","fume", 2400,2010); // parametreli obje create ettik
        Araba haciMurat = new Araba("","",1200,1974);

        System.out.println("Honda: "+honda); // toString methodu olmazsa bu obje referans degeri print eder
        System.out.println("Volvo: "+volvo); // Araba{model='s80', renk='fume', motor=2400, yil=2010}
        System.out.println("Sectiginiz arac toyota -> "+" modeli : "+toyota.getModel()+
                " renk : "+toyota.getRenk()+" motor: "+toyota.getMotor()+ " yil : "+toyota.getYil());





    }
}
