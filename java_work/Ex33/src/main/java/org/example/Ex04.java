package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// 문자 스트림의 이해와 활용
// 인풋스티림 - 리더.  아웃풋스트림 - 라이터.
// 파일 인풋 스트림 - 파일리더. 파일 아웃풋 스트림 - 파일라이터

public class Ex04 {
    public static void main(String[] args) throws Exception{

       BufferedWriter bw = new BufferedWriter(
                                new FileWriter("myfile",true) // 트루 적으면 글자 바뀌시 않고 추가됌
                                );

       bw.write("글자를 바꿀꺼야");
       bw.newLine();
       bw.write("바꼇냐?");
       bw.newLine();
       bw.write("셋하둘은둘셋하나");
       bw.close();

       BufferedReader fr = new BufferedReader(new FileReader("myfile"));

        // 파일리더 = 한문자씪 읽어오는거
        while(true){
            String str = fr.readLine();
            System.out.println(str);

            if(str==null)
                break;
        }

// 스트림 이용해서 바이트 단위 입출력 하기.
// 버퍼 달아줄수 있음
// 문자열 스트림 라이터와 리더는 유니코드 기준으로 작동.
//



    }
}