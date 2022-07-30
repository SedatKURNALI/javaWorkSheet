package denemeler002;

public class VizeFinalButunleme {
    public static void main(String[] args) {
        /*
            Java dersine giren 10 ki?ilik bir s?n?ftaki ö?rencilerin isimleri, vize - final notlar?
            ve proje Notlar? üç ayr? dizide tutulmaktad?r.
            Not: dizilerdeki index numaras? ayn? olan elemenlar ayn? ki?iye ait bilgileri temsil etmektedir.
            String isimler[]={"Adem","Emsal","Ay?e","Yasemin","Gül?ah","Hüseyin","Birol","Cihan","Hatice","Selim"}
            int vizeFinalNotu[][]={{65,85},{75,90},{92,55},{68,72},{68,75},{75,55},{85,90},{65,56},{55,88},{72,86}}
            int projeNotu[]={100,50,0,50,68,78,85,90,98,100};
              ?STENEN - I - Vize Notunun %30'u , Final notunun % 50'si, Proje Notunun %20'si al?narak ders notu ortalamas? bulunacak
              ve "ortalamaNotu" adl? dizide saklanacakt?r.
                 Örnek :Vize ve Final Notu : 65,85; Proje notu : 100  olan bir ö?rencinin ortalama Notu ==> 65*0,3 + 85*0,5 + 80*0,2 = 78
              ?STENEN - II - Tüm s?n?f?n vize, Final, Proje ve Ortalama notlar?n? alt alta s?ralay?n.
              Örnek : JAVA 82 SINIFININ NOT L?STES?
                        Adi         Vize    Final   Proje   Ort
                        Adem		65		85		100		82.0
                        Emsal		75		90		50		77.5  .. gibi
              ?STENEN - III - S?n?f?n A??rl?kl? not ortalamas?n? bulun ve yazd?r?n; ( Tüm ö?rencilerin ortalamas?n?n, ö?renci say?s?na bölünmesi ile bulunur. )
                 Örnek : Java 82 s?n?f?n?n A?r?rl?kl? Not Ortalamas? : 73.58 gibi
             ?STENEN - IV - A??rl?kl? S?n?f Not Ortalamas?ndan daha dü?ük not ortalamas?na sahip ki?ileri
              BÜTÜNLEMEYE GELECEK Ö?RENC?LER ?eklinde isimleri ve kar??lar?na not ortalamalar? gelecek ?ekilde
                Örnek : BÜTÜNLEMEYE KALAN Ö?RENC?LER
                        Ad?                 Ortalamas?
                        Ay?e		        55.099999999999994
                        Yasemin		        66.4   ... gibi
        */
        String isimler[] = {"Adem", "Emsal", "Ay?e", "Yasemin", "Gül?ah", "Hüseyin", "Birol", "Cihan", "Hatice", "Selim"};
        int vizeFinalNotu[][] = {{65, 85}, {75, 90}, {92, 55}, {68, 72}, {68, 75}, {75, 55}, {85, 90}, {65, 56}, {55, 88}, {72, 86}};
        int projeNotu[] = {100, 50, 0, 50, 68, 78, 85, 90, 98, 100};
        double[] ort = new double[isimler.length];
        double sinifNotOrtalamasi = 0;
        System.out.println("JAVA 82 SINIFININ NOT LISTESI");
        System.out.println("Adi         Vize    Final   Proje   Ort");
        for (int i = 0; i < ort.length; i++) {
            ort[i] = (vizeFinalNotu[i][0] * 0.3 + vizeFinalNotu[i][1] * 0.5 + projeNotu[i] * 0.2);
            sinifNotOrtalamasi += ort[i];
            System.out.println(isimler[i] + "\t\t" + vizeFinalNotu[i][0] + "\t\t" + vizeFinalNotu[i][1] + "\t\t" + projeNotu[i] + "\t\t" + ort[i]);
        }
        sinifNotOrtalamasi /= ort.length;
        System.out.println("Sinif Not Ortalamasi = " + sinifNotOrtalamasi);
        System.out.println("\nBUTUNLEMEYE KALAN OGRENCILER");
        System.out.println("Adi         Ortalamasi");
        for (int i = 0; i < ort.length; i++) {
            if(sinifNotOrtalamasi>ort[i]) {
                System.out.println(isimler[i] + "\t\t" + ort[i]);
            }
        }
    }
}
