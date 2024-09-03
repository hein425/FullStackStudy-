package org.example;
// 버퍼랑 파일아웃풋이 생략되어 합쳐진것 바이트스트림(파일즈 객체.new아웃풋스트림 이런식으로 작성)
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
// 복사해보기
public class Ex06 {
    public static void main(String[] args) throws IOException {

        Path src = Paths.get("myfile");
        Path target = Paths.get("targetfile");

        Files.copy(src,target);

        Files.move(src,target, StandardCopyOption.REPLACE_EXISTING);
    }
}