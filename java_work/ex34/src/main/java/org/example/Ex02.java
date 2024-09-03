package org.example;
//파일만들기
//파일 경로 알아보자
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("d:/a/obj");

        System.out.println(path); //nio : 파일 경로를 다루는 자바패키지
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());

        Path pa1 = Paths.get("d:/a/b/c");
        Files.createDirectories(pa1); // 디렉토리의 생성(폴더 생성)
    }
}
