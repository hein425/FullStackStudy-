package org.example;

import org.example.friend.CompFriend;
import org.example.friend.Friends;
import org.example.friend.UnivFriend;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int cnt = 0;
        Friends friends[] = new Friends[10];

        friends[cnt++] = new UnivFriend("황소윤","010-5555-5555","시름과");

        friends[cnt++] = new CompFriend("김중식","010-9999-9999","1팀");

        System.out.println(Arrays.toString(friends));

        for (int i = 0; i < cnt; i++) {
            friends[i].showInfo();
        }

    }
}
