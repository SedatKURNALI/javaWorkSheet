package KopyaBaskaYer._07_ForLoopFaDu;

public class Q21_UcgenSekiller {

    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */
        System.out.println("*****SEKIL 1*****");
        for (int i = 0; i <= 9; i++) {
            for (int j = 9; j > 0; j--) {
                if(i==0 && j==1) {
                    System.out.print("*");
                }
                else if(i==1 && j==1) {
                    System.out.print("**");
                }
                else if (i>=j) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }



        /*
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *       */

        System.out.println("*****SEKIL 2*****");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= 0; j--) {
                if (j>=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */

        System.out.println("*****SEKIL 3*****");

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= 0; j--) {
                if(i==1 & j==10) {
                    System.out.print(" * *");
                }
                else if (j>=i) {
                    System.out.print(" *");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }

        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         */


    }
}
