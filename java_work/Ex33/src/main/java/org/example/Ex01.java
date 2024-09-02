package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// 바이트 단위 입출 및 출력 스트림

public class Ex01 {
    public static void main(String[] args) {
        try(OutputStream os = new FileOutputStream("a.jpg");
            InputStream is = new FileInputStream("ccc.jpg"))
        {

            byte[] buf = new byte[1024]; //하나하나 읽지 말고 1024 바이트 한방에 읽고 해라.

            while (true){
                int data = is.read(buf);
                System.out.println(data);
                if(data == -1)
                    break;
                os.write(buf,0,data);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
