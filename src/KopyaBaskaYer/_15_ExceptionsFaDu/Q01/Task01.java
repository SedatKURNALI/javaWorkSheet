package _15_ExceptionsFaDu.Q01;

import java.util.Scanner;

public class Task01 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int visaScore = 0;
        int finalScore = 0;
        double average = 0;

        visaScore = getScore("Visa");
        finalScore = getScore("Final");
        average = calculateAverage(visaScore, finalScore);

        System.out.println("Average : " + average);

    }

    private static double calculateAverage(int visaScore, int finalScore) {
        return visaScore * 0.4 + finalScore * 0.6;
    }

    private static int getScore(String examType) {
        int score = 0;

        while (true) {

            try {
                System.out.print("Please enter " + examType + " exam score : ");
                score = scan.nextInt();
                if (score < 0 || score > 100) {
                    throw new ArithmeticException();

                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("WARNING ! : Exam score should be between 0-100");

            } catch (Exception e) {
                String str = scan.next();
                System.out.println("WARNING ! Please enter a valid exam score");

            }

        }

        return score;
    }
}
