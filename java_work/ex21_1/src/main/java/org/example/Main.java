package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    * 1. mysql 드라이버, build.gradle 라이브러리
    * 2. connection
    * 3.statement
    */
    public static void main(String[] args) {
        try {
            // jar 파일 추가 확인
            Class.forName("com.mysql.cj.jdbc.Driver");
            // db 연결
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","12345678");
            // db구문만들기
            PreparedStatement pstmt = conn.prepareStatement("create table test (aa varchar(225), bb varchar(225))");
            //sql구문실행
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

