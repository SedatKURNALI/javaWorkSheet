package JavaProjectsFaDu.P03_UcusProjesi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static JavaProjectsFaDu.P03_UcusProjesi.FlightVariables.destCitiesNameArr;
import static JavaProjectsFaDu.P03_UcusProjesi.FlightVariables.scan;


public class FlightMain {
    public static void main(String[] args) {
        System.out.println("**** Welcome Java Airlines Reservation System *****");

        // showing destination names in an array
        System.out.println("Destinations : "+ Arrays.toString(destCitiesNameArr));

        // calculating destination price based on km and unit price per km stated in variables class
        for (int i = 0; i < destCitiesNameArr.length; i++) {
            FlightVariables.destCitiesPriceArr[i]=FlightMethods.destPriceCalculation(FlightVariables.destCitiesKmArr[i]);
        }

        // showing destination prices in an aray
        System.out.println("Price (USD)  : " + Arrays.toString(FlightVariables.destCitiesPriceArr));

        // creating pax1 object
        FlightVariables pax1 = new FlightVariables();

        // getting information from user
        System.out.print("Please select your  destination : ");
        pax1.userDestination=FlightVariables.scan.next().toUpperCase();
        System.out.print("Please enter your name : ");
        scan.nextLine(); // added to prevent pass of next scan
        pax1.name = FlightVariables.scan.nextLine();
        System.out.print("Please enter your surname : ");
        pax1.surname = FlightVariables.scan.nextLine();
        System.out.print("Please enter your birth year : ");
        pax1.age= LocalDateTime.now().getYear()-scan.nextInt();
        System.out.print("Please select : One way ticket(1) \t Round Trip Ticket(2) : ");
        pax1.way = FlightVariables.scan.nextInt();
        String note = pax1.way==1 ? "One Way" : "Round Trip";

        // calculating ticket price based on user destionation, age and oneway or roundtrip selection
        pax1.userPrice= FlightMethods.userPriceCalculation(pax1.userDestination, pax1.age, pax1.way);
        // calculating non-discounted total price, to show on the ticket onlu
        pax1.totalPrice=FlightMethods.totalPriceCalculation(pax1.userDestination, pax1.way);

        // creating date and time to show on the ticket
        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM YYYY - HH:mm");

        // ticket printing
        System.out.println("********* YOUR TICKET *********");
        System.out.println("Ticketing Date-Time : "+formatter.format(dateTimeNow));
        System.out.println("Name - Surname : "+pax1.name + "  "+pax1.surname);
        System.out.println("Your age       : "+pax1.age);
        System.out.println("Destination    : "+pax1.userDestination+" - "+note);
        System.out.println("------------------------------");
        System.out.println("SUB TOTAL PRICE: "+pax1.totalPrice+" USD");
        System.out.println("Discout        : -"+(pax1.totalPrice- pax1.userPrice)+" USD");
        System.out.println("TOTAL PRICE    : "+pax1.userPrice+" USD");


    } // main
}
