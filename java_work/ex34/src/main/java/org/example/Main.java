package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//어제 했떤 버퍼 라이터 등 복습
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myfile"));
        bw.write(" 글자 잘 써진다");
        bw.newLine();
        bw.close(); //마이파일이 생기고 그안에 글자 써짐
    }
}