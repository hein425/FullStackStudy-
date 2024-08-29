package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// 스트림의 중간연산
// 리스트 같은거 없이 스트림 생성에 필요한 데이터를 직접 전달
// asd
// f
public class Ex01 {
    public static void main(String[] args) {
        Stream.of(11,22,33,44,55)
                .forEach(System.out::println);

        System.out.println();

        Stream.of("So Simple","So So","11,22,33")
                .forEach(System.out::println);

        List<String> list1 = Arrays.asList("11","22","33","44");
        List<String> list2 = Arrays.asList("11","22","33","44");

        Stream.of(list1, list2)
                .forEach(System.out::println);

        Stream.of(list1, list2)
                .flatMapToInt( strings-> // 플랜맵투: 일대 다수로 맵핑할때
                                strings.stream().mapToInt( s-> Integer.parseInt(s)))
                .forEach(System.out::println);


        int result = Stream.of(list1, list2)
                         .flatMapToInt( strings->
                                     strings.stream().mapToInt( s-> Integer.parseInt(s)))
                .sum();

        System.out.println("result= "+result);
    }
}