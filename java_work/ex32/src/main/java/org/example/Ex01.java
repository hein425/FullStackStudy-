package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Ex01 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(localDate.getYear(),9,17);

        Period period = Period.between(localDate, localDate1);

        System.out.println("localDate1.minusDays(1) = "+localDate1.minusDays(1));
        System.out.println("localDate1.minusDays(2) = "+localDate1.plusDays(2));
    }
}
