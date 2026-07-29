package com.mnu.dbexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mnu.util.DBManager;

/*  JDBC Program
 *  1. jdbc 드라이버로딩
 *  2. Connection 객체 생성
 *  3. Statement(명령문 처리)
 *  4. close
 * 
 */
public class DbExam_01 {
	public static void main(String[] args) {
		Connection conn = null; //연결담당 
		PreparedStatement pstmt = null;// sql 명령문 처리 담당
		ResultSet rs = null; //Query 결과 저장
		
		conn = DBManager.getConnection();
		
		String sql="select * from dept";
		try {
			pstmt = conn.prepareStatement(sql);
			//pstmt = conn.prepareStatement("select * from dept");
			
			rs = pstmt.executeQuery();//명령셀행후 결과를 rs저장
			
			//결과 출력
			System.out.println("부서번호\t부서명\t지역명");
			while(rs.next()) {//rs에 값이 존재하면 반복
				System.out.print(rs.getInt("dno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("loc") + "\n");
			}
		
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
	}

}
