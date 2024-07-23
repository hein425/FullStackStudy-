package org.example;

public class LPrint implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("엘지프린터");
        System.out.println(doc);
    }

    @Override
    public void doA() {

    }
}
