package generics_FaDu;

public class MultipleClass { // Main Class


    /*
     Genelde tek bir java dosyasi icerisinde tek bir java class create edilir.
     Ancak her ne kadar tavsiye edilmese de (non-atomic) bir java dosyasina
     birden fazla java class (non-inner) create edilebilir.

     Bu class lardan bir tanesini access modifier (ACM) public olur, diger class larin ACM si
     public olamaz.
     */

}
// public class yazarsak hata verir
 class falan { // OCA Trick: ayni dosya icinde birden fazla create edilen non-inner
                // class lari JVM compile ederken sadece main class public olarak tanimlar
                // diger class lardan herhangi biri de public olursa CTE verir.
}

 class filan {

}
