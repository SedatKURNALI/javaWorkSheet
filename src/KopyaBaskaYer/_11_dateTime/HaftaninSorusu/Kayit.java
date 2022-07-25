package KopyaBaskaYer._11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici> kisiler = new ArrayList<>();//bos list  create edildi. kayıtAl() method bu liste element atayacak


    public List<Kullanici> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("adınız giriniz : ");
        String isim = scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());//Kullanıcı class'dan p'li cons. ile obj create edildi
        kisiler.add(k1);//Kullanıcı class'dan p'li cons. ile  create edilen obj kisler listine eklanedi


        return kisiler;

    }

    public void sansliKullanici(List<Kullanici> kll) {

        for (Kullanici k : kll) {//kayıtAl() methodunda create edilen her bir kullanıcı döngüye sokuldu
            if (k.kayitZamani.getSecond() < 10) {//her bir kullanıcının kayıtZamanındaki sanıye if şartına sokuldu
                System.out.println("sansli kisisiniz " + k.name + " agam 5 kilo bal kazandın  :)");
            } else System.out.println("maalesef " + k.name + " ballar balının buldunuz kovanınız yagmalandı :)");
        }
    }
 public  void listele(List<Kullanici> kullanicilar){
     for (Kullanici k:kullanicilar ) {//kayıtAl() methodyndan gelen kişler listini döngüye sokuyor
         System.out.println("adı : "+k.name+" kayıt zamanı : "+k.kayitZamani);//kisile listteki her bir kullanıcının  ad ve kayıt zamanınn  yazdırıdı
     }

 }
}
























