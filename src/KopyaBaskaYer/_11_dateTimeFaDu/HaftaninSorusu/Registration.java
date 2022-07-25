package KopyaBaskaYer._11_dateTimeFaDu.HaftaninSorusu;


/*
     Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
     1- Bir user class oluşturun fields: name , registerDate (LocalDateTime cinsinden)
     2- Registration isminde bir class oluşturun ve register isminde bir metod
     ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.
     3- Registration classı na aynı zamanda kendine verilen
     ArrayListteki userlardan her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers isminde bir metod daha ekleyiniz.

     İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.

     public static void main(String[] args) {
     Registration userReg = new Registration();
     ArrayList<User> register = userReg.register();
      userReg.printHappyUsers(register);
 */


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

    static Scanner scan = new Scanner (System.in);
    static List<String> usersList= new ArrayList<>();
    static List<LocalDateTime> usersRegDate = new ArrayList<>();
    static List<String> happylist = new ArrayList<>();

    public static void main(String[] args) {
        // kac tane veri alacagimizi kullanicidan isteyelim ona gore
        // dongu sayisini hesaplayabilelim

        System.out.print("how many users will you add? :");
        int count = scan.nextInt();
        scan.nextLine();

        register (usersList,usersRegDate,count);
        // kullanicidan aldigimiz sayi kadar isim ve kayit tarih saat listelerine ekletelim

        printHappyUser();
        // listelere eklenenlerden kayıt tarih saati ilk 10 saniye olanlari bulup yazdiralim

    }


    // burada kayıt olurken herhangi bir dakikanin ilk 10 saniyesinde kayit olanlari
    // secip yazdiralim
    private static void printHappyUser() {

        for (int i = 0; i < usersRegDate.size(); i++) {
            if(usersRegDate.get(i).getSecond()<=10) {
                happylist.add(usersList.get(i));
            }

        }
        System.out.println(happylist);

    }


    // burada kullanici isimlerini ve kayit tarihlerini alip / hesaplatip kaydedelim
    private static void register(List<String> usersList, List<LocalDateTime> usersRegDate, int count) {
        int i = 0;
        while (i < count) {
            System.out.print("Enter "+(i+1)+" . username : ");
            User obj=new User();
            obj.name=scan.nextLine();
            obj.registerDateTime = LocalDateTime.now();
            usersList.add(obj.name);
            usersRegDate.add(obj.registerDateTime);
            i++;
        }

        System.out.println(usersList);
        System.out.println(usersRegDate);

    }






}
