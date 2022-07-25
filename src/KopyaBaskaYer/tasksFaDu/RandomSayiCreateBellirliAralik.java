package KopyaBaskaYer.tasksFaDu;

public class RandomSayiCreateBellirliAralik {
    public static void main(String[] args) {

        int min = 30; // dahil
        int max = 50; // dahil degil
        int randomSayi = (int) (Math.random() * (max - min)) + min;

        System.out.println(randomSayi);


    }
}
