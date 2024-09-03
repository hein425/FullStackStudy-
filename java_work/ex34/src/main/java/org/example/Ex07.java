package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// Ex05 에서 한거 쓰는게 좀더 나은 방법같아 보임

public class Ex07 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("cc");

        try(DataOutputStream outputStream = new DataOutputStream(Files.newOutputStream(path))){
            outputStream.writeChar('K');
            outputStream.write(10); // 유니코드 줄바꿈
            outputStream.write(65); // 유니코드 A
            outputStream.write(10);
            outputStream.write(65);
        }catch(Exception e){
            e.printStackTrace();
        }


        // 위에거 아래거 같은거임 이건 IO java 기반
//        try(BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("aa")) ){
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }
}
