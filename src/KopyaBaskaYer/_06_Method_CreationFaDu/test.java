package KopyaBaskaYer._06_Method_CreationFaDu;

public class test {
    public static void main(String[] args) {

        int toplam = 0;
        toplam = sayilariTopla(5, 4);
        System.out.println(toplam);
    }

    private static int sayilariTopla(int a, int b) {
        int c = a + b;
        return c;
    }
}

