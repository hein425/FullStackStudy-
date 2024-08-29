package org.example;

import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("aa ","bb ");
        Stream<String> stream2 = Stream.of("cc ","dd ");

        //스트림의 연결
        Stream.concat(stream1,stream2)
                .forEach(System.out::print);

        //스트림의 중간연산
        //box
        Stream<Integer> stream3 = Stream.of(11,22,33);

    }
}
