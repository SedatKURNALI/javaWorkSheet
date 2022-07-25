package KopyaBaskaYer._11_dateTimeFaDu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Q02 {

    public static void main(String[] args) {

        /*TODO
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21);
           F. LocalDate.of(2014, Month.JUNE, 21);
         */
        LocalDate date = LocalDate.of(2014,06,21);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
        System.out.println(formatter.format(date));

        LocalDate trh1 = LocalDate.of(2014, 6, 21);
        System.out.println(trh1);

        LocalDate trh2 = LocalDate.of(2014, Month.JUNE, 21);
        System.out.println(trh2);

    }
}
