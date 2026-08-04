package com.mnu.exam04.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	public static Connection getConnection() {
		Connection conn = null;
		String myURL="jdbc:oracle:thin:@localhost:41521:xe";
		try {
			//1.JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//System.out.println("Oracle 드라이버 로딩 성공");
			
			//2. Connection 객체 생성
			conn = DriverManager.getConnection(myURL, "c##test", "1234");
			//System.out.println("커넥션 연결 성공");
			
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
