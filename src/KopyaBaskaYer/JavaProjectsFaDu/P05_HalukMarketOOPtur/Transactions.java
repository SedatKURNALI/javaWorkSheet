package JavaProjectsFaDu.P05_HalukMarketOOPtur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transactions {

   // sabit degiskenlerimizi burada tanimlayalim
    static Scanner scan = new Scanner(System.in);
    static String manavSifre = "1234";
    static List<Products> products = new ArrayList<>();
    static int selectMenu;
    static double cartTotal = 0;
    static List<String> codeControl = new ArrayList<>(); // urun eklerken kod daha once eklenmis mi eklenmemis
                                                        // mi kontrol etmek icin olusturdugumuz bos liste
    static String userType;

    // ANA GIRIS EKRANI (MARKET YONETIM - MUSTERI ve CIKIS)********************************
    public static void girisPaneli() {
        System.out.println("====================================\nJAVA MANAV\n" +
                "====================================\n"
                + "1- MANAV YONETIM SAYFASI\n2- MUSTERI ALISVERIS SAYFASI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        scan.nextLine(); // dummy scan

        switch (secim) {
            case "1":
                System.out.print("Sifrenizi Giriniz : ");
                if (scan.nextLine().equals(manavSifre)) {
                    userType="Manav";
                    manavIslemleri();
                } else {
                    System.out.println("Hatali Sifre Girdiniz ");
                    girisPaneli();
                }

                break;
            case "2":
                userType="Musteri";
                musteriMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz");
                girisPaneli();
                break;

        }

    }


    // MANAV YONETIM EKRANI **************************************************************
    private static void manavIslemleri() {
        System.out.println("***** MANAV YONETIM EKRANI *****");
        System.out.println("1: Yeni urun,fiyat bilgisi gir\n2: Urunleri Listele\n" +
                "3: Urun Silme\n4: Urun Fiyat Duzenleme\n5: Java Manav Anasayfa");
        System.out.print("Lutfen Seciminizi Yapiniz : ");
        selectMenu = scan.nextInt();

        switch (selectMenu) {
            case 1:
                addProduct();
                break;
            case 2:
                listProducts();
                break;
            case 3:
                removeProducts();
                break;
            case 4:
                setProducts();
                break;
            case 5:
                girisPaneli();
                break;
            default:
                System.out.println("Hatali Secim Yaptiniz");
                manavIslemleri();
                break;
        }

    }

    // MARKET YONETIM CASE 1: URUN EKLEME EKRANI **********************************
    public static void addProduct() {

        //    Option 1: Adding products one by one based on Constructor
        //    Products prd1 = new Products("00","Tomato",2.10);
        //    Products prd2 = new Products("01","Potato",3.20);
        //    Products prd3 = new Products("02","Green Pepper", 1.50);


        //    Option 2: Adding products objects in an ArrayList

        System.out.print("Kac adet urun ekleyeceksiniz ? :");
        int productNumbers = scan.nextInt();
        int i = 0;
        scan.nextLine(); // dummy scan

        while (i < productNumbers) {
            // urunlerin kodu, ismi ve fiyati aralarindan 1 bosluk ile String olarak alalim
            System.out.print(i + 1 + ". Urun (Kodu ismi fiyati) : ");
            String myStr = scan.nextLine();
            String[] arr = myStr.split(" "); // bosluklara gore split edip array e atalim

            // yazilan kodlari bos konteyner da toplayip, daha once eklenmis mi eklenmemis mi kontrolu
            if (codeControl.contains(arr[0])) {
                System.out.println("You already defined this " + arr[0] + " code before");
            } else {
                // tem adinda Produts obje si olusturup her dongude bir obje yi liste atalim
                Products temp = new Products(arr[0], arr[1], Double.parseDouble(arr[2]), 0);

                products.add(temp);
                codeControl.add(arr[0]);  // yeni olan kodu da codeCOntrol listesine atalim
                i++;
            }


        }
        System.out.println("Urunler sisteme basari ile girilmistir");
        listProducts();
    }

    // MARKET YONETIM CASE 4: URUN FIYAT REVIZE EKRANI **********************************
    private static void setProducts() {

        System.out.print("Fiyati revize edeceginiz urunun kodunu yaziniz : ");
        String codeRev=scan.next();

        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).code.equals(codeRev)) {
                System.out.println("Urun İsmi : "+products.get(i).name+"\t\t Urun Fiyati : "+products.get(i).price);
                System.out.print("Yeni Fiyati Giriniz : ");
                double codePrice=scan.nextDouble();
                products.get(i).setPrice(codePrice);
                break;

            } else {
                System.out.println("Yazdiginiz kodlu urun bulunamadi.");
            }
        }
        listProducts();
    }

    // MARKET YONETIM CASE 3: URUN SILME EKRANI **********************************
    private static void removeProducts() {
        System.out.print("Silmek istediginiz urunun kodunu yaziniz : ");
        String codeRem=scan.next();
        int kontrol=0;


        for (int i = 0; i < products.size(); i++) {

            if(!products.get(i).code.equals(codeRem)) {


            } else {

                System.out.println("Urun Ismi : "+products.get(i).name+"\t\t Urun Fiyati : "+products.get(i).price);
                System.out.print("Silmek icin d tusuna basip enter a basiniz : ");
                String keyDel=scan.next();
                if(keyDel.equalsIgnoreCase("D")) {
                    products.remove(i);
                }
                kontrol =1;
                break;
            }
        } if(kontrol==0) {
            System.out.println("Aradiginiz urun listede bulunamadi");
        }
        listProducts();
    }


    // SHOPPING MENU
    public static void musteriMenu() {
        System.out.println("1: Urunlerini Listele\n2: Alis Veris Sepeti\n3: Odeme Sayfasi\n" +
                "4: Java Manav Anasayfa\n5: Cikis");
        System.out.print("Lutfen seciminizi yapiniz : ");
        selectMenu = scan.nextInt();

        switch (selectMenu) {
            case 1:
                listProducts();
                break;
            case 2:
                seeCart();
                break;
            case 3:
                checkOut();
                break;
            case 4:
                girisPaneli();
                break;
            case 5:
                cikis();
                break;
        }

    }


    // Select Action after each item
    public static void selectAction() {
        System.out.println("Press any key to go shopping menu");
        String temp = scan.next();
        musteriMenu();

    }




    // MARKET YONETIM CASE 2: URUN LISTELEME EKRANI **********************************
    // MUSTERI ALISVERIS CASE 1: URUN LISTELEME EKRANI **********************************
    public static void listProducts() {
        System.out.println("Kod\t\tIsim \t\t\tFiyat");
        System.out.println("----\t\t---- \t\t\t-----");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i).code + "  \t\t" +
                    products.get(i).name + "\t\t\t" +
                    products.get(i).price);
            System.out.println();
        }
        System.out.println("------------------------------");
        if(userType.equals("Manav")) {
            manavIslemleri();
        } else {
            System.out.print("Satin almak istediginiz urunun ikili kodunu giriniz : ");
            String selectCode = scan.next();
            System.out.print("Kac kg alacaksiniz  : ");

            for (Products each : products
            ) {
                if (each.code.equals(selectCode)) {
                    each.userKg += scan.nextDouble();
                }
            }

            seeCart();
        }
    }




    // MUSTERI ALISVERIS CASE 2: SEPETI GORUNTULE **********************************
    private static void seeCart() {
        System.out.println("ALISVERIS SEPETI");
        System.out.println("Kod\t\tIsim \t\t\tFiyat\t\tKg\t\tToplam");
        System.out.println("----\t\t---- \t\t\t-----\t\t--\t\t-----");
        for (Products each : products
        ) {
            if (each.userKg > 0) {
                System.out.println(each.code + "  \t\t" + each.name + "\t\t\t" + each.price + "\t\t" + each.userKg + "\t\t" + (each.price * each.userKg));
                cartTotal += (each.price * each.userKg);
            }
        }
        System.out.println("DIP TOPLAM ---------: " + cartTotal);

        System.out.println("1: Alisverise Devam \t 2: Odeme Sayfasina Git ");
        selectMenu = scan.nextInt();
        if (selectMenu == 1) {
            listProducts();
        } else if (selectMenu == 2) {
            checkOut();
        } else {
            System.out.println("Lutfen 1 veya 2 den birini yaziniz");
            seeCart();

        }
    }


    // MUSTERI ALISVERIS CASE 3: ODEME SAYFASI **********************************
    private static void checkOut() {
        System.out.println("**** ODEME SAYFASI ****");
        System.out.println("Siparis Ozeti");

        for (Products each : products
        ) {
            if (each.userKg > 0) {
                System.out.println(each.name + "\t\t\t" + (each.price * each.userKg));
            }
        }
        System.out.println("DIP TOPLAM ---------: " + cartTotal);

        double cash = 0;

        do {
            System.out.print("Lutfen nakit giriniz : ");
            cash += scan.nextDouble();
            if (cash < cartTotal) {
                System.out.println("Girilen tutar yetersiz");
                System.out.println("PLutfen " + (cartTotal - cash) + " TL daha girmelisiniz");
            }
        } while (cash < cartTotal);

        double remainder = cash - cartTotal;
        if (remainder > 0) {
            System.out.println("Paraustu  :" + remainder + "TL iade aliniz");
        }
        System.out.println("Odemeniz Basarili");
        cikis();
    }


    // CIKIS EKRANI **************************************************************************
    private static void cikis() {
        System.out.println("Cikis isleminiz basarili");
        System.out.println("Saglikli Mutlu Gunler");
    }

}
