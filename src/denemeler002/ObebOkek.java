package denemeler002;

public class ObebOkek {
    public static void main(String[] args) {
        /*
                obeb ve okek bulma
        */
        int s1 = 10;
        int s2 = 20;
        int obeb = 0;
        int okek;
        int count = s1 < s2 ? s1 : s2;
        System.out.println(count);
        for (int i = 1; i <= count; i++) {
            if (s1 % i == 0 && s2 % i == 0) {
                obeb = i;
            }
        }
        System.out.println("obeb = " + obeb);
        System.out.println("okek = " + (s1 * s2) / obeb);
    }
}
