package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// 예외를 처리하거나 넘기거나
public class Ex03 {

    public static void md1(){ // 호출한곳에서 예외를 해결해라
        Path file = Paths.get("simple.txt");

        //BufferedWriter writer = null;

        // IO익셉션이 발생하기 때문에 try catch로 해라.
            try(BufferedWriter writer = Files.newBufferedWriter(file)) {
                writer.write('A');
                writer.write("문자열도 적오봄");
            }catch(Exception e){
                e.printStackTrace();
            }
//            finally{
//               try {
//                   if (writer != null)
//                       writer.close();
//               }catch(Exception e){
//                   e.printStackTrace();
//               }
//            }

    }

    public static void main(String[] args) {
        try {
            md1();
        } catch (Exception e) {
            System.out.println("파일 만들기 실패");
            throw new RuntimeException(e); // md1 에서 쓰로우로 떤져줘서 여기서 해결봄.
        }
    }
}
