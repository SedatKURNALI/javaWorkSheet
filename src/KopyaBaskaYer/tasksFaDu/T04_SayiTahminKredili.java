package KopyaBaskaYer.tasksFaDu;

import java.util.Scanner;

public class T04_SayiTahminKredili {

    static Scanner scan = new Scanner(System.in);
    static double score = 0;
    static double totalScore = 0;

    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */

        // bilgisayar 1-100 arasinda bir random tamsayi uretsin

        int min = 1; // dahil
        int max = 101; // dahil degil
        int computerNum = (int) (Math.random() * (max - min)) + min;

        System.out.println("********* WELLCOME to GUESS THE NUMBER GAME ***********");
        System.out.print("Guess the number which is selected by computer (1-100)");
        System.out.println("\nYour maximum number of guesses is 10.");

        guessNum(computerNum);





    }

    private static void guessNum(int computerNum) {
        int userNum=0;
        int count = 1;
        System.out.print("Your guess : "+count+"/10: ");
        userNum=scan.nextInt();

        if(userNum<0 || userNum>100)  {
            System.out.println("Please enter a valid number between 1-100");
            guessNum(computerNum);
        } else {

            while (count < 10) {
                if(userNum==computerNum) {
                    score=100/count;
                    totalScore+=score;
                    win(score,count);
                    break;
                } else {
                    count++;

                    if(userNum>computerNum) {
                        System.out.println("guess lower");
                    } else {
                        System.out.println("guess higher");
                    }

                    System.out.print("Your guess : "+count+"/10: ");
                    userNum=scan.nextInt();
                }
            }
            score=0;
            loss(score,count);



        }// else sonu

    }

    private static void loss(double score, int count) {
        System.out.println("YOU LOST THE TAME on your "+count+" .try");
        System.out.println("Your score in this turn : "+score);
        System.out.println("Your total score in this game : "+totalScore);
        score = 0;
        count=0;

        gameStatus();
    }

    private static void win(double score, int count) {
        System.out.println("CONGRATULATIONS YOU WIN THE GAME on your "+count+" .try");
        System.out.println("Your score in this turn : "+score);
        System.out.println("Your total score in this game : "+totalScore);
        score = 0;
        count=0;

        gameStatus();


    }

    private static void gameStatus() {

        System.out.print("1: CONTINUE\t\t2: EXIT : ");
        int statusKey = scan.nextInt();
        if(statusKey==1) {
            int min = 1; // dahil
            int max = 101; // dahil degil
            int computerNum = (int) (Math.random() * (max - min)) + min;
            guessNum(computerNum);

        } else if (statusKey==2) {
            endOfGame();
        } else {
            System.out.println("Please enter a valid key (1 or 2)");
            gameStatus();
        }

    } // gameStatus sonu

    private static void endOfGame() {
        System.out.println("-------------------");
        System.out.println("YOUR TOTAL SCORE : "+totalScore);
        System.out.println("THANKS FOR THE GAME");
        System.out.println("-------------------");


    }
}
