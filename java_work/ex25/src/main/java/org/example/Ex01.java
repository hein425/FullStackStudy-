package org.example;
// Set<E> 저장순서 없음 중복저장 허용하지 않음
// 해쉬코드와 이퀄즈...??
// 리스트에는 어레이리스트 링크드리스트 있다.  (어레이 리스트 제일 많이 씀)
// 셋에는 해쉬셋과 트리셋이 있다 트리셋은 순서 알아서 정렬해줌. (알고리즘 면접 테스트 때 나올수도있음)
//
import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("BOX");
        set.add("TOY");
        set.add("BOX");
        set.add("ROBOT");

        System.out.println(set);

//        set.add(new String("BOX"));
//        System.out.println(set);


        System.out.println("BOX".hashCode());
        System.out.println(new String("BOX").hashCode());

        Set<Member> set1 = new HashSet<>();
        set1.add(new Member());
        set1.add(new Member());

        System.out.println(set1);

        System.out.println(new Member().hashCode());
        System.out.println(new Member().hashCode());

    }
}
