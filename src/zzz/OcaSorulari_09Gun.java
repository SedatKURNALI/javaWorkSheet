package zzz;

import java.time.LocalDate;
import java.time.Period;

public class OcaSorulari_09Gun {
    public static void main(String[] args) {
        LocalDate datel = LocalDate.of(1979, 10, 1);
        Period z = Period.between(datel, LocalDate.now());
        System.out.println("You lived for:");
        System.out.println("days: " + z.getDays());
        System.out.println("Months: " + z.getMonths());
        System.out.println("Years: " + z.getYears());
    }
}
