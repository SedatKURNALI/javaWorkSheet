package JavaProjectsFaDu.P05_HalukMarketOOPeng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transactions {
    static Scanner scan = new Scanner(System.in);
    static List<Products> products = new ArrayList<>();
    static int selectMenu;
    static double cartTotal=0;
    static List<String> codeControl = new ArrayList<>();


    // SHOPPING MENU
    public static void menu() {
        System.out.println("1: Add new products into List (Admin)\n2: List Products\n3: Buy Products\n4: See Shopping Cart");
        System.out.print("Please select any item you want : ");
        selectMenu = scan.nextInt();

        switch (selectMenu) {
            case 1:
                addProduct();
                break;
            case 2:
                listProducts();
                break;
            case 3:
                buyProducts();
                break;
            case 4:
                seeCart();
                break;
        }

    }



    // Select Action after each item
    public static void selectAction() {
        System.out.println("Press any key to go shopping menu");
        String temp = scan.next();
        menu();

    }



    // CASE 1: List Products ********************************************************
    public static void addProduct() {

        //    Option 1: Adding products one by one based on Constructor
        //    Products prd1 = new Products("00","Tomato",2.10);
        //    Products prd2 = new Products("01","Potato",3.20);
        //    Products prd3 = new Products("02","Green Pepper", 1.50);


        //    Option 2: Adding products objects in an ArrayList

        System.out.print("How many products will you enter? :");
        int productNumbers = scan.nextInt();
        int i = 0;
        scan.nextLine(); // create a dummy scan

        while (i < productNumbers) {
            // first get 3 elements of each product from user as String
            System.out.print(i + 1 + ". product (code name price) : ");
            String myStr = scan.nextLine();
            String[] arr = myStr.split(" ");

            // If code contains, warn the user
            if(codeControl.contains(arr[0])) {
                System.out.println("You already defined this "+arr[0]+ " code before");
            } else {
                // Create an object named temp and add elements to this object
                Products temp = new Products(arr[0], arr[1], Double.parseDouble(arr[2]),0);

                // add each created object into the products List (defined at top)
                products.add(temp);
                codeControl.add(arr[0]);
                i++;
            }



        }
            selectAction();
    }



    // CASE 2: List Products ********************************************************
    public static void listProducts() {
        System.out.println("Code\t\tName \t\t\tPrice");
        System.out.println("----\t\t---- \t\t\t-----");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i).code + "  \t\t" +
                    products.get(i).name + "\t\t\t" +
                    products.get(i).price);
            System.out.println();
        }
        System.out.println("------------------------------");
        selectAction();
    }


    // CASE 3: Add Products to Cart ********************************************************
    public static void buyProducts() {

        System.out.print("Please write 2 digit code of the product : ");
        String selectCode = scan.next();
        System.out.print("How many kg  : ");

        for (Products each :products
             ) {
            if(each.code.equals(selectCode)) {
                each.userKg+=scan.nextDouble();
            }
        }

        seeCart();
    }


    // CASE 4: See Shopping Cart ********************************************************
    private static void seeCart() {
        System.out.println("SHOPPING CART");
        System.out.println("Code\t\tName \t\t\tPrice\t\tKg\t\tTotal");
        System.out.println("----\t\t---- \t\t\t-----\t\t--\t\t-----");
        for (Products each:products
             ) {
            if(each.userKg>0) {
                System.out.println(each.code+"  \t\t"+each.name+"\t\t\t"+each.price+"\t\t"+each.userKg+"\t\t"+(each.price*each.userKg));
                cartTotal+=(each.price*each.userKg);
            }
        }
        System.out.println("GRANT TOTAL ---------: "+cartTotal);

        System.out.println("1: continue shopping \t 2: Proceed to Checkout ");
        selectMenu=scan.nextInt();
        if(selectMenu==1) {
            buyProducts();
        } else if (selectMenu==2) {
            checkOut();
        } else {
            System.out.println("Please type 1 or 2");
            seeCart();
        }
    }

    // CHECKOUT PAGE  ********************************************************
    private static void checkOut() {
        System.out.println("**** PAYMENT PAGE ****");
        System.out.println("Order Summary");

        for (Products each:products
        ) {
            if(each.userKg>0) {
                System.out.println(each.name+"\t\t\t"+(each.price*each.userKg));
            }
        }
        System.out.println("GRANT TOTAL ---------: "+cartTotal);

        double cash=0;

        do {
            System.out.print("Please insert cash amount : ");
            cash += scan.nextDouble();
            if (cash < cartTotal) {
                System.out.println("The amount is not enough to pay");
                System.out.println("Please add "+(cartTotal - cash) + " TL more");
            }
        } while (cash < cartTotal);

        double remainder = cash - cartTotal;
        if (remainder > 0) {
            System.out.println("Take the  :" + remainder + "change from the difference");
        }
        System.out.println("Have a Nice Day");

    }
}
