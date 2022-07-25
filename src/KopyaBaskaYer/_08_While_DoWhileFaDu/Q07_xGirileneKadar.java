package KopyaBaskaYer._08_While_DoWhileFaDu;

import java.util.Scanner;

public class Q07_xGirileneKadar {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

       */

        char key = 'a';
        String keyStr = "";
        Scanner scan = new Scanner (System.in);
        System.out.print("Herhnagi bir tusa basiniz : ");

       do {
           keyStr = scan.next();
           key=keyStr.charAt(0);
           if(key!='x') {
               System.out.print("bir tusa basiniz : ");
           } else {
               System.out.println("Program bitti");
           }

       }while (key!= 'x');

    }
}
