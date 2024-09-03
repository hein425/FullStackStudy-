package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//파일과 디렉토리의 생성과 소멸
public class Ex03 {
    public static void main(String[] args) throws IOException {

        // 파일 업로드 프로그램 만드는 경우 곤란해질수 있음

        Files.createFile(Paths.get("d:/a/b/myfile"));
        //첨엔 작동. 두번째는 이미 있어서 오류

        Files.createFile(Paths.get("d:/a/b/c/myfile"));


        Files.createDirectories(Paths.get("d:/a/bbb"));


    }
}
