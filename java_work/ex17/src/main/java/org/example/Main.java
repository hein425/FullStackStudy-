package org.example;

import org.example.aa.Kiacar;
import org.example.aa.SMcar;

public class Main {
    public static void main(String[] args) {

        SMcar  smCar= new SMcar("sm3", "예쁜","삼성");
        Kiacar kiaCar = new Kiacar();

        System.out.println(smCar);
        System.out.println(kiaCar);
    }
}