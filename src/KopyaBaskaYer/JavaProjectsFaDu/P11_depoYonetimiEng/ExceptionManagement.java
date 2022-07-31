package KopyaBaskaYer.JavaProjectsFaDu.P11_depoYonetimiEng;

import static JavaProjectsFaDu.P11_depoYonetimiEng.Transactions.addedProductsMap;
import static JavaProjectsFaDu.P11_depoYonetimiEng.Transactions.scan;

public class ExceptionManagement {


    // 1 Add New Product - how many products will you enter?

    public static int pNumbers() {

        int tempNum = 0;

        while (true) {
            try {
                System.out.print("How many products will you enter : ");
                tempNum = scan.nextInt();
                if (tempNum < 0 || tempNum > 10) {  // check integer value between
                    throw new ArithmeticException();
                } else {
                    break;
                }

            } catch (ArithmeticException e) {
                System.out.println("WARNING ! : You can enter maximum 10 products each time");

            } catch (Exception e) {   // if any key like String situation
                String str = scan.next();
                System.out.println("WARNING ! Please enter a valid number");

            }
        }

        return tempNum;
    }


    //2- Product Code Check
    public static int selectProductCode() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.print("Enter the product code for the transaction : ");
                tempNum = scan.nextInt();


                if (!addedProductsMap.keySet().contains(tempNum)) {
                    throw new ArithmeticException();
                } else {
                    break;
                }

            } catch (ArithmeticException e) {
                System.out.println("WARNING ! : Please write only registered product code");

            } catch (Exception e) {
                String str = scan.next();
                System.out.println("WARNING ! Please enter a valid number");

            }
        }

        return tempNum;
    }

    // 2 Quantity Control
    public static int addQuantityProduct() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.print("Enter the Quantity (max 100 unit): ");
                tempNum = Integer.valueOf(scan.next());

                if (tempNum < 0 || tempNum > 100) {
                    throw new ArithmeticException();
                } else {
                    break;
                }

            } catch (ArithmeticException e) {
                System.out.println("WARNING ! : You can enter maximum 100 quantity of  each product");

            } catch (Exception e) {
                System.out.println("WARNING ! Please enter a valid number");

            }
        }

        return tempNum;
    }


    // 5 - Shelf Planning quantity control - should be more than 0
    public static int quantityControl(int productId) {
        int tempQuantity = 0;

        Product prdTemp = addedProductsMap.get(productId);
        return prdTemp.getProductQuantity();

    }



    // 5 Shelf Planning (if enter the product code with 0 quantity  )
    public static int afterSelectionZeroQuantity() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.print("1: assign for another product\t2: Return main menu : ");
                tempNum = Integer.valueOf(scan.next());

                if (tempNum < 0 || tempNum > 2) {
                    throw new ArithmeticException();
                } else {
                    break;
                }

            } catch (ArithmeticException e) {
                System.out.println("WARNING ! : Please enter 1 to continue shelf assignment or " +
                        "\n enter 2 to go mainmenu");

            } catch (Exception e) {
                System.out.println("WARNING ! Please enter a valid number");

            }
        }

        return tempNum;
    }

    // Selection method
    public static int selectionMethodControl() {
        int tempNum = 0;

        while (true) {
            try {
                System.out.println("1: Main menu\t2: Quit System");
                tempNum = Integer.valueOf(scan.next());

                if (tempNum < 0 || tempNum > 2) {
                    throw new ArithmeticException();
                } else {
                    break;
                }

            } catch (ArithmeticException e) {
                System.out.println("WARNING ! : Please enter 1 to go main menu " +
                        "\n enter 2 to quit");

            } catch (Exception e) {
                System.out.println("WARNING ! Please enter a valid number");

            }
        }

        return tempNum;
    }

}
