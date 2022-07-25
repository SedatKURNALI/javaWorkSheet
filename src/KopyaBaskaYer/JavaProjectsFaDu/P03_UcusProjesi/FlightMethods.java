package JavaProjectsFaDu.P03_UcusProjesi;

import JavaProjectsFaDu.P02_javaBankATM.Variables;

import java.util.Arrays;

public class FlightMethods {

    public static double destPriceCalculation(int destKm) {
        double price = destKm*FlightVariables.pricePerKm;
        return price;
    }


    public static double userPriceCalculation (String dest, int age, int way) {
        double price = 0;

        if(age>0 && age<12) {
            price= FlightVariables.age12Discount *FlightVariables.destCitiesPriceArr[Arrays.binarySearch(FlightVariables.destCitiesNameArr,dest.toUpperCase())];
        } else if (age>=12 && age<24) {
            price= FlightVariables.age24Discount*FlightVariables.destCitiesPriceArr[Arrays.binarySearch(FlightVariables.destCitiesNameArr,dest.toUpperCase())];
        } else if (age>=25 && age <=65) {
            price= 1*FlightVariables.destCitiesPriceArr[Arrays.binarySearch(FlightVariables.destCitiesNameArr,dest.toUpperCase())];
        } else if (age>65) {
            price= FlightVariables.age65Discount*FlightVariables.destCitiesPriceArr[Arrays.binarySearch(FlightVariables.destCitiesNameArr,dest.toUpperCase())];
        }

        if(way==2) {
            price = price*2*(1-FlightVariables.twoWayDiscount);
        }
        return price;
    }


    public static double totalPriceCalculation (String dest, int way) {
        double price = 0;

        price= FlightVariables.destCitiesPriceArr[Arrays.binarySearch(FlightVariables.destCitiesNameArr,dest.toUpperCase())];

        if(way==2) {
            price = price*2;
        }
        return price;
    }

}
