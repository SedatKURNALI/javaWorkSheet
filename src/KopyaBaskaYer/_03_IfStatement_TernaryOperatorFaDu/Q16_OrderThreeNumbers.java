package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;
import java.util.Scanner;

public class Q16_OrderThreeNumbers {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int bigNum = 0;
        int smallNum = 0;
        int midNum=0;

        // en buyuk kenari bulma
        if(num1>num2 && num1>num3) {
            bigNum=num1;
        }
        else if (num2>num1 && num2>num3) {
            bigNum=num2;
        }
        else {
            bigNum=num3;
        }

        // en kucuk kenari bulma
        if (num1<num2 && num1<num3) {
            smallNum = num1;
        }
        else if (num2<num1 && num2<num3) {
            smallNum = num2;
        }
        else {
            smallNum = num3;
        }

        // orta kenari bulma

        if(num1>smallNum && num1<bigNum) {
            midNum = num1;
        } else if (num2>smallNum && num2<bigNum) {
            midNum = num2;
        } else {
            midNum = num3;
        }

        System.out.println("Big :" + bigNum);
        System.out.println("Medium : " +midNum);
        System.out.println("Small :" + smallNum);



        // HOCANIN COZUMU

        System.out.println("******HOCA NIN COZUMU******");


        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " en buyuk sayidir");

            if (num2 > num3) {
                System.out.println(num3 + " en kucuk sayidir");
            } else {
                System.out.println(num2 + " en kucuk sayidir");
            }
        } else if (num2 > num1 && num2 > num3) {

            System.out.println(num2 + " en buyuk sayidir");

            if (num1 > num3) {
                System.out.println(num3 + " en kucuk sayidir");
            } else {
                System.out.println(num1 + " en kucuk sayidir");
            }

        }
        else if (num3 > num1 && num3 > num2) {

            System.out.println(num2 + " en buyuk sayidir");

            if (num1 > num2) {
                System.out.println(num2 + " en kucuk sayidir");
            } else {
                System.out.println(num1 + " en kucuk sayidir");
            }

        }
        else {
            System.out.println("Girdiginiz Sayilar Esittir");
        }

        
    }
}

