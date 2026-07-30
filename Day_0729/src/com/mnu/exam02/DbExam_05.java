package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_05 {
	public static void main(String[] args) {
		//키보드로 부서번호 입력
		int dno = 50;
		String dname = "인사과";
		String loc= "서울";
		
		
		Connection conn  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="UPDATE DEPT SET DNAME=?, LOC=? WHERE DNO=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, dno);
			
			int row = pstmt.executeUpdate();//insert, update, delete
			System.out.println("수정된 로우 : " + row);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}

}
