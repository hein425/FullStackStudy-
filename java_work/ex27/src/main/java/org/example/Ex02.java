package org.example;

interface Printable{
    void print();
}

class Papers{
    private String con;
    public Papers(String con){
        this.con=con;
    }

    public Printable getPrint(){
        class Printer implements Printable {
            @Override
            public void print(){
                System.out.println(con);
            }
        }
        return new Printer();
    }          //로컬클래스


//    public Printable getPrint(){
//        class Printer implements Printable {
//            return new Printer(){
//            @Override
//            public void print(){
//                System.out.println(con);     //익명클래스
//            }
//        };
//      }
//    }

}

public class Ex02 {
    public static void main(String[] args) {
        Papers papers = new Papers("출력할내용");
        Printable print = papers.getPrint();
        print.print();
    }
}
