package KopyaBaskaYer.JavaProjectsFaDu.P11_depoYonetimiEng;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Transactions {

    static Scanner scan = new Scanner(System.in);
    static String selection;
    static Map<Integer, Product> addedProductsMap = new HashMap<>();


    // WAREHOUSE MANAGEMENT SYSTEM MENU PAGE
    public static void warManSystemMenu() {

        System.out.println("*****  WAREHOUSE MANAGEMENT SYSTEM ****** ");
        System.out.println("-------------------------");
        System.out.println("1 - Add New Product\t\t4 - List Products");
        System.out.println("2 - Update Products\t\t5 - Shelf Planning");
        System.out.println("3 - Remove a Product \t6 - Deliver Products");
        System.out.println("                        Q - Quit");
        System.out.print("Chose your selection -> : ");
        selection = scan.next().toUpperCase();

        switch (selection) {

            case "1":
                addNewProduct();
                break;

            case "2":
                updateProduct();
                break;

            case "3":
                removeProduct();
                break;

            case "4":
                listProducts();
                break;

            case "5":
                shelfPlanning();
                break;

            case "6":
                deliverProducts();
                break;

            case "Q":
                exitSystem();
                break;

            default:
                System.out.println("Please select only from list");
                warManSystemMenu();

        }

    }

    // 6- Deliver Products
    private static void deliverProducts() {
        System.out.println("*****  DELIVER PRODUCT PAGE ****** ");
        System.out.println("-------------------------");

        int returnedProductCode = ExceptionManagement.selectProductCode(); // write code number of the registered product
        int returnedProductQuantity = ExceptionManagement.addQuantityProduct(); // write product quantity to be updated

        Product prdTemp = addedProductsMap.get(returnedProductCode);


        int productQuantity = prdTemp.getProductQuantity();
        System.out.println("Product Code : " + returnedProductCode + " - Product Quantity : " + prdTemp.getProductQuantity());


        if (returnedProductQuantity > productQuantity) {
            System.out.println("Please enter enough quantity to deliver");

        } else {
            prdTemp.setProductQuantity((prdTemp.getProductQuantity() - returnedProductQuantity));
            addedProductsMap.put(returnedProductCode, prdTemp);
        }


        warManSystemMenu();
    }

    // Q- QUIT SYSTEM
    private static void exitSystem() {
        System.out.println("******** HAVE A NICE DAY ********");
    }

    // 5- Shelf Planning
    private static void shelfPlanning() {
        String newShelfNo = "";
        System.out.println("*****  SHELF PLANNING PAGE ****** ");
        System.out.println("-------------------------");

        int returnedProductCode = ExceptionManagement.selectProductCode(); // write code number of the registered product


        if (ExceptionManagement.quantityControl(returnedProductCode) > 0) {
            System.out.print("Enter the shelf code to be assigned for the relevant product :");
            newShelfNo = scan.next();
            Product prdTemp = addedProductsMap.get(returnedProductCode);
            prdTemp.setProductShelfNo(newShelfNo);

            addedProductsMap.put(returnedProductCode, prdTemp);
        } else {
            System.out.println("WARNING ! You can only assign shelves for products with a quantity. ");
            int userSelection = ExceptionManagement.afterSelectionZeroQuantity();
            switch (userSelection) {
                case 1:
                    shelfPlanning();
                    break;
                case 2:
                    warManSystemMenu();
                    break;
                default:
                    System.out.println("please enter a valid number");
                    ExceptionManagement.afterSelectionZeroQuantity();
                    break;
            }
        }

        System.out.println("Shelf no " + newShelfNo + "has been assigned to " + returnedProductCode + "Product");

        warManSystemMenu();
    }



    // 3- Remove Product
    private static void removeProduct() {
        System.out.println("*****  PRODUCT UPDATE PAGE ****** ");
        System.out.println("-------------------------");

        int returnedProductCode = ExceptionManagement.selectProductCode(); // Exception : Get Product Code

        Product prdTemp = addedProductsMap.get(returnedProductCode);
        System.out.println("Product Code : " + returnedProductCode + " - Product Quantity : " + prdTemp.getProductQuantity());

        addedProductsMap.remove(returnedProductCode);
        System.out.println(returnedProductCode + " Product has been removed from system");

        selectionMethod();

    }

    // 2- Update Product
    private static void updateProduct() {
        System.out.println("*****  PRODUCT UPDATE PAGE ****** ");
        System.out.println("-------------------------");

        int returnedProductCode = ExceptionManagement.selectProductCode(); // Exception : Get Product Code

        Product prdTemp = addedProductsMap.get(returnedProductCode);

        System.out.println("Product Code : " + returnedProductCode + " - Product Quantity : " + prdTemp.getProductQuantity());
        int returnedProductQuantity = ExceptionManagement.addQuantityProduct(); // Exception : Get Quantity

        prdTemp.setProductQuantity(returnedProductQuantity);

        addedProductsMap.put(returnedProductCode, prdTemp);

        selectionMethod();

    }

    // 4- List Products
    private static void listProducts() {
        System.out.printf("%-6s %-20.20s %-20.20s %-15.15s %-8s %-8s\n","Prd ID", "Prd Name","Prd Producer","Prd Unit","Qty","ShelfNo");
        System.out.println("---------------------------------------------------------------------------------------");

        Set<Map.Entry<Integer, Product>> productEntrySet = addedProductsMap.entrySet();

        for (Map.Entry<Integer, Product> each : productEntrySet
        ) {
            System.out.printf("%-6d %-20.20s %-20.20s %-15.15s %-8d %-8s \n", each.getKey(), each.getValue().getProductName(), each.getValue().getProductProducer(),
                    each.getValue().getProductUnit(), each.getValue().getProductQuantity(), each.getValue().getProductShelfNo());
        }
        System.out.println("--------------------------------------------------------------------------------------");

        selectionMethod();

    }

    // 1- Add New product
    private static void addNewProduct() {
        System.out.println("*****  ADD NEW PRODUCT PAGE *****");
        System.out.println("-------------------------");

        int returnedNum = ExceptionManagement.pNumbers(); // Exceptions: how many products will you enter?

        scan.nextLine(); // dummy scan
        int pId = 0;
        String pName = "";
        String pProducer = "";
        String pUnit = "";
        for (int i = 0; i < returnedNum; i++) {

            Product prdTemp = new Product();

            pId = Product.getProductId();

            System.out.print("("+(i + 1) + "/"+returnedNum+") Product Name : ");
            pName = scan.nextLine();
            prdTemp.setProductName(pName);

            System.out.print("("+(i + 1) + "/"+returnedNum+") Product Producer : ");
            pProducer = scan.nextLine();
            prdTemp.setProductProducer(pProducer);

            System.out.print("("+(i + 1) + "/"+returnedNum+") Product Unit : ");
            pUnit = scan.nextLine();
            prdTemp.setProductUnit(pUnit);


            addedProductsMap.put(pId, prdTemp);

            System.out.println("----------------------");
        }
        System.out.println("All products have been added into the WarManSystem");

        selectionMethod();

    }

    private static void selectionMethod() {
        int selectionMethod = ExceptionManagement.selectionMethodControl();
        switch (selectionMethod) {
            case 1:
                warManSystemMenu();
                break;
            case 2:
                exitSystem();
                break;
            default:
                selectionMethod();
                break;
        }
    }

}
