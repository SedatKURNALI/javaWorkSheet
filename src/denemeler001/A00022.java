package denemeler001;

import java.util.Scanner;

public class A00022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Agirlik: ");
        double kilo = scan.nextDouble();
        System.out.print("Boy: ");
        double boy = scan.nextDouble();
        double bmi = kilo / (boy * boy);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Zayifsiniz");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Zayifsiniz");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("sismansiniz");
        } else if (bmi >= 30) {
            System.out.println("obez");
        }
    }
}

