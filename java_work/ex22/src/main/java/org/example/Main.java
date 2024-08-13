package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person[]  parr = {
                new Person("dddd",40),
                new Person("a",20),
                new Person("bb",30),
                new Person("ccc",40)
        };

        Arrays.sort(parr);

        System.out.println(Arrays.toString(parr));
    }
}