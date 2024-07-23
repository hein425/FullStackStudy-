package org.example.print;
import org.example.inter.Printable;

public class Samprinter implements Printable {
    @Override
    public void print(String mydoc) {
        System.out.println("삼성프린터출력");
        System.out.println(mydoc);
    }


}
