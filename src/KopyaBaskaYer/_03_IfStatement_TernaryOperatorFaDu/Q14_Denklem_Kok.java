package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

public class Q14_Denklem_Kok {
    /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        System.out.println("Denklem = ax^2 + bx + c");
        System.out.println("a=5, b=2, c=3");
        int a=2;
        int b=3;
        int c=1;

        int delta = b*b-4*a*c;

        if (delta>0) {
            System.out.println("2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)");
        }
        else if (delta==0) {
            System.out.println("1 tane kök vardır x = -b/2a");
        }
        else {
            System.out.println("kök yoktur");
        }


    }
}
