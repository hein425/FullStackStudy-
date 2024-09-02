package org.example;

import java.io.FileReader;

// 문자 스트림의 이해와 활용
// 인풋스티림 - 리더.  아웃풋스트림 - 라이터.
// 파일 인풋 스트림 - 파일리더. 파일 아웃풋 스트림 - 파일라이터
public class Ex03 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("myfile");

        // 파일리더 = 한문자씪 읽어오는거
        while(true){
            int ch = fr.read();
            System.out.println(ch);
            System.out.println((char)ch);

            if(ch==-1)
                break;
        }

//        int ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);



    }
}
