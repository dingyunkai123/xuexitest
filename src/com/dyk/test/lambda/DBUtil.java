package com.dyk.test.lambda;

import java.sql.*;
///DBUtil叫做数据库工具类（用于连接MySQL）
public class DBUtil {
    //1、连接配置项
    public static final String DriverName = "com.mysql.cj.jdbc.Driver"; //固定路径（lib目录下的jar包）
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/myDB?characterEncoding=utf-8"; //连接数据库emp
    public static final String USER = "root"; //用户名
    public static final String PWD = "dyknb123"; //密码

    //2、加载数据库驱动
    static {
        try {
            Class.forName(DriverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //3、连接方法
    public static Connection getConn() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    //4、关闭
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close(); //关闭连接
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //5、使用
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtil.getConn();
        String sql = "insert into n_custom_log VALUES('2','2','2','2','2','2023-03-17 12:35:00')";
        Statement statement = conn.createStatement();
        statement.execute(sql);
    }
}