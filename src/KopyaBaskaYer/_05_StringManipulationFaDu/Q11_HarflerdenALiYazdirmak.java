package KopyaBaskaYer._05_StringManipulationFaDu;

import java.util.Locale;

public class Q11_HarflerdenALiYazdirmak {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

       String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

       int aYer = pickName.indexOf('A');
       int lYer = pickName.indexOf("L");
       int iYer = pickName.indexOf("I");


        System.out.println(

                pickName.charAt(aYer)+ " " +
                pickName.charAt(lYer)+ " " +
                pickName.toLowerCase(Locale.forLanguageTag("tr")).charAt(iYer)
        );










    }

}
