package com.self.study.zeroThreeZeroFour.jdbc;

public class ConnectInfo {

    // ip, port, id, pw 는 private로 관리하고 getter setter로 접근

    private String ip = "3.38.227.105";
    private String port = "3306";
    private String db = "TESTDB";
    private String id = "jimin";
    private String pw = "jimin";

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getdb() {
        return db;
    }

    public void setdb(String db) {
        this.db = db;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
