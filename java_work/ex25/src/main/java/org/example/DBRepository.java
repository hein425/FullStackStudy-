package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBRepository {

    public List<Member> select(){

        List<Member> list = new ArrayList<>();

        Connection conn = null; // DB연결객체
        PreparedStatement pstmt = null; // sql객체
        ResultSet rs = null; // 반환되는 값 객체

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jhn",
                    "root",
                    "1234");

            pstmt = conn.prepareStatement("select * from member"); // sql 구문 작성
            rs = pstmt.executeQuery(); // sql 실행
            while(rs.next()){
                Member member = new Member();
                member.setAge(rs.getInt("age"));
                member.setIdx(rs.getInt("idx"));
                member.setEmail(rs.getString("email"));
                member.setName(rs.getString("name"));
                member.setPassword(rs.getString("password"));



                list.add(member);
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {

        }
        return null;
    }
}
