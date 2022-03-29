package com.self.study.zeroThreeZeroFour.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {


        insert("jimin1", "유지민", "jimin", "지민", 0, 0);
    }

    public static void insert(String user_id , String name, String password, String nickname,
                              int question_set, int ranking_id){
        ConnectInfo info = new ConnectInfo();
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = String.format("jdbc:mysql://%s:%s/%s",info.getIp(),info.getPort(),info.getdb());
            conn = DriverManager.getConnection(url, info.getId(), info.getPw());
            System.out.println("Connect!");

            String sql = "INSERT INTO User VALUES (?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, user_id);
            pstmt.setString(2, name);
            pstmt.setString(3, password);
            pstmt.setString(4, nickname);
            pstmt.setInt(5, question_set);
            pstmt.setInt(6,ranking_id);


            int count = pstmt.executeUpdate();
            if( count == 0 ){
                System.out.println("Fail to INSERT data");
            }
            else{
                System.out.println("Success INSERT data");
            }
        }
        catch( ClassNotFoundException e){
            System.out.println("Fail to load Driver");
        }
        catch( SQLException e){
            System.out.println("ERROR : " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
                if( pstmt != null && !pstmt.isClosed()){
                    pstmt.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
    }
}