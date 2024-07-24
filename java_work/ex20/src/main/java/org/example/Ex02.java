package org.example;

class Board{}
class PBoard extends Board{}

public class Ex02 {
    public static void main(String[] args) {

        //실행중에 에러 그게 엑셉션
        Board board = new PBoard();
        PBoard pBoard = (PBoard) new Board();

        System.out.println("성공!");

    }
}
