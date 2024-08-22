package org.example;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        List<Car> list = Arrays.asList(
          new Car("그랜져",3000),
          new Car("K8",3500),
          new Car("sm3",1600)

        );

        Collections.sort(list);

        System.out.println();


        for(Car car:list){
            System.out.println(car);
        }

        System.out.println(list.get(2));

//        Collections.sort(list, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.getDisp() - o1.getDisp();
//            }
//        });

//        Collections.sort(list, ((o1,o2)->o2.getDisp() - o1.getDisp()));
//
//        Collections.sort(list, ((o1,o2)->o2.getName().compareTo(o1.getName())));
//
//        Collections.sort(list, ((o1,o2)->o2.getDisp() - o1.getDisp()));

                System.out.println();

        for(Car car:list){
            System.out.println(car);
        }
    }
}