package org.example;
// 필터 스트림 이해와 활용
// 버퍼링 기능을 제공하는 필터스트림
import java.io.*;

public class Ex02 {
    public static void main(String[] args) {

        // 파일내용쓰기. int double int
        try(DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream( // 버퍼링 기능 추가
                new FileOutputStream("mydata")))){
            dos.writeInt(4);
            dos.writeDouble(17.3);
            dos.writeInt(9);
        }catch (Exception e){
            e.printStackTrace();
        }

        //파일내용 읽기. int double int
        try(DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                new FileInputStream("mydata")))){
            int temp = dis.readInt();
            double temp2 = dis.readDouble();
            int temp3 = dis.readInt();
            System.out.println("temp = " + temp);
            System.out.println("temp2 = " + temp2);
            System.out.println("temp3 = " + temp3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
