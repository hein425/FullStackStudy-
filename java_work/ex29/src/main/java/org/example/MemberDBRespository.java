package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDBRespository {

    public List<Member> select(){
        List<Member> list = new ArrayList<>();

        Connection conn = null; //db연결객제
        PreparedStatement pstmt = null; //sql작성 객제
        ResultSet rs = null; // select 문 테이블 담는 객체

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jhn",
                                                "root",
                                                "1234");
            pstmt = conn.prepareStatement("select * from member");
            rs = pstmt.executeQuery();

            while(rs.next()){
                Member member = new Member(
                        rs.getInt("idx"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                list.add(member);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
        }
        return list;
    }
}
