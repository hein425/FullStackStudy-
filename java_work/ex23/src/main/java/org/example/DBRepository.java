package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBRepository {
//    1insert 2select 3update 4delete 만들어볼게

    //insert
    public void insert(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("이름입력");
            String name = sc.next();
            System.out.println("나이입력");
            int age = sc.nextInt();
            // 1.sql jar 추가 확인
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 커넥션 연결
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jhn",
                                                            "root",
                                                            "1234");
            System.out.println("연결성공");
            // 3. sql 작성
            PreparedStatement pstmt
                    =conn.prepareStatement("INSERT INTO member (name,age) VALUES (?,?);");
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            // 4. sql 실행
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void select(){
        System.out.println("셀렉트햐ㅐ야함");
    }

}
