package KopyaBaskaYer._06_Method_CreationFaDu;

public class Q01_IlkIkiKarakter {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        String str = "goat";
        System.out.println("Girilen str : "+str);

        String strGelen = strMethod(str);
        System.out.println("Gelen str : "+strGelen);

    }

    private static String strMethod(String str) {
       String strGonder="";
        if (str.substring(0, 1).equalsIgnoreCase("g") && str.substring(1, 2).equalsIgnoreCase("h")) {
            strGonder=str;
        } else if (str.substring(0,1).equalsIgnoreCase("g")) {
            strGonder=str.substring(0,1)+str.substring(2);
        } else if (str.substring(1,2).equalsIgnoreCase("h")) {
            strGonder=str.substring(1,2)+str.substring(2);
        } else {
            strGonder=str.substring(2);
        }

        return strGonder;
    }


}

