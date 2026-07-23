package com.mnu.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConn {
	public static void main(String[] args) {
		//1. JDBC 드라이버 로딩 -- 오라클 사이트에서 다운(ojdbc8.jar)
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("오라클 드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		
		//2. Connection(java 와 oracle 연결 다리)
		try {
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:41521:xe", "c##test", "1234");
			System.out.println("Connection : " + conn);
			System.out.println("커넥션 연결 성공");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
			while(rs.next()) {
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getInt("manager") + "\t");
				System.out.print(rs.getString("hiredate") + "\t");
				System.out.print(rs.getInt("salary") + "\t");
				System.out.print(rs.getInt("commission") + "\t");
				System.out.print(rs.getInt("dno") + "\n");
			}
			
		}catch(Exception e) {
			System.out.println("커넥션 연결 실패");
		}
		//3. SQL 명령 수행
		
		//4. 종료
		
	}

}
