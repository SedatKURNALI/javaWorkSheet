package KopyaBaskaYer._05_StringManipulationFaDu;

public class Q09_KelimeninYarisi {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin
				bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        String kelime = "BASARISIZLIK";

        if(kelime.length()%2==0) {
            System.out.println(kelime.substring(0,kelime.length()/2));
        } else {
            System.out.println(kelime);
        }

       // System.out.println("Giriline Kelime : "+kelime);
       // System.out.println("Kelimenin Yarisi : "+kelime.substring(0,kelime.length()/2));kelime.substring(kelime.length()-2);

    }
}
