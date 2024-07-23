package org.example;

import org.example.friend.CompFriend;
import org.example.friend.UnivFriend;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {

        int ucnt = 0;
        int ccnt = 0;

        UnivFriend univFriend[] = new UnivFriend[10];
        CompFriend compFriend[] = new CompFriend[10];

        univFriend[ucnt++] = new UnivFriend("김한주","010-1111-1111","실음과");

        System.out.println(Arrays.toString(univFriend));
        System.out.println(Arrays.toString(compFriend));

        System.out.println("ucnt="+ucnt);
        for (int i = 0; i < ucnt ; i++) {
            univFriend[i].showInfo();
        }

        for (int i = 0; i < ccnt; i++) {
            compFriend[i].showInfo();
        }
    }
}
