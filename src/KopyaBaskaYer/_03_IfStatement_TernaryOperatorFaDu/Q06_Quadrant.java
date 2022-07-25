package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q06_Quadrant {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu
        // yazdıran bir kod yazınız.
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter x point and y point below");
        int xPoint = scan.nextInt();
        int yPoint = scan.nextInt();

        if(xPoint>0 && yPoint>0) {
            System.out.println("Quadrant I");
        } else if (xPoint<0 && yPoint>0) {
            System.out.println("Quadrant II");
        }else if (xPoint<0 && yPoint<0) {
            System.out.println("Quadrant III");
        }else if (xPoint>0 && yPoint<0) {
            System.out.println("Quadrant VI");
        } else if (xPoint!=0 && yPoint==0) {
            System.out.println("On the x-axis");
        } else if (xPoint==0 && yPoint!=0) {
            System.out.println("On the y-axis");
        } else if (xPoint==0 && yPoint==0) {
            System.out.println("On the origin point");
        } else {

        }



    }
}
