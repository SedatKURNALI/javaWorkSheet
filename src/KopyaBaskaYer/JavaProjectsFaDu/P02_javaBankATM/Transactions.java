package KopyaBaskaYer.JavaProjectsFaDu.P02_javaBankATM;

import java.util.Scanner;

import static KopyaBaskaYer.JavaProjectsFaDu.P02_javaBankATM.Variables.controlCount;

public class Transactions {

    static int selectMenu;
    static int count;
    static Scanner scan = new Scanner(System.in);

    // get card number and pin number from user
    public static void atmMachine() {
        System.out.println("***** JAVA BANK ATM *****");
        System.out.print("Enter your card number : ");
        String userCardNum = scan.nextLine();
        userEntryControl(userCardNum);

        if (controlCount != 3) {
            System.out.print("Enter your pin number : ");
            String userPinNum = scan.nextLine();
            userEntryControl(userCardNum, userPinNum);
        }
    }

    // first control for credit card number ********************
    private static String userEntryControl(String userCardNum) {

        if (userCardNum.trim().replaceAll(" ", "").equals(Variables.creditCardNumber)) {
            controlCount = 1;

        } else {
            if (controlCount == 3) {
                System.out.println("***** ATM BLOCKED *****");
                System.out.println("The card might be blocked because the card issuer \n" +
                        "has detected suspicious and possibly fraudulent activity.\nPlease contact your bank");
                exit();
            } else {
                if (!userCardNum.trim().replaceAll(" ", "").equals(Variables.creditCardNumber)) {
                    System.out.print("Incorrect card number " + (controlCount + 1) + "/3  Please re-enter :");
                    System.out.println();
                    controlCount++; // increase 1 for incorrect entry (max 3 incorrect entry)
                    atmMachine();

                }
            }
        }
        return userCardNum;

    }

    // second control for pin number ********************
    public static void userEntryControl(String userCardNum, String userPinNum) {

        if (userPinNum.equals(Variables.pin)) {
            controlCount = 1;
            System.out.println("Card Number : OK \t\t\t Pin Number: OK");
            Transactions.atmMenu();
        } else {

            if (controlCount == 3) {
                System.out.println("***** ATM BLOCKED *****");
                System.out.println("The card might be blocked because the card issuer \n" +
                        "has detected suspicious and possibly fraudulent activity.\nPlease contact your bank");
                exit();
            } else {
                if (!userPinNum.equals(Variables.pin)) {
                    System.out.print("Incorrect Pin " + (controlCount + 1) + "/3  Please re-enter :");
                    controlCount++; // increase 1 for incorrect entry (max 3 incorrect entry)
                    userPinNum = scan.nextLine();
                    userEntryControl(userCardNum, userPinNum);

                }
            }


        }


    }

    // ATM MENU OPENS after credit card no and pin no confirmation
    public static void atmMenu() {
        System.out.println("***** JAVA BANK ATM *****" +
                "\n1.BALANCE INQURY \t 4.MONEY TRANSFER" +
                "\n2.CASH DEPOSIT \t\t 5.CHANGE PIN" +
                "\n3.WITHDRAWAL \t\t 6.EXIT");
        System.out.print("Please Select Your Transaction : ");
        selectMenu = scan.nextInt();
        scan.nextLine(); // add this line to keep next scan object in service
        switch (selectMenu) {
            case 1:
                balanceInquiry();
                break;
            case 2:
                cashDeposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                moneyTransfer();
                break;
            case 5:
                changePin();
                break;
            case 6:
                exit();
                break;
        }
    }

    // CHANGE PIN number page,
    private static void changePin() {
        System.out.println("***** CHANGE PIN *****");
        String userPin = "";
        String newPin = "";
        System.out.print("Please enter your current pin : ");
        userPin = scan.nextLine();
        if (Variables.pin.equals(userPin)) {
            System.out.print("Enter your new pin number : ");
            newPin = scan.nextLine();
            System.out.println("Your pin number has been successfully updated");
            Variables.pin = newPin;
            System.out.println("---------------------------");
            subSelection();
        } else {
            count++;
            if (count == 3) {
                System.out.println("You have entered your pin number 3 times.");

                subSelection();
            }
            System.out.println("Wrong Pin Number, Please re-enter your current pin number");
            changePin();
        }

    }

    // EXIT page
    private static void exit() {
        System.out.println("***** EXIT PAGE *****");
        System.out.println("Thank you for choosing us.");
        System.out.println("Have a nice day");

    }
    // MONEY TRANSFER page, enter iban and amount to transfer and check
    private static void moneyTransfer() {
        System.out.println("***** MONEY TRANSFER *****");
        System.out.print("Enter the amount you will transfer : ");
        double userTransfer = scan.nextDouble();
        scan.nextLine();
        if (userTransfer <= Variables.balance) {
            System.out.print("Enter the recipient's IBAN Number : ");
            String iban = scan.nextLine();
            if (iban.startsWith("TR") && iban.length() == 26) {
                System.out.println("The money transfer was successful.");
                Variables.balance -= userTransfer;
                System.out.println("Your new balance : "+Variables.balance);
                System.out.println("---------------------------");
                subSelection();
            } else {
                System.out.println("The IBAN you entered is incorrect, Please re-enter");
                moneyTransfer();
            }
        } else {
            System.out.println("There is not enough money in your account that you want to transfer \nPlease re-enter the amount you will transfer");
            moneyTransfer();
        }


    }


    // WITHDRAW MONEY transaction page, enter amount to withdraw and check enough or not
    private static void withdraw() {
        System.out.println("***** MOMEY WITHDRAW *****");
        System.out.print("Enter the amount you will withdraw : ");
        double userWithdraw = scan.nextDouble();
        if (userWithdraw <= Variables.balance) {
            Variables.balance -= userWithdraw;
            System.out.println("Please Take Your Cash\nYour New Balance : " + (Variables.balance));
            System.out.println("---------------------------");
            subSelection();
        } else {
            System.out.println("There is not enough money in your account that you want to withdraw.\nPlease re-enter the amount you will withdraw");
            withdraw();
        }
    }

    // CASH DEPOSIT transaction page, enter amount and see the updated balance
    private static void cashDeposit() {
        System.out.println("***** CASH DEPOSIT *****");
        System.out.print("Enter the amount you will deposit : ");
        double userDeposit = scan.nextDouble();
        Variables.balance += userDeposit;
        System.out.println("Your New Balance : " + (Variables.balance));
        System.out.println("---------------------------");
        subSelection();
    }

    // BALANCE INQUIRY transaction page, see the latest balance
    private static void balanceInquiry() {
        System.out.println("***** BALANCE INQUIRY *****");
        System.out.println("Your Balance : " + Variables.balance + " USD");
        System.out.println("---------------------------");
        subSelection();
    }


    // At the end of each transaction page, let's ask the user whether to go to the ATM menu or exit.
    private static void subSelection() {
        System.out.print("1- ATM Menu  \t\t 2- Exit  choose --> : ");
        int subsecim = scan.nextInt();

        if (subsecim == 1) {
            atmMenu();
        }
        if (subsecim == 2) {
            exit();
        } else {
            System.out.println("Enter a valid number");
            subSelection();
        }

    }


}
