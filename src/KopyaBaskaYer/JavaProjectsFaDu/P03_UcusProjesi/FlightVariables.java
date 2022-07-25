package JavaProjectsFaDu.P03_UcusProjesi;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightVariables {
    static Scanner scan = new Scanner (System.in);


    // destination and unit variables
    static String destCitiesNameArr[] = {"B", "C", "D"};
    static int destCitiesKmArr[] = {500, 700, 900};
    static double destCitiesPriceArr[] = new double[3];
    static double pricePerKm=0.10;
    static double twoWayDiscount = 0.20;
    static double age12Discount = 0.5;
    static double age24Discount = 0.9;
    static double age65Discount = 0.7;

    // passenger variables
    String name;
    String surname;
    int age;
    String userDestination;
    double userPrice;
    int way;
    double totalPrice;



}
