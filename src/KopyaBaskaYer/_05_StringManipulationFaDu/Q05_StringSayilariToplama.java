package KopyaBaskaYer._05_StringManipulationFaDu;

public class Q05_StringSayilariToplama {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
        String str1 = "$13.99";
        String str2 = "$10.55";

        double price1 = Double.valueOf(str1.substring(1));
        double price2 = Double.valueOf(str2.substring(1));
        System.out.println(str1+" + "+str2+" = "+"$"+(price1+price2));

        // HOCANIN COZUMU
        System.out.println("*****HOCANIN COZUMU******");
        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);
        double sonuc= (str1Sayi+str2Sayi)/100;
        System.out.println("Verilen String sayilarin toplami : $"+sonuc);


    }
}
