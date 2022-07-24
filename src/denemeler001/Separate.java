package denemeler001;

public class Separate {
    public static void main(String[] args) {
        String input = "Ali\n" +
                "Ali Can\n" +
                "Veli Can Han\n" +
                "Kemal Can Tan Kuzu\n" +
                "Kemal Can Tan Han Kuzu\n" +
                "Kemal Can Tan Han Man Kuzu";
        System.out.println(input);
        String temp = "";
        String[] lines = input.split("\n");
        String[] yedekLines = lines;
        for (String line : lines) {
            String[] dizi = line.split(" ");
            for (int i = 0; i < dizi.length / 2; i++) {
                if (dizi.length >= 4 && i > 0 && i < dizi.length - 1) {
                    temp = dizi[i];
                    dizi[i] = dizi[dizi.length - 1 - i];
                    dizi[dizi.length - 1 - i] = temp;
                }
            }
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i] + " ");
            }
            System.out.println("");
        }
    }
}
