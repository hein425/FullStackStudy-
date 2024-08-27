package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 필터링과 맵핑
public class Ex04 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 1)
                .forEach(s -> System.out.println("나온거는 " + s));

        List<Member> list = Arrays.asList(
                new Member(1, "홍길동", 20, "aaa.@naver.com", "password"),
                new Member(2, "이길동", 30, "aaa.@naver.com", "password"),
                new Member(3, "김길동", 40, "aaa.@naver.com", "password")
        );

        //1.나이의 최종합
        //2.나이가 30이상인 사람 출력

        int result = 0;
        for (Member member : list) {
            result += member.getAge();
            System.out.println(member);
        }
        System.out.println("나이의최종합= " + result);

        result = list.stream()
                .mapToInt(s -> s.getAge())
                .sum();
        System.out.println("나이의최종합= " + result);

        list.stream()
                .filter(member -> member.getAge() >= 30)
                .forEach(s -> {
                    System.out.println("내용");
                    System.out.println(s);
                });

//        list.stream()
//                .filter( m -> m.getAge())
//                .mapToInt( m -> m.getAge())
//                .forEach( age -> System.out.println("sdf"));
    }
}

// 맵핑 : 맵을 만나면 스트림으로 흐르던게 바뀌는거임 (필터는 거르는거)
