package org.example;
//컬렉션 프레임워크의 이해 - 제네릭 기반으로 구현, 자료구조 및 알고리즘을 구현해놓은 일종의 라이브러리
//셋 리스트 큐 맵

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 리스트 -> 어레이리스트, 링크드리스트
        // 어레이리스트는 0번째 리무브 하면 1번째가 0번째로 당겨져옴 -> 조회는 빠르나 수정삭제는 느림
        // 링크드리스트는 0번째 리무브 하면 1번째에 0번을 할당함?? -> 조회는 느리나 수정삭제는 빠름
        // 그러나 느낄수있는 속도는 아님
        list.add("TOY");
        list.add("ROBOT");
        list.add("BOX");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        Person p1 = new Person("홍길동",20);
        Person p2 = new Person("최길동",30);

        System.out.println(p1);
        System.out.println(p2);

        List<Person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);

        System.out.println(plist);

   }
}
