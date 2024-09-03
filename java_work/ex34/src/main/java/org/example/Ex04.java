package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        Path fp = Paths.get("d:a/b/mytest");
//
//        //파일 존재 유무
//        boolean test = Files.exists(fp);
//        System.out.println("파일존재유무 = "+ test);
//
//        if(!test)
//         fp = Files.createFile(fp);


        byte []buf = {0x15,0x16,0x17};
        System.out.println(Arrays.toString(buf));

        Files.write(fp,buf, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        byte[] buf2 = Files.readAllBytes(fp);
        System.out.println(Arrays.toString(buf2));
    }
    //  어제 배운 파일라이트, 오늘배운 파일s크리에잇 둘다 쓰이는데 전자가 많이쓰임
}
