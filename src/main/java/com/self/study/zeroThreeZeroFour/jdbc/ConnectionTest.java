package com.self.study.zeroThreeZeroFour.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest {
    public static void main(String[] args) {

        Connection conn = null;
        ConnectInfo info = new ConnectInfo();

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = String.format("jdbc:mysql://%s:%s/%s",info.getIp(),info.getPort(),info.getdb());
            conn = DriverManager.getConnection(url, info.getId(), info.getPw());
            System.out.println("Connect!");
        }
        catch(ClassNotFoundException e){
            System.out.println("Fail");
        }
        catch(SQLException e){
            System.out.println("ERRORs: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
    }
}