package org.example;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("toy","box","robot");
        // 원래는 불변객체인데 아래걸 쓰면 그 다음에 추가가 가능해짐
        list = new ArrayList<>(list);

        list.add("이거안된다.");

        System.out.println(list);
    }
}
