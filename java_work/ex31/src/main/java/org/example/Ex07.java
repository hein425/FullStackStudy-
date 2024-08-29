package org.example;

import java.util.stream.Stream;

public class Ex07 {
    public static void main(String[] args) {

        boolean b = Stream.of(1,2,3,4,5,6)
                .allMatch( integer -> integer%2==0);
        System.out.println("b = "+b);

        boolean b2 = Stream.of(1,2,3,4,5,6)
                .anyMatch( integer -> integer%2==0);
        System.out.println("b2 = "+b2);

        boolean b3 = Stream.of(1,2,3,4,5,6)
                .noneMatch( integer -> integer%2==0);
        System.out.println("b3 = "+b3);

    }
}
