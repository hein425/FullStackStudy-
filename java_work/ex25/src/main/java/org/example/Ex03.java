package org.example;
// 컴페레이터 인터페이스 기반 트리셋의 예
import java.util.Comparator;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {

//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };

        TreeSet<Person> treeSet = new TreeSet<>((o1,o2)->o2.getAge()-o1.getAge());
                                                    // 이것이 람다. 위에꺼랑 같은일을 함
                                                    // 람다를 잘해야 뷰랑 리액트 잘함

        treeSet.add(new Person(10,"홍길동"));
        treeSet.add(new Person(5,"이길동"));
        treeSet.add(new Person(20,"김길동"));

        System.out.println(treeSet);

    }
}