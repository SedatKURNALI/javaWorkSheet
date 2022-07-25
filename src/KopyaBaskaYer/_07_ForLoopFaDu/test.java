package KopyaBaskaYer._07_ForLoopFaDu;

public class test {
    public static void main(String[] args) {
        String[] somun = {"m4", "m20", "m6", "m10", "m12", "m5"};
        String[] civata = {"m6", "m4", "m8", "m12", "m10 ", "m20"};
        for (int i = 0; i < somun.length; i++) {
            for (int j = 0; j < civata.length; j++) {
                if (civata[j].contains(somun[i])) {
                    System.out.println(civata[j] + "=olcutlu civata ile " + "," + somun[i] + "=olcutlu somun uyumludur");
                }
            }
        }
    }
}