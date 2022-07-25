package JavaProjectsFaDu.P05_HalukMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Products {

    // define all products in the below ArrayList
    static List<String> producstList = new ArrayList<>(Arrays.asList("00\t Tomato","01\t Patato","02\t Pepper",
            "03\t Onion", "04\t Carrot", "05\t Apple","06\t Banana","07\t Sberry","08\t Melon",
            "09\t Grape","10\t Lemon" ));
    // define all product price in the below ArrayList in order of productsList
    static List<Double> productsPrice = new ArrayList<>(Arrays.asList(2.10, 3.20,1.50,2.30,3.10,2.10,1.90,6.10,4.30,2.70,0.50));
    static List<String> userBasketProduct = new ArrayList<>();
    static List<Double> userBasketKg = new ArrayList<Double>();
    static List<Double> userBasketPrice = new ArrayList<Double>();
    static Double totalPrice=0.0;
}
