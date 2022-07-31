package KopyaBaskaYer.JavaProjectsFaDu.P05_HalukMarket;

import java.util.Scanner;

public class Transactions {
    static Scanner scan = new Scanner(System.in);

    // Product Selection method
    protected static void addBasket() {

        for (int i = 0; i < Products.producstList.size(); i++) {
            System.out.printf(Products.producstList.get(i));
            System.out.printf("\t\t\t:");
            System.out.printf(Products.productsPrice.get(i) + " $ / kg");
            System.out.println();
        }
        System.out.print("Please select one and write 2 digit code : ");
        Products.userBasketProduct.add(scan.next());
        System.out.print("How many kg for : ");
        Products.userBasketKg.add(scan.nextDouble());

        System.out.println("added to your shpping cart");
        System.out.println("Continue shopping : 1\tGo to shopping cart : 2\tProceed to Checkout: 3");
        int selection = scan.nextInt();

        goSelection(selection);
    }

    // after each product selection warn buyer to continue shopping or to see the basket
    private static void goSelection(int selection) {
        if (selection == 2) {
            seeBasket();
        } else if (selection == 1) {
            addBasket();
        } else if (selection==3) {
            makePayment();
        }

        else {
            System.out.println("Continue shopping : 1\tGo to shopping cart : 2\tProceed to Checkout: 3");
            selection = scan.nextInt();
            goSelection(selection);
        }
    }

    private static void makePayment() {
        System.out.println("**** PAYMENT PAGE ****");
        System.out.println("Order Summary");
        System.out.println("Product Price \t:"+Products.totalPrice+" $");
        System.out.println("Shipping      \t: Free");
        System.out.println("Grand Total \t:"+Products.totalPrice+" $");


    }

    // to see basket products, prices and total
    private static void seeBasket() {
        for (int i = 0; i < Products.userBasketProduct.size(); i++) {
            System.out.print(
                    Products.producstList.get(Integer.parseInt(Products.userBasketProduct.get(i)))
            ); // Select product from productsList
            System.out.print(" - ");
            System.out.print(Products.userBasketKg.get(i) + " kg"); // select kg info
            System.out.print(" : " + Products.userBasketKg.get(i) *
                    Products.productsPrice.get(Integer.parseInt(Products.userBasketProduct.get(i))) + "$");
            // calculate each product price kg*productPrice

            // add calculated product prices (kg*unit price) into the userBasketPrice Array
            Products.userBasketPrice.add(Products.userBasketKg.get(i) *
                    Products.productsPrice.get(Integer.parseInt(Products.userBasketProduct.get(i))));// add each product price into userBasketPrice
            System.out.println();
        }

        // at the bottom, calculate and show Total Price
        for (int i = 0; i < Products.userBasketPrice.size(); i++) {
            Products.totalPrice += Products.userBasketPrice.get(i);
        }
        System.out.println("--------------------------------");
        System.out.println("TOTAL PRICE : " + Products.totalPrice);


        System.out.println("Continue shopping : 1\tGo to shopping cart : 2\tProceed to Checkout: 3");
        int selection = scan.nextInt();
        goSelection(selection);

    }


}
