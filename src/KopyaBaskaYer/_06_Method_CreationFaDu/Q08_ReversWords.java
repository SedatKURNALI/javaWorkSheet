package KopyaBaskaYer._06_Method_CreationFaDu;

import java.util.Scanner;

public class Q08_ReversWords {
    /*
      TASK :
      Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
      String parametreli return type li reverseWord isminde bir method create ediniz

       Test Data :
      İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
      Output : versin açıklığı zihin arkadaşlara Javacı Allah
       */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle giriniz : ");
        String str = scan.nextLine();

        String tersStr = reverseWord(str);
        System.out.println(tersStr);
    }

    private static String reverseWord(String str) {
        String tersStrEkle = ""; // bu kelimeleri ekeleyecegimiz variable

        // metinin son karakterinden geriye dogru bosluk bulana kadar devam ediyoruz.
        // ilk bosluk buldugumuzda bosluktan sonrki ifadeyi bos olusturdugumuz stringe ekliyoruz
        // daha sonra stringden bosluktan sonraki kısmı atarak ilerliyoruz.

        for(int i = str.length()-1; i>=0 ; i--) {
            if(str.substring(i,i+1).equals(" ")) {
            tersStrEkle=tersStrEkle+str.substring(i+1)+" ";
            str=str.substring(0,i);
            }
            if (i==0){
            tersStrEkle=tersStrEkle+ str.substring(i);
            }
        }


        return tersStrEkle;
        // ilk bosluktan sonrakileri aliyor sonuna da ilk kelimeleyi manuel ekliyoruz.

    }

}
